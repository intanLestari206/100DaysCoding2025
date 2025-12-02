public class day86 {
    public static void main(String[] args) {
        String nama[] = {"Ai", "Zerlina", "Aika", "Kayla", "Yanto"};
        String min = nama[0];
        System.out.println("--- Daftar Nama ---");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }
        
        for (int i = 1; i < nama.length; i++) {
            if (nama[i].compareTo(min)<0) {
                min = nama[i];
            }
        }
        System.out.println("Siswa Absen Pertama (Min): "+min);
    }
    
}
