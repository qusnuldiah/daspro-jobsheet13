import java.util.Scanner;
public class Kubus24 {

    static double hitungVolumeKubus(double sisi) {
        return Math.pow(sisi, 3);
    }

    static double hitungLuasPermukaanKubus(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        double volume = hitungVolumeKubus(sisi);
        System.out.println("Volume Kubus: " + volume);

        double luasPermukaan = hitungLuasPermukaanKubus(sisi);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);

        input.close();
    }
}