package desafios;

import java.util.Scanner;

public class Desafio7 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int somadorDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.print("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = entrada.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero; // Isso � igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma at� o momento: %d\n", somadorDeNumeros);
			}
		}
		entrada.close();
	}

}
