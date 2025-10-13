import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Keamanan Ruang Server Utama ===");
        System.out.print("Apakah Anda memiliki kartu akses yang valid? (true/false): ");
        boolean kartuAkses = sc.nextBoolean();

        if (kartuAkses) {
            System.out.print("===Kartu Akses Valid===\nApakah Anda sedang dalam jadwal piket hari ini? (true/false): ");
            boolean jadwalPiket = sc.nextBoolean();

            if (jadwalPiket) {
                System.out.print("Masukkan kode PIN keamanan: ");
                int kodePin = sc.nextInt();

                if (kodePin == 1234) {
                    System.out.println("Akses diterima! Selamat datang di ruang server utama.");
                } else {
                    System.out.println("Kode PIN salah. Akses ditolak!");
                }

            } else {
                System.out.println("Anda tidak terdaftar dalam jadwal piket hari ini!");
            }

        } else {
            System.out.println("Anda tidak memiliki kartu akses yang valid!");
        }

    }
    
}
