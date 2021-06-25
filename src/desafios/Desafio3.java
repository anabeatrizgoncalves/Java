package desafios;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o ano atual: ");
		int ano = entrada.nextInt();
		
		int bissexto = ano % 4; 
		
		if(bissexto == 0) {
			System.out.println(ano + " é um ano bissexto");
		}else {
			System.out.println("Não é um ano bissexto");
		}
				
		entrada.close();
	}
}
