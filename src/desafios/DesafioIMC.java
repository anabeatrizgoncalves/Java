package desafios;

import java.util.Scanner;

public class DesafioIMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);  
		
		System.out.print("Qual � o seu nome? ");
		String nome = entrada.next(); 
		
		System.out.print("Qual � a sua altura? ");
		double altura = entrada.nextDouble();
		
		System.out.print("Quanto voc� pesa? ");
		double peso = entrada.nextDouble(); 
		
		double resultado =  peso / (altura * altura) ;  
		System.out.printf( nome + " seu IMC � %.2f ", resultado);
		
		entrada.close();
	}
}
