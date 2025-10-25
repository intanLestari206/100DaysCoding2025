import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== KALKULATOR SWITCH-CASE ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /,%): ");
        char operator = sc.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();

        double hasil = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 == 0) {
                    System.out.println("\nError: Pembagian dengan nol tidak diperbolehkan!");
                    valid = false;
                } else {
                    hasil = angka1 / angka2;
                }
                break;
            case '%':
                if (angka2 == 0) {
                    System.out.println("\nError: modulo dengan nol tidak diperbolehkan!");
                    valid = false;
                } else {
                    hasil = angka1 % angka2;
                }
                break;
            default:
                System.out.println("\nOperator tidak dikenali. Gunakan +, -, *, %, atau /.");
                valid = false;
        }

        if (valid) {
            System.out.println("\n=== HASIL PERHITUNGAN ===");

            // Jika hasil bilangan bulat sempurna, tampilkan tanpa koma
            if (hasil % 1 == 0)
                System.out.println("Hasil: " + (int) hasil);
            else
                System.out.println("Hasil: " + hasil);
        }

    }
}
