package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		 // Informa��es do funcion�rio 
		
		// Tipo num�ricos inteiros 
		byte anosDeEmpresa = 23; 
		short numeroDeVoos = 542; 
		int id = 56789; 
		long  pontosAcumulados = 3_234_845_223L; 
		
		// Tipo n�mericos reais   
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;  
		
		//tipo boleano 
		boolean estaDeFerias = false; // true 
		
		//tipo caractere 
		char status = 'A';  // ativo 
		
		// Dias de empresa
		System.out.println( "Dias de empresa : " + anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println( "N�meros de viagens : " + numeroDeVoos / 2);
		
		//Pontos por real 
		System.out.println( "Pontos para real : " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println( id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status );
		
	}

}
