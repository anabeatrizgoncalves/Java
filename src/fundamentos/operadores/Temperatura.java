package fundamentos.operadores;

public class Temperatura {
	
   public static void main(String[] args) {
	   
	    final double ajuste = 32; 
	    final double multiplicador = 5/9.0; 
	    double F = 86; 
	    double C = (F - ajuste ) * multiplicador ; 
	    
	    System.out.println("O resultado é  " +  C + "°C" );
	    
	    F = 150; 
	    C = (F - ajuste ) * multiplicador ;
	    
	    System.out.println("O resultado é  " +  C + "°C" );
	   
	     
}
}
