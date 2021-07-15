package oo.herenca.testes;

import oo.herenca.desafio.Carro;
import oo.herenca.desafio.Civic;
import oo.herenca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Civic();
		c1.acelerar();
		c1.acelerar();

		System.out.println("A velocidade do Civic é " + c1.velocidadeAtual + "Km/h");

		c1.frear();
		c1.frear();

		System.out.println("A velocidade do Civic é " + c1.velocidadeAtual  + "Km/h");
		System.out.println();

		Ferrari c2 = new Ferrari(400);
		c2.ligarTurbo();
		c2.ligarAr();
		c2.desligarAr();
		
		System.out.println(c2.velocidadeDoAr());

		c2.acelerar();
		c2.acelerar();

		System.out.println("A velocidade da Ferrari é " + c2.velocidadeAtual  + "Km/h");

		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();
		c2.frear();

		System.out.println("A velocidade da Ferrari é " + c2.velocidadeAtual + "Km/h");

	}

}
