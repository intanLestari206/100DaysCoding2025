
import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah Anda anggota Premium?: ");
        boolean premium = sc.nextBoolean();
        System.out.print("Apakah anda memiliki undangan khusus?: ");
        boolean undangan = sc.nextBoolean();
        boolean dapatAksesVIP = premium == true || undangan == true;
        
        System.out.println("Apakah Anda Mendapatkan Akses VIP?: "+dapatAksesVIP);
    }
}
