import java.util.Scanner;
public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== soal no 1 ===");
        System.out.print("P: ");
        int p = sc.nextInt();
        System.out.print("L: ");
        int l = sc.nextInt();
        int sisi = 2 * 2;
        int u = (p*l)/sisi;
        System.out.println(u);
        
        System.out.println("=== soal no 2 ===");
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
