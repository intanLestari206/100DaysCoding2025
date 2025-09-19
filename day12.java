
import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("--- Program Input Biadata ---");
        System.out.println("Masukkan Nama Lengkap Anda : ");
        System.out.print("> ");
        String nama = sc.nextLine();
        System.out.println("Masukkan NIM Anda: ");
        System.out.print("> ");
        String nim = sc.nextLine();
        System.out.println("Masukkan Umur Anda: ");
        System.out.print("> ");
        int umur = sc.nextInt();
        System.out.println("Masukkan kelas (A/B/C)");
        System.out.print("> ");
        char kelas = sc.next().charAt(0);
        System.out.println("Masukkan IPK Anda: ");
        System.out.print("> ");
        double ipk = sc.nextDouble();
        
        System.out.println("=======================");
        System.out.println("   BIODATA MAHASISWA");
        System.out.println("=======================");
        System.out.println("Nama   : "+nama);
        System.out.println("NIM    : "+nim);
        System.out.println("Umur   : "+umur);
        System.out.println("Kelas  : "+kelas);
        System.out.println("IPK    : "+ipk);
    }
    
}
