import java.util.Scanner;
public class day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  
        System.out.print("Jumlah Total Permen: ");
        int p = sc.nextInt();
        System.out.print("Jumlah Murid: ");
        int m = sc.nextInt();
        
        int BanyakPermen = p / m;
        int SisaPermen = p % m;
        System.out.println("Banyak Permen yang diterima setiap murid: "+BanyakPermen);
        System.out.println("Permen yang tersisa: "+SisaPermen);
        
        
    }
    
}
