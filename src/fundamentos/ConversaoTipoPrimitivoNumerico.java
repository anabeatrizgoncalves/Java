package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	 public static void main(String[] args) {
		
		 double a = 1; // impl�cida
		 System.out.println(a);
		 
		 float b = (float) 1.012345788888;// expl�cida (CAST)
		 System.out.println(b);
		 
		 int c = 340; 
		 byte d = (byte) c; // expl�cida (CAST)
		 System.out.println(d);
		 
		 double e = 1.99999; 
		 int f = (int) e; // expl�cida (CAST)
		 System.out.println(f);
	}

}
