package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Qual é o seu salário do primeiro mês: ");
		String salario = entrada.next().replace(",", "."); 
		
		System.out.print("Qual é o seu salário do segundo  mês: ");
		String salario2 = entrada.next().replace(",", "."); ; 
		
		System.out.print("Qual é o seu salário do terceiro mês: ");
		String salario3 = entrada.next().replace(",", "."); ; 
		
		
		double n1 = Double.parseDouble(salario); 
		double n2 = Double.parseDouble(salario2); 
		double n3 = Double.parseDouble(salario3); 
		
		double media = (n1 + n2 + n3 ) / 3 ; 
		
		System.out.println("A média dos salários é " +  media);
		
		entrada.close(); 
	}

}
