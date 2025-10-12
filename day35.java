import java.util.Scanner;
public class day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Sistem Izin Keluar Asrama ===");
        System.out.print("Apakah kamu sudah mendapat izin dari ketua asrama? (true/false): ");
        boolean izin = sc.nextBoolean();

        System.out.print("Apakah kamu sedang ada tugas diluar atau kegiatan khusus? (true/false): ");
        boolean adaKegiatan = sc.nextBoolean();

        System.out.print("Sekarang jam berapa? (format 24 jam, contoh: 22 untuk jam 10 malam): ");
        int jam = sc.nextInt();

        System.out.println("----------------------------------------");

        if (izin && (jam < 23 || adaKegiatan)) {
            System.out.println("Kamu boleh keluar asrama. Hati-hati di djalan!");
        } else {
            System.out.println("Kamu tidak boleh keluar asrama.");
        }

        System.out.println("----------------------------------------");
        System.out.println("Izin dari ketua asrama : " + izin);
        System.out.println("Ada kegiatan/tugas     : " + adaKegiatan);
        System.out.println("Jam sekarang           : " + jam);

    }
    
}
