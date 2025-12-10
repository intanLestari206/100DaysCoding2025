
public class day94{
     void garisPembatas() {
        System.out.println("==============================");
    }

     void kotakNama(String nama) {
        System.out.println("|   Welcome, Player " + nama + "    |");
    }
    public static void main(String[] args) {
        day94 n = new day94();
        n.garisPembatas();
        n.kotakNama("Intan");
        n.garisPembatas();
        System.out.println("Menu Pilihan:");
        System.out.println("1. New Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");
        n.garisPembatas();
    }
}
