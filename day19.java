public class day19 {
    public static void main(String[] args) {
        double nilaiUjianDouble = 85.9;
        int nilaiUjianInt = (int) nilaiUjianDouble; // desimal hilang
        System.out.println("Double ke Int (narrowing): " + nilaiUjianInt);

        int angkaBesar = 257;
        byte angkaKecil = (byte) angkaBesar; // overflow (wrap-around)
        System.out.println("Int 257 ke Byte (narrowing): " + angkaKecil);
        
        byte nilaiByte = 100;
        int nilaiInt = nilaiByte; // otomatis
        double nilaiDouble = nilaiInt; // otomatis
        System.out.println("Byte ke Int (widening): " + nilaiInt);
        System.out.println("Int ke Double (widening): " + nilaiDouble);

        byte overflowByte = (byte) 130; // 130 di luar jangkauan byte (-128..127)
        int besarDariKecil = overflowByte; // otomatis, tapi nilai sudah salah
        System.out.println("Byte overflow (130 jadi): " + overflowByte);
        System.out.println("Setelah ke Int tetap salah: " + besarDariKecil);
    }
}
