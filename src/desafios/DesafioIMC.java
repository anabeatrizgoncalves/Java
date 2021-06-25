package desafios;

import java.util.Scanner;

public class DesafioIMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);  
		
		System.out.print("Qual é o seu nome? ");
		String nome = entrada.next(); 
		
		System.out.print("Qual é a sua altura? ");
		double altura = entrada.nextDouble();
		
		System.out.print("Quanto você pesa? ");
		double peso = entrada.nextDouble(); 
		
		double resultado =  peso / (altura * altura) ;  
		System.out.printf( nome + " seu IMC é %.2f ", resultado);
		
		entrada.close();
	}
}
