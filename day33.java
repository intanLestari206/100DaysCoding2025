import java.util.Scanner;
public class day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Cek Kelayakan Wawancara ===");
        System.out.print("Apakah Anda sudah mengirim CV?: ");
        boolean kirimCV = sc.nextBoolean();

        System.out.print("Apakah Anda direkomendasikan oleh perusahaan lain? : ");
        boolean direkomendasikan = sc.nextBoolean();
        boolean bolehWawancara = kirimCV || (!kirimCV && direkomendasikan);

        System.out.println("\n==============================");
        System.out.println("Status Kelayakan Wawancara:");
        System.out.println("Sudah kirim CV      : " + kirimCV);
        System.out.println("Direkomendasikan    : " + direkomendasikan);
        System.out.println("------------------------------");
        System.out.println("Boleh wawancara?    : " + bolehWawancara);
        System.out.println("==============================");
    }
}

