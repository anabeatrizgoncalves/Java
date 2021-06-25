package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		 // Informações do funcionário 
		
		// Tipo numéricos inteiros 
		byte anosDeEmpresa = 23; 
		short numeroDeVoos = 542; 
		int id = 56789; 
		long  pontosAcumulados = 3_234_845_223L; 
		
		// Tipo númericos reais   
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;  
		
		//tipo boleano 
		boolean estaDeFerias = false; // true 
		
		//tipo caractere 
		char status = 'A';  // ativo 
		
		// Dias de empresa
		System.out.println( "Dias de empresa : " + anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println( "Números de viagens : " + numeroDeVoos / 2);
		
		//Pontos por real 
		System.out.println( "Pontos para real : " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println( id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status );
		
	}

}
