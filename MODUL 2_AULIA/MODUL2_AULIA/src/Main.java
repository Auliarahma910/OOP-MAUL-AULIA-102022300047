public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(5, "warnet gaming x", 5000);

        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();
        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP(15, "warnet gaming x", 70000, true);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.Informasi();
        System.out.println();
        // To do: Panggillah Method Login
        komputerVIP.Login("Asep");
        System.out.println();
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium

        // To do: Panggillah Method Informasi dari class KomputerPremium

        // To do: Panggillah Method Pesan

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       
    }
}