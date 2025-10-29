import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rahasia = 7, tebakan = 0;

        System.out.println("Tebak angka rahasia (1-10): ");
        while (tebakan != rahasia) {
            System.out.print("Salah! Silahkan coba lagi: ");
            tebakan = sc.nextInt();
        }
        System.out.println("Selamat, tebakan Anda benar!");
    }
}
