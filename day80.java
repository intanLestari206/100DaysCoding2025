public class day80 {
    public static void main(String[] args) {
        String[] makanan = {
            "Ayam Goreng",
            "Martabak Manis",
            "Gado-gado",
            "Sate Padang",
            "Bakso"
        };
        System.out.println("Makanan Juara: " + makanan[0]);
        System.out.println("Makanan Terakhir: " + makanan[4]);
        System.out.println("Wah, saya bosan dengan " + makanan[2] + ". Ganti jadi Nasi Padang.");
        makanan[2] = "Nasi Padang";
        System.out.println("Makanan ke-3 sekarang: " + makanan[2]);
        System.out.println("Total menu: " + makanan.length);
    }
}

