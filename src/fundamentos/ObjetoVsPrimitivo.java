package fundamentos;

public class ObjetoVsPrimitivo {

	public static void main(String[] args) {
		
		String s = new String("texto");
		s = s.toUpperCase();
		System.out.println(s);
		
		// Wrappers s�o a vers� objeto dos tipo primitivos! 
		int a = 123;
		System.out.println(a);
	}
}
