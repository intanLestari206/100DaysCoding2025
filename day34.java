import java.util.Scanner;
public class day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Sistem Seleksi Beasiswa ====");
        System.out.print("Masukkan IPK Anda: ");
        double ipk = sc.nextDouble();
        System.out.print("Masukkan Jumlah kegiatan: ");
        int kegiatan = sc.nextInt();
        System.out.print("Apakah Anda mempunyai sertifikat nasional? ");
        boolean sertifikat = sc.nextBoolean();
        System.out.print("Apakah Anda termasuk keluarga kurang mampu? ");
        boolean status = sc.nextBoolean();
        
        boolean SyaratUtama = (ipk >= 3.2) && (kegiatan >= 2);
        boolean SyaratBonus = sertifikat || (status && ipk >=3.5);
        boolean seleksi = (SyaratUtama)&&(SyaratBonus);
        System.out.println("===================");
        System.out.printf("%-13s : %-7b %n","Syarat Utama",SyaratUtama);
        System.out.printf("%-13s : %-7b %n","Syarat Bouus",SyaratBonus);
        System.out.printf("%-13s : %-7b %n","Lolos Seleksi",seleksi);
        
    }
    
}
