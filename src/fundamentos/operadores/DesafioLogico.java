package fundamentos.operadores;

public class DesafioLogico {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true; 
		boolean trabalho2 = true; 
		
		boolean ComprouTV50 = trabalho1 && trabalho2; 
		boolean ComprouTV32 = trabalho1 ^ trabalho2; 
		boolean sorvete = true; 
		boolean shopping = true; 

		boolean ficarSaudavel = !shopping; 
		
		System.out.println("Iremos comprar a TV de 50 polegadas ? " + ComprouTV50);
		System.out.println("Iremos comprar a TV de 32 polegadas ? " + ComprouTV32);
		System.out.println("Iremos ao Shopping? " + shopping );
		System.out.println("Iremos tomar sorvete ?  " + sorvete );
        System.out.println("Iremos ficar saudável? " + ficarSaudavel );
		
	}

}
