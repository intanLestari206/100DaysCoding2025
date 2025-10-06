
import java.util.Scanner;
public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wahana Adrenalin");
        System.out.print("Masukkan Tinggi badan: ");
        int tinggi = sc.nextInt();
        System.out.print("Masukkan Berat badan: ");
        int berat = sc.nextInt();
        
        boolean stinggi = tinggi > 150;
        boolean sberat = berat > 80;
        
        System.out.println("Tinggi badan : "+ tinggi+" cm");
        System.out.println("Berat badan : "+ berat+" kg");
        System.out.println("Apakah tinggi Badan sesuai ? "+stinggi);
        System.out.println("Apakah berat Badan sesuai ? "+sberat);
        System.out.println("Apakah bisa masuk ? "+ (stinggi && sberat));
    }
    
}
