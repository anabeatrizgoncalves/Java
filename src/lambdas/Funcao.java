package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOUimpar =
				numero -> numero % 2 ==  0 ? "Par" : "Ìmpar"; 
		
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado é: " + valor; 
				
		Function<String, String> empolgado = 
						valor -> valor +  "!!!"; 
						
		Function<String, String> duvida = 
								valor -> valor +  "???"; 
				
				
		String resultadoFinal = 
				parOUimpar
				.andThen(oResultadoE).
				andThen(empolgado)
				.apply(32);  	
		
		System.out.println(resultadoFinal);
		
		String resultadoFinal2 = 
				parOUimpar
				.andThen(oResultadoE).
				andThen(duvida)
				.apply(33);  	
		
	    System.out.println(resultadoFinal2);
		
		System.out.println(parOUimpar.apply(32));		
	}
}
