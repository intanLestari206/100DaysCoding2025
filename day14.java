public class day14 {
    public static void main(String[] args) {
      String Sint = "123";
      String Sbyte = "100";
      String Sshort = "400";
      String Slong = "1200000";
      String Sfloat = "3.23";
      String Sdouble = "112.23";
      String Sboolean = "true";
      
      int Iint = Integer.parseInt(Sint);
      byte Ibyte = Byte.parseByte(Sbyte);
      short Ishort = Short.parseShort(Sshort);
      long Ilong = Long.parseLong(Slong);
      float Ifloat = Float.parseFloat(Sfloat);
      double Idouble = Double.parseDouble(Sdouble);
      boolean Iboolean =  Boolean.parseBoolean(Sboolean);
      
      System.out.println("Nilai Int : "+Iint);
      System.out.println("Nilai byte : "+Ibyte);
      System.out.println("Nilai short : "+Ishort);
      System.out.println("Nilai long : "+Ilong);
      System.out.println("Nilai float : "+Ifloat);
      System.out.println("Nilai double : "+Idouble);
      System.out.println("Nilai boolean : "+Iboolean);
        System.out.println(Iint+Ishort);
    }
}
