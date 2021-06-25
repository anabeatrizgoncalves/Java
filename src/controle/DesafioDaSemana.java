package controle;

import java.util.Scanner;

public class DesafioDaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Digite um dia da semana: ");
		String semana = entrada.next(); 
		
		if( semana.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if(semana.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if(semana.equalsIgnoreCase("terça") || semana.equalsIgnoreCase("terca")) {
			System.out.println(3);
		} else if(semana.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if(semana.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if(semana.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if(semana.equalsIgnoreCase("sabado") || semana.equalsIgnoreCase("sábado")) {
			System.out.println(7);
	    }
		
		System.out.println("FIM!");
		entrada.close();
	}
}
