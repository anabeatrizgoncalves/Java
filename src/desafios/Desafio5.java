package desafios;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		
		int contadorDeDivisores = 0; 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número para verificar se é primo:");
		int numero = entrada.nextInt(); 
		
		for(int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++; 
			}
		}
		
		switch(contadorDeDivisores) {
		case 0:
			System.out.println("O número " +  numero + " que você digitou é primo");
			break;
			
		default: 
			System.out.println("O número " + numero + " não é primo");
		}
		
		entrada.close();
	}
}
