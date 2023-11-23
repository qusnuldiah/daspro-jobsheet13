public class TerimaKasih24 {

public static void UcapkanTerimakasih() {
    System.out.println("Thank you for being the best in the world.\n"+ 
    "You inspired in me a love for learning and made me feel like I could ask you anything.");    
}

public static void UcapanTambahan(String ucapan){
    System.out.println(ucapan);
}

public static void main(String[] args) {
    UcapkanTerimakasih();
    String ucapan = "Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
    UcapanTambahan(ucapan);
}
}