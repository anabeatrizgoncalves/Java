package classe;

public class Data {
       int ano; 
       int mes; 
       int dia; 
       
      String obterDataFormatada() {  
    	   final String formato = "\n%d/%d/%d"; 
    	    return String.format(formato, dia , mes, ano); 
       }
      
      void imprimirDataFormatada() {
    	  System.out.print(obterDataFormatada());
      }
      
       Data(){
    	  // dia = 1;
    	  //mes = 1; 
    	  //ano = 1970; 
    	   this(1, 1, 1970); 
    	   
      }
       
      Data(int dia, int mes , int ano){
    	 
    	 this.dia = dia; 
    	 this.mes = mes; 
    	 this.ano = ano; 
    	 
    	  
    	  
      }
      
      
      
      
}
