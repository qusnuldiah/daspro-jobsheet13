import java.util.Scanner;
public class Array224 {
    private static int JUMLAH_MAHASISWA;
    private static int JUMLAH_MINGGU;
    
    private static String[] namaMahasiswa;
    private static int[][] nilaiMahasiswa;
    
    public static void main(String[] args) {
        inputNilaiMahasiswa();
        System.out.println("\nRekap Nilai Mahasiswa:");
        tampilkanNilaiMahasiswa();
        int mingguTertinggi = cariMingguTertinggi();
        System.out.println("Minggu dengan nilai tertinggi: " + mingguTertinggi);
        tampilkanMahasiswaTertinggi(mingguTertinggi);
    }
    
    public static void inputNilaiMahasiswa() {
        Scanner sc = new Scanner(System.in);
         int JUMLAH_MAHASISWA = 5;
         int JUMLAH_MINGGU = 7;
         String[] namaMahasiswa = {"sari", "rina", "yani", "dwi", "lusi"};
         int[][] nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];
    
    
        
         for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.println("Masukkan nilai mahasiswa " + namaMahasiswa[i] + ":");
            
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc.nextInt();
            }
            
            System.out.println();
        }
        sc.close();
    }
    
    public static void tampilkanNilaiMahasiswa() {
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.println("Nilai " + namaMahasiswa[i] + ":");
            
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.println("Minggu ke-" + (j + 1) + ": " + nilaiMahasiswa[i][j]);
            }
            
            System.out.println();
        }
    }
    
    public static int cariMingguTertinggi() {
        int mingguTertinggi = 0;
        int nilaiTertinggi = 0;
        
        for (int i = 0; i < JUMLAH_MINGGU; i++) {
            int nilaiMinggu = 0;
            
            for (int j = 0; j < JUMLAH_MAHASISWA; j++) {
                nilaiMinggu += nilaiMahasiswa[j][i];
            }
            
            if (nilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = nilaiMinggu;
                mingguTertinggi = i + 1;
            }
        }
        
        return mingguTertinggi;
    }
    
    public static void tampilkanMahasiswaTertinggi(int mingguTertinggi) {
        System.out.println("Mahasiswa dengan nilai tertinggi pada minggu ke-" + mingguTertinggi + ":");
        
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            if (nilaiMahasiswa[i][mingguTertinggi - 1] == cariNilaiTertinggi(mingguTertinggi)) {
                System.out.println(namaMahasiswa[i] + " (Nilai: " + nilaiMahasiswa[i][mingguTertinggi - 1] + ")");
            }
        }
    }
    
    public static int cariNilaiTertinggi(int minggu) {
        int nilaiTertinggi = 0;
        
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            if (nilaiMahasiswa[i][minggu - 1] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][minggu - 1];
            }
        }
        
        return nilaiTertinggi;
    }
}