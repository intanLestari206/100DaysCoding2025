public class day18 {
    public static void main(String[] args) {
        int hargaBarang = 150000;
        double pajak = 16500.50;
        double hargarBarangdesimsl = hargaBarang;
        double totalBayar = pajak + hargarBarangdesimsl;
        System.out.println(totalBayar);
    }
    
}

// latihan 
public class day018 {
    public static void main(String[] args) {
        int roti = 16500;
        int susu = 65000;
        int beras = 55000;
        int minyak = 43500;
        int frozen = 20000;

        int totalBelanja = (roti * 1) + (susu * 1) + (beras * 1) 
                         + (minyak * 1) + (frozen * 6);

        double pajakTotal = totalBelanja * 0.10;
        double pajakPerBarang = totalBelanja * 0.01 ;

        double HargaTotal = totalBelanja + pajakTotal + pajakPerBarang;

        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Pajak 10%     : Rp " + pajakTotal);
        System.out.println("Pajak Barang  : Rp " + pajakPerBarang);
        System.out.println("Total Harga   : Rp " + HargaTotal);
    }
}
