public class day54 {
    public static void main(String[] args) {
        System.out.println("=== FOR LOOP: Cetak angka 1-20 tanpa kelipatan 4 ===");

        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }System.out.println("");
        
        System.out.println("=== WHILE LOOP: Cetak angka 1-15 tanpa angka ganjil ===");

        int j = 1;
        while (j <= 15) {
            if (j % 2 != 0) { 
                j++; 
                continue; 
            }
            System.out.print(j + " ");
            j++;
        }
        System.out.println("");
    }
}
