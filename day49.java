import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Eksperimen Operator Ternary ===");

        // 1. Contoh pada tipe data String
        System.out.print("Masukkan umur kamu: ");
        int umur = sc.nextInt();
        String minuman = (umur >= 18) ? "Kopi" : "Susu Cokelat";
        System.out.println("Karena umurmu " + umur + " tahun, kamu dapat: " + minuman);

        // 2. Contoh pada tipe data int (angka)
        System.out.print("Masukkan angka pertama: ");
        int b = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int c = sc.nextInt();
        int terbesar = (b > c) ? b : c;
        System.out.println("Nilai terbesar antara " + b + " dan " + c + " adalah: " + terbesar );

        // 3. Contoh pada tipe data boolean
        System.out.print("Apakah kamu sudah makan? (true/false): ");
        boolean sudahMakan = sc.nextBoolean();
        boolean lapar = (!sudahMakan) ? true : false;
        System.out.println("Apakah kamu lapar? " + lapar);

        // 4 Menentukan waktu makan
        System.out.print("Masukkan jam sekarang (0-23): ");
        int jam = sc.nextInt();
        String waktuMakan = (jam < 10) ? "Sarapan" :
                            (jam < 15) ? "Makan Siang" :
                            (jam < 21) ? "Makan Malam" :
                                         "Tidur aja, udah malam!";
        System.out.println("Sekarang waktunya: " + waktuMakan);

    }
}
