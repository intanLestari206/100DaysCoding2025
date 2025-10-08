import java.util.Scanner;
public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai tes logika: ");
        int tes = sc.nextInt();
        System.out.print("Masukkan pengalaman koding(tahun): ");
        int coding = sc.nextInt();
        
        boolean diterima = (tes >= 80 ) && ( coding > 2);
         System.out.println("------------------------------------");
        System.out.println("Nilai Tes Logika: " + tes);
        System.out.println("Pengalaman Coding: " + coding + " tahun");
        System.out.println("Apakah memenuhi semua syarat? " + diterima);
    }
    
}
