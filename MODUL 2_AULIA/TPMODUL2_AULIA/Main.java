public class Main {
    public static void main(String[] args) {
        // Membuat objek kucing dengan detail tertentu
        Kucing kucing = new Kucing("Momo", 2, "Persia");
        System.out.println("Detail Hewan\n");
        
        System.out.println("ini adalah " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan");
        System.out.println();

        Burung burung = new Burung("Rio", 1, "Hijau");
        System.out.println("ini adalah " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("biji-bijian");
        System.out.println();

        kucing.infoHewan(); 
        burung.infoHewan(); 
    }
}
