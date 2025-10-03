public class day26 {

    public static void main(String[] args) {
        
        System.out.println("--- Demonstrasi Operator Penugasan Aritmatika ---");
        
        // Inisialisasi variabel untuk demonstrasi Aritmatika
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        int e = 10;
        
        // 1. Operator Penugasan Dasar (=)
        int x = 5; 
        System.out.println("Operator = (Penugasan Dasar): x = " + x); 
        
        // 2. Operator Penugasan Tambah (+=)
        a += 5; // Sama dengan a = a + 5
        System.out.println("Operator += (Penugasan Tambah): a = " + a); 
        
        // 3. Operator Penugasan Kurang (-=)
        b -= 3; // Sama dengan b = b - 3
        System.out.println("Operator -= (Penugasan Kurang): b = " + b); 
        
        // 4. Operator Penugasan Kali (*=)
        c *= 2; // Sama dengan c = c * 2
        System.out.println("Operator *= (Penugasan Kali): c = " + c);
        
        // 5. Operator Penugasan Bagi (/=)
        d /= 4; // Sama dengan d = d / 4 (Pembagian bulat)
        System.out.println("Operator /= (Penugasan Bagi): d = " + d); 
        
        // 6. Operator Penugasan Modulus (%=)
        e %= 3; // Sama dengan e = e % 3 (Sisa bagi)
        System.out.println("Operator %= (Penugasan Modulus): e = " + e); 
        
        System.out.println("\n---Operator Penugasan Bitwise ---");
        
    
        int f = 5; 
        int g = 5;
        int h = 5;
        
        
        int pembanding = 3; 

        System.out.println("Nilai Awal Variabel (f, g, h) = 5");
        System.out.println("Nilai Pembanding = 3");
        
       
        f &= pembanding; 
        System.out.println("Operator &= (Bitwise AND): f = " + f); 
        
        //penugasan Bitwise OR (|=)
       
        g |= pembanding; 
        System.out.println("Operator |= (Bitwise OR): g = " + g); 
        
        // Penugasan Bitwise XOR (^=)
      
        h ^= pembanding; 
        System.out.println("Operator ^= (Bitwise XOR): h = " + h);
        
        //Left Shift (<<=)
     
        int i = 5; 
        i <<= 2; 
        System.out.println("Operator <<= (Left Shift): i = " + i);
        
        //  Bitwise Right Shift (>>=)
     
        int j = 5; 
        j >>= 2;
        System.out.println("Operator >>= (Right Shift): j = " + j);
    }
    
}
