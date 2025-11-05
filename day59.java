import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka (N): ");
        int N = input.nextInt();

        System.out.print("\nAngka Genap: ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) { 
                System.out.print(i + " ");
            }
        }

        System.out.print("\nAngka Ganji: ");
        for (int i = 1; i <= N; i+=2) {
                System.out.print(i + " ");
            }
        }

        
    }
