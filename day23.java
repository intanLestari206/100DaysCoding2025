import java.util.Scanner;
public class day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan Lebar:");
        int lebar = sc.nextInt();
        
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang dari panjang "+panjang+" cm dan lebar "+lebar+" cm adalah "+luas+" cm.");
            }
    
}
