package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome =
				p -> System.out.println(p.nome + "!!!");
				
		Produto p1 = new Produto("Caneta", 12.3, 0.09);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Note", 2200, 0.1);
		Produto p3 = new Produto("Caderno", 10, 0.1);
		Produto p4 =  new Produto("Borracha", 5, 0.1);
		Produto p5 = new Produto("Lapis", 2, 0.1);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
		
	}

}
