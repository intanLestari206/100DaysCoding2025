import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        System.out.println("=== Pusat Informasi Kampus Universitas Sulawesi Barat ===");
        System.out.println("1. Jadwal Kuliah");
        System.out.println("2. Jadwal Ujian");
        System.out.println("3. Layanan Akademik");
        System.out.println("4. Keluar dari Sistem");

        while (true) {
            System.out.print("\nPilih menu (1-4): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Jadwal Kuliah: Senin–Jumat, pukul 08.00–16.00 WITA.");
                    break;
                case 2:
                    System.out.println("Jadwal Ujian: Mulai tanggal 2 Desember 2025.");
                    break;
                case 3:
                    System.out.println("Layanan Akademik: Silakan hubungi BAAK atau dosen PA.");
                    break;
                case 4:
                    System.out.println("Terima kasih! Sampai jumpa di portal kampus");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }

            if (pilihan == 4) {
                break; // keluar dari perulangan
            }
        }
    }
}
