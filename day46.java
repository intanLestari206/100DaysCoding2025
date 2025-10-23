import java.util.Scanner;
public class day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program Penentu Zodiak ===");
        System.out.print("Masukkan bulan kelahiran: ");
        int bulan = sc.nextInt();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = sc.nextInt();
       
        switch(bulan){
            case 1:
                System.out.println("Januari");
                if (tanggal >= 1 && tanggal <= 19) {
                    System.out.println("Zodioak Anda adalah Capricon");
                }else if(tanggal >= 20 && tanggal <= 31){
                    System.out.println("Zodioak Anda adalah Aquaris");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                break;
             case 2:
                System.out.println("Februari");
                if (tanggal >= 1 && tanggal <= 18) {
                    System.out.println("Zodioak Anda adalah Aquaris");
                }else if(tanggal >= 19 && tanggal <= 29){
                    System.out.println("Zodioak Anda adalah Pisces");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                break;
             case 3:
                System.out.println("Maret");
                if (tanggal >= 1 && tanggal <= 20) {
                    System.out.println("Zodioak Anda adalah Pisces");
                }else if(tanggal >= 20 && tanggal <= 31){
                    System.out.println("Zodioak Anda adalah Aries");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                 break;
             case 4:
                System.out.println("April");
                if (tanggal >= 1 && tanggal <= 19) {
                    System.out.println("Zodioak Anda adalah Aries");
                }else if(tanggal >= 20 && tanggal <= 31){
                    System.out.println("Zodioak Anda adalah Taurus");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                break;
             case 5:
                System.out.println("Mei");
                if (tanggal >= 1 && tanggal <= 19) {
                    System.out.println("Zodioak Anda adalah Taurus");
                }else if(tanggal >= 20 && tanggal <= 31){
                    System.out.println("Zodioak Anda adalah Gemini");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                break;
             case 6:
                System.out.println("Juni");
                if (tanggal >= 1 && tanggal <= 19) {
                    System.out.println("Zodioak Anda adalah Gemini");
                }else if(tanggal >= 20 && tanggal <= 31){
                    System.out.println("Zodioak Anda adalah Cancer");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                break;
             case 7:
                System.out.println("Juli");
                if (tanggal >= 1 && tanggal <= 19) {
                    System.out.println("Zodioak Anda adalah Gemini");
                }else if(tanggal >= 20 && tanggal <= 31){
                    System.out.println("Zodioak Anda adalah Cancer");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                break;
             case 8:
                System.out.println("Agustus");
                if (tanggal >= 1 && tanggal <= 18) {
                    System.out.println("Zodioak Anda adalah Aquaris");
                }else if(tanggal >= 19 && tanggal <= 29){
                    System.out.println("Zodioak Anda adalah Pisces");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                break;
             case 9:
                System.out.println("September");
                if (tanggal >= 1 && tanggal <= 20) {
                    System.out.println("Zodioak Anda adalah Pisces");
                }else if(tanggal >= 20 && tanggal <= 31){
                    System.out.println("Zodioak Anda adalah Aries");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                 break;
             case 10:
                System.out.println("Oktober");
                if (tanggal >= 1 && tanggal <= 19) {
                    System.out.println("Zodioak Anda adalah Aries");
                }else if(tanggal >= 20 && tanggal <= 31){
                    System.out.println("Zodioak Anda adalah Taurus");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                break;
             case 11:
                System.out.println("November");
                if (tanggal >= 1 && tanggal <= 19) {
                    System.out.println("Zodioak Anda adalah Taurus");
                }else if(tanggal >= 20 && tanggal <= 31){
                    System.out.println("Zodioak Anda adalah Gemini");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                break;
             case 12:
                System.out.println("Desember");
                if (tanggal >= 1 && tanggal <= 21) {
                    System.out.println("Zodioak Anda adalah Gemini");
                }else if(tanggal >= 22 && tanggal <= 31){
                    System.out.println("Zodioak Anda adalah Cancer");       
                }else{
                    System.out.println("Tanggal tidak valid");
                }
                break;
            default:
                System.out.println("Bulan tidak valid");
        }
    }
    
}
