import java.util.Scanner;

public class day99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas atas angka: ");
        int n = input.nextInt();
        System.out.println("Deretan Bilangan Prima 1 - " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
