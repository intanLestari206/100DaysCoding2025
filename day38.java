
import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai: ");
        int nilai = sc.nextInt();
        
        if (nilai > 0) {
            System.out.println(nilai+" Adalah bilangan positif");   
        }else if(nilai < 0){
            System.out.println(nilai+" Adalah bilangan negatif");   
        }else{
            System.out.println(nilai+" Adalah angka NOL");   
        }
    }
    
}
