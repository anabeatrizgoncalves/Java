package desafios;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		double numero = entrada.nextDouble();
		
		if(numero % 2 == 1) {
			System.out.println( numero + " � um n�mero primo");
		}else { 
			System.out.println( numero + " � um n�mero par");
		}
		
		entrada.close();
	}
}
