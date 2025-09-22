public class day15 {
    public static void main(String[] args) {
        String Nilai1 = "30";
        String Nilai2 = "2006";
        String Nilai3 = "30.0";
        String Nilai4 = "5.0";
        
        int s = Integer.parseInt(Nilai1);
        short a = Short.parseShort(Nilai2);
        double t = Double.parseDouble(Nilai3);
        float u = Float.parseFloat(Nilai4);
        
        System.out.println("Hasil sebelum Parse: ");
        String sebelumParse =Nilai1+Nilai2;
        System.out.println("Nilai 1 + Nilai 2 : "+(sebelumParse));
        
        System.out.println("Hasil Setelah Parse: ");
        System.out.println("Nilai 1 : "+s);
        System.out.println("Nilai 2 : "+a);
        System.out.println("Nilai 3 : "+t);
        System.out.println("Nilai 4 : "+u+"\n");
        
        System.out.println("Operator setelah parse");
        System.out.println("Nilai 1 + Nilai 2: "+(s + a));
        System.out.println("Nilai 3 - Nilai 4: "+(t - u));
        
        
        
    }
    
}
