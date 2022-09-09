package oo.composicao.Desafio;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<>();
	
	
	double CompraTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.produto.preco * item.quantidade;
		}
		return total;
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		Produto produto = new Produto(nome,preco);
		this.itens.add(new Item(quantidade, produto));
	
	}
	


}
