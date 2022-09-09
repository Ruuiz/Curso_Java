package Lambdas;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = preco -> p.preco * (1 - p.desconto);
			
		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? (preco * (1 + 0.085)): preco;
				
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? (preco + 100): (preco + 50);
				
		UnaryOperator<Double> arredondar = preco -> Math.round(preco*100.0)/100.0;
		
	    Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
				
		String resultado = precoReal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
				
		System.out.println(resultado);
	}
}
