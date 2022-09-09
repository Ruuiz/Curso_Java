package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco *(1 - prod.desconto)) >= 750;
				
	    Produto produto = new Produto ("Note", 2200, 0.1);
	    
	    System.out.println(isCaro.test(produto));
	}

}
