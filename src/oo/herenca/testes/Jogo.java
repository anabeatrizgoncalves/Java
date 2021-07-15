package oo.herenca.testes;

import oo.herenca.Direcao;
import oo.herenca.Heroi;
import oo.herenca.Jogador;
import oo.herenca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		monstro.x = 10; 
		monstro.y = 10; 

		Jogador heroi = new Heroi(10, 11);

		System.out.println("O Monstro tem => " + monstro.vida);
		System.out.println("O Herói tem => " + heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
	
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("O Monstro tem => " + monstro.vida);
		System.out.println("O Herói tem => " + heroi.vida);
	}

}
