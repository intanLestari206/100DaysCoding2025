import java.util.Scanner;
public class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama Lengkap : ");
        String nama = sc.nextLine();
        
        System.out.print("Umur : ");
        byte umur = sc.nextByte();
        
        System.out.print("Tahun Lahir : ");
        short lahir = sc.nextShort();
        
        System.out.print("3 Angka terakhir nim : ");
        int nim = sc.nextInt();
        
        System.out.print("No Telepon : ");
        long no = sc.nextLong();
        
        System.out.print("Tinggi Badan : ");
        float tinggi = sc.nextFloat();
        
        System.out.print("Berat Badan : ");
        double berat = sc.nextDouble();
        
       System.out.print("Apakah sudah aktif kuliah? (true/false): ");
       boolean Aktif = sc.nextBoolean();
       sc.nextLine();
        System.out.print("Masukkan minimal 3 huruf : ");
        String huruf = sc.nextLine();
        char hurufKetiga = huruf.charAt(2);
     
        System.out.println("\n====selasai====\n");
        

        
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tahun Lahir: " + lahir);
        System.out.println("3 Angka terakhir NIM: " + nim);
        System.out.println("Nomor Telepon: " + no);
        System.out.println("Tinggi Badan : " + tinggi);
        System.out.println("Berat Badan: " + berat);
        System.out.println("Status Kuliah: " + Aktif);
        System.out.println("Huruf ke-3 dari input adalah: " + hurufKetiga);
    }
    
}
