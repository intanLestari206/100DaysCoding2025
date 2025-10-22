import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM HARI ===");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.println("=============================");
       
        System.out.print("Masukkan angka(1-7): ");
        int angka = sc.nextInt();
        String day;
        switch(angka){
            case 1:
                day = "Sekarang adalah hari Senin";
                break;
            case 2:
                day = "Sekarang adalah hari Selasa";
                break;
            case 3:
                day = "Sekarang adalah hari Rabu";
                break;
            case 4:
                day = "Sekarang adalah hari Kamis";
                break;
            case 5:
                day = "Sekarang adalah hari Jum'at";
                break;
            case 6:
                day = "Sekarang adalah hari Sabtu";
                break;
            case 7:
                day = "Sekarang adalah hari Minggu";
                break;
            default:
                day = "Jumlah Hari Hanya 7!";
        }
        System.out.println(day);
    }
}
