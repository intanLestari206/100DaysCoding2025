import java.util.Scanner;
public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Selamat Datang di Cafe JavaRasa ===");
        System.out.println("Silakan pilih menu minuman:");
        System.out.println("1. Es Teh Manis     - Rp 5.000");
        System.out.println("2. Es Jeruk Segar   - Rp 7.000");
        System.out.println("3. Kopi Susu Hangat - Rp 8.000");
        System.out.println("4. Coklat Panas     - Rp 9.000");
        System.out.println("=======================================");
        System.out.print("Masukkan nomor pilihan Anda: ");
        int pilihan = sc.nextInt();
        
        if (pilihan == 1) {
            System.out.println("Anda memesan es teh dengan harga 5.000");
        }else if(pilihan == 2){
            System.out.println("Anda memesan es Jeruk segar dengan harga 7.000");
        }else if(pilihan == 3){
            System.out.println("Anda memesan Kopi susu hangat dengan harga 8.000");
        }else if(pilihan == 4){            
            System.out.println("Anda memesan Coklat panas dengan harga 9.000");
        }else{
            System.out.println("Pilihlan tidak valid");
        }
    }
    
}
