import java.util.Scanner;
public class day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Umur: ");
        int umur = sc.nextInt();
        System.out.println("=== Syarat Kategori ===");
        boolean minimal = umur >= 1;
        boolean maksimal = umur <= 5;
        System.out.println("Apakah syarat minimalnya terpenuhi:  "+minimal);
        System.out.println("Apakah syarat maksimalnya terpenuhi:  "+maksimal);
        System.out.println("Apakah dia termasuk kategori balita?:  "+(minimal & maksimal));
        
        
    }
    
}
