import java.util.Scanner;

public class CivitasAkademik {
    private String nama;
    private String nik;
    private String status;
    private String jenisKelamin;
    private double pendapatan;

    public CivitasAkademik(String nama, String nik, String status, String jenisKelamin) {
        this.nama = nama;
        this.nik = nik;
        this.status = status;
        this.jenisKelamin = jenisKelamin;

        // Menghitung pendapatan
        double pendapatanPokok = jenisKelamin.equals("Perempuan") ? 5000 : 6000;
        double tunjangan = (status.equals("Menikah") ? (jenisKelamin.equals("Laki-laki") ? 25000 : 20000) : 15000);
        pendapatan = pendapatanPokok + tunjangan;
    }

    public void tampilkanInfo() {
        System.out.println("\n--- Civitas Akademik ---");
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Masukkan status: ");
        String status = scanner.nextLine();
        System.out.print("Masukkan jenis kelamin: ");
        String jenisKelamin = scanner.nextLine();

        CivitasAkademik civitas = new CivitasAkademik(nama, nik, status, jenisKelamin);
        civitas.tampilkanInfo();
        scanner.close();
    }
}
