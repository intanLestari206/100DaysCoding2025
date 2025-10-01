import java.util.Scanner;
public class day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Jari-jari Lingkaran: ");
        double r = sc.nextDouble();
        final double phi = 3.14;
        double luas = phi*(r*r);
        System.out.println("Luas lingkaran dari jari jari "+r+" adalah "+luas);
    }
    
}
