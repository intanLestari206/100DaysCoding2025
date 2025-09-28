import java.util.Scanner;
public class day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nilai a = ");
        int a=sc.nextInt();
        System.out.print("Masukkan Nilai b = ");
        int b=sc.nextInt();
        System.out.println("Sebelum Ditukar :");
        System.out.println("Nilai a = "+ a);
        System.out.println("Nilai b = "+ b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Setelah Ditukar :");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = "+ b);
    }
    
}
