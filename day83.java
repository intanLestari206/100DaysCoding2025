import java.util.Scanner;
public class day83 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("--- Rincian Pengeluaran ---");
         int data [] = new int[7];
         int sum = 0;
         for (int i = 0; i < data.length; i++) {
             System.out.print("Hari ke-"+(i+1)+": ");
             data[i]= sc.nextInt();
             sum += data[i];
        }
       
        System.out.println("Total: "+sum);
    }
}
