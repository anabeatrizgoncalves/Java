package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final List<Compra> compras = new ArrayList<>();
	final String nome;

	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarComprar(Compra compra) {
		this.compras.add(compra);
	}

	double obterValorTotal() {
         double total = 0;

		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}

		return total;
	}

}
