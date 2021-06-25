package desafios;

import java.util.Scanner;

public class DesafioAoQuadroECubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		System.out.print("Digite um número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite um número: ");
		double num2 = entrada.nextDouble();
		
		 double resultado1 = Math.pow(num1, 2); 
		 double resultado2 = Math.pow(num2, 2); 
		 double resultado3 = Math.pow(num1, 3); 
		 double resultado4 = Math.pow(num2, 3); 
		 
		 System.out.println("O número " + num1 + " elevado ao cubo é igual a " + resultado1 + 
				 " e elevado ao cubo é " + resultado3);
		 System.out.println("O número " + num2  + " elevado ao cubo é igual a  " + resultado2 +
				 " e elevado ao cubo é " + resultado4);
		 
		 entrada.close();
		
	}
}
