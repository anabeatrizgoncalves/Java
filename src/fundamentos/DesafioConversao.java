package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Qual � o seu sal�rio do primeiro m�s: ");
		String salario = entrada.next().replace(",", "."); 
		
		System.out.print("Qual � o seu sal�rio do segundo  m�s: ");
		String salario2 = entrada.next().replace(",", "."); ; 
		
		System.out.print("Qual � o seu sal�rio do terceiro m�s: ");
		String salario3 = entrada.next().replace(",", "."); ; 
		
		
		double n1 = Double.parseDouble(salario); 
		double n2 = Double.parseDouble(salario2); 
		double n3 = Double.parseDouble(salario3); 
		
		double media = (n1 + n2 + n3 ) / 3 ; 
		
		System.out.println("A m�dia dos sal�rios � " +  media);
		
		entrada.close(); 
	}

}
