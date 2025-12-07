public class day91 {
    public static void hitungGaji(String nama, int jumlahJamKerja) {
        int gaji = jumlahJamKerja * 50000;
        System.out.println("Karyawan " + nama +
                           " bekerja " + jumlahJamKerja +
                           " jam, mendapatkan gaji Rp " + gaji);
    }
    public static void main(String[] args) {
        hitungGaji("intan", 10);
        hitungGaji("irda", 5);
    }
}
