package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcesso() {
		
		//Ana mae = new Ana(); // Não precisa em herança
        //e atributos ou metódos publicos  
		
		//System.out.println(esposa.segredo);
		//System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(TodosSabem);
		System.out.println(new Ana().TodosSabem);
		
	
	}

	
}
