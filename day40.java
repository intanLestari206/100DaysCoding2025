import java.util.Scanner;
public class day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan operator bilangan: ");
        char o = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        int hasil ;
        if (o == '+') {
            hasil = a + b;
            System.out.println(a+" + "+b+" = "+hasil);
        }else if (o == '-'){
            hasil = a - b;
            System.out.println(a+" - "+b+" = "+hasil); 
        }else if (o == '/'){
            if (b == 0) {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            }else{hasil = a / b;
            System.out.println(a+" / "+b+" = "+hasil); 
            }
        }else if (o == '*'){
            hasil = a * b;
            System.out.println(a+" * "+b+" = "+hasil); 
        }else if (o == '%'){
            hasil = a % b;
            System.out.println(a+" % "+b+" = "+hasil); 
        }else{
            System.out.println("operator tidak tersedia");
        }
    }
    
}
