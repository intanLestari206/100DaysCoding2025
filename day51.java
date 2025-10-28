import java.util.Scanner;
public class day51 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
      int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i +". " + a +" x "+ i +" = "+(i *a));
        }
      
      
    }
    
}
