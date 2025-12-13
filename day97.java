
import java.util.Scanner;

public class day97 {
    static int hitungLuasPersegi(int sisi){
        return sisi*sisi;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi: ");
        int a = sc.nextInt();
        int luas = hitungLuasPersegi(a);
        System.out.println("Luas persegi: "+luas);
    }
    
}
