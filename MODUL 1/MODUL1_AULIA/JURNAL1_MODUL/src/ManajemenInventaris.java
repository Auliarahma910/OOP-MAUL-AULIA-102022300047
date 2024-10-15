// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner

import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftMakananKering = new ArrayList <>();
    ArrayList<MakananBasah> daftMakananBasah = new ArrayList <>();

    public void tambahMakananKering() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.println("masukkan nama makanan: ");
        String nama = scanner.nextLine();
        System.out.println("jumlah: ");
        String jumlah = scanner.nextLine();
        System.out.println("harga: ");
        String harga = scanner.nextLine();
        System.out.println("brand: ");
        String brand = scanner.nextLine();
        // Todo : Create a new object for MakananKering
        MakananKering makanan = new MakananKering(nama, 0, 0, brand);
        daftMakananKering.add(makanan);
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil ditambahkan");
    }

    public void tambahMakananBasah() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.println("Masukkan nama makanan: ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan jumlah makanan: ");
        String jumlah = scanner.nextLine();
        System.out.println("Masukkan harga makanan: ");
        String harga = scanner.nextLine();
        System.out.println("Masukkan bahan makanan: ");
        String bahan = scanner.nextLine();
        // Todo : Create a new object for MakananBasah
        MakananBasah makanan = new MakananBasah(nama, 0, 0, bahan);
        daftMakananBasah.add(makanan);        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan Basah berhasil ditambahkan");
    }

    public void tampilkanSemuaMakanan() {
        if (daftMakananKering.isEmpty() && daftMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    }
}
