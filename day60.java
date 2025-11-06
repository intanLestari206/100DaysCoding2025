import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka (N): ");
        int N = input.nextInt();

        System.out.print("\nAngka Ganjil : ");
        
        for (int i = N - 1; i >= 1; i--) {
            if (i % 2 == 1) { 
                System.out.print(i + " ");
            }
        }

        System.out.print("\nAngka Genap : ");
      
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
      
    }
}
