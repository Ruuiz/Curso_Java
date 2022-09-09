package Streams.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Loja {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caneta",2.5, 0.1, 5);
		Produto p2 = new Produto("Caderno",10, 0.2, 0);
		Produto p3 = new Produto("Monitor",1500, 0.7, 0);
		Produto p4 = new Produto("Bola",50, 0.5, 0);
		Produto p5 = new Produto("Bolsa",200, 0.35, 10);
				
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		Predicate<Produto> desconto = a -> a.desconto > 0.3;
		Predicate<Produto> freteGratis = a -> a.frete == 0;
		Function<Produto, String> Promocao = a -> "O Produto " + a.nome + " Esta apenas por " + a.PrecoDesconto(a.preco, a.desconto,a.frete) + " !! SUPER PROMOCAO!!" ;
		
		
		produtos.stream()
		.filter(freteGratis)
		.filter(desconto)
		.map(Promocao)
		.forEach(System.out::println);
		
	}
}
