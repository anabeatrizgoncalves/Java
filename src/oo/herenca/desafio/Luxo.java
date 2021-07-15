package oo.herenca.desafio;

public interface Luxo {
       
	abstract void ligarAr();
	abstract void desligarAr();
	
	
	default int velocidadeDoAr(){
		return 1;
	}
	
	
}
