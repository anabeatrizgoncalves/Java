package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.desconto * ( 1 - prod.preco)) >= 150; 
		Produto produto = new Produto("Notebook", 3000, 0.15); 
		System.out.println(produto.desconto * ( produto.preco - 1));
		System.out.println(isCaro.test(produto));
	} 
}
