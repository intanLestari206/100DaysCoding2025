import java.util.Scanner;
public class day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai: ");
        int nilai = sc.nextInt();
        if (nilai % 2 == 0) {
            System.out.println(nilai +" Adalah Bilangan genap");
        }else{
            System.out.println(nilai+" Adalah Bilangan Ganjil");
        }
    }
    
}
