public class day2 {
    public static void main(String[] args) {

        // No 1
        System.out.println("No 1");
        System.out.println("Saya akan bertahan selama 100 Hari Ngoding, dan akan menjadi anggota resmi ISC");
        System.out.println("");

        // No 2
        System.out.println("No 2");
        System.out.print("Selamat telah menjadi anggota");
        System.out.print(" ISC");
        System.out.println();

        // No 3
        System.out.println("No 3");
        String nama = "Intan Lestari";
        String NIM  = "D0224306";
        char kelas  = 'A';
        int umur    = 19;
        double TB   = 158;

        System.out.printf("| %-13s : %-15s |%n","Nama ", nama);
        System.out.printf("| %-13s : %-15s |%n", "NIM", NIM);
        System.out.printf("| %-13s : %-15c |%n", "kelas", kelas);
        System.out.printf("| %-13s : %-15d |%n", "umur",umur);
        System.out.printf("| %-13s : %-15.1f |%n", "Tinggi Badan",TB);
    }
}
