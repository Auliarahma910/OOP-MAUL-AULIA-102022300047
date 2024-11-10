public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Nobi", 1, "British shorthair");
        System.out.println("Detail Hewan\n");
        
        System.out.println("ini adalah " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan");
        System.out.println();

        Burung burung = new Burung("Emon", 1, "putih");
        System.out.println("ini adalah " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("biji-bijian");
        System.out.println();

        kucing.infoHewan(); 
        burung.infoHewan(); 
    }
}
