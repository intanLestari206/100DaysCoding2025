import java.util.Scanner;
public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji kotor bulanan: Rp ");
        double gajiKotor = sc.nextDouble();

        double pajak = gajiKotor * 0.05;
        double gajiBersih = gajiKotor - pajak;

        System.out.println("\n=== Rincian Gaji ===");
        System.out.printf("Gaji Kotor : Rp %.2f\n", gajiKotor);
        System.out.printf("Potongan Pajak (5%%): Rp %.2f\n", pajak);
        System.out.printf("Gaji Bersih: Rp %.2f\n", gajiBersih);

    }
    
}
