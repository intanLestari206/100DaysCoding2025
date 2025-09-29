import java.util.Scanner;
public class day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Menghuitung Luas Persegi");
        System.out.print("Masukkan Sisi: ");
        int sisi = sc.nextInt();
        int luas = sisi*sisi;
        System.out.println("SisiPersegi : "+ sisi);
        System.out.println("Luas Persgi : "+luas);
    }
    
}
