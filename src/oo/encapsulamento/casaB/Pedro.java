package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcesso() {
		
		//Ana mae = new Ana(); // N�o precisa em heran�a
        //e atributos ou met�dos publicos  
		
		//System.out.println(esposa.segredo);
		//System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(TodosSabem);
		System.out.println(new Ana().TodosSabem);
		
	
	}

	
}
