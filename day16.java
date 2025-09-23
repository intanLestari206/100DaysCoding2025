import java.util.Scanner;
public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Bus: ");
        int bus = sc.nextInt();
        final int kapasitas = 50;
        final int biaya = 7500000;
        int totalKapasitas = bus*kapasitas;
        int totalBiaya = bus * biaya;
        int biayaRata = totalBiaya / kapasitas;
        System.out.println("Total Kapasitas: "+totalKapasitas);
        System.out.println("Biaya per kursi/penumpang: "+biayaRata);
    }
}
