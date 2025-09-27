import java.util.Scanner;
public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        final String kry = "KRY-";
        System.out.print("Masukkan Tahun Masuk: ");
        int tahunMasuk = sc.nextInt();
        
        System.out.print("Masukkan No urut: ");
        int noUrut = sc.nextInt();
        
        //cara 1
        String id1 = kry + "" + tahunMasuk +"-"+noUrut;
        // cara 2
        String id2 = kry + String.valueOf(tahunMasuk)+"-"+String.valueOf(noUrut);
        // cara ke 3
        String id3 = kry + Integer.toString(tahunMasuk)+"-"+Integer.toOctalString(noUrut);
        
        System.out.println("ID Karyawan (Cara 1): "+ id1);
        System.out.println("ID Karyawan (Cara 2): "+ id2);
        System.out.println("ID Karyawan (Cara 3): "+ id3);
    }
    
}
