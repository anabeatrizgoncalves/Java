package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	 public static void main(String[] args) {
		
		 double a = 1; // implícida
		 System.out.println(a);
		 
		 float b = (float) 1.012345788888;// explícida (CAST)
		 System.out.println(b);
		 
		 int c = 340; 
		 byte d = (byte) c; // explícida (CAST)
		 System.out.println(d);
		 
		 double e = 1.99999; 
		 int f = (int) e; // explícida (CAST)
		 System.out.println(f);
	}

}
