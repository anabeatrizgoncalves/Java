package desafios;

import java.util.Scanner;

public class DesafioAoQuadroECubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		System.out.print("Digite um n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite um n�mero: ");
		double num2 = entrada.nextDouble();
		
		 double resultado1 = Math.pow(num1, 2); 
		 double resultado2 = Math.pow(num2, 2); 
		 double resultado3 = Math.pow(num1, 3); 
		 double resultado4 = Math.pow(num2, 3); 
		 
		 System.out.println("O n�mero " + num1 + " elevado ao cubo � igual a " + resultado1 + 
				 " e elevado ao cubo � " + resultado3);
		 System.out.println("O n�mero " + num2  + " elevado ao cubo � igual a  " + resultado2 +
				 " e elevado ao cubo � " + resultado4);
		 
		 entrada.close();
		
	}
}
