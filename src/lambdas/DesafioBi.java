package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioBi {

	public static void main(String[] args) {
		
		
		Function<Produto, Double> precoFinal = p -> p.preco * (1- p.desconto); 
		UnaryOperator<Double> impostoMunucipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50 ;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ","); 
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		String preco = precoFinal
				.andThen(impostoMunucipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O pre�o final � " + preco);
		
	}
}
