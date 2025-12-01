public class day85 {
    public static void main(String[] args) {
        String []nama = {"Ai", "Zerlina", "Aika", "Kayla", "Yanto"};
        System.out.println("---  Daftar Nama ---");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }
        System.out.println("-------------------");
        String namaTerakhir = nama[0];
        for (int i = 1; i < nama.length; i++) {
            if (nama[i].compareTo(namaTerakhir)>0) {
                namaTerakhir = nama[i];
            }  
        }
        System.out.println("Siswa Absen Terakhir (Max): "+namaTerakhir);
    }
}
