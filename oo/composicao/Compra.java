package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	
	ArrayList<Itens> itens = new ArrayList<Itens>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.itens.add(new Itens( nome, quantidade, preco));
	}
	
	void adicionarItem(Itens item) {
		itens.add(item);
		item.compra = this;
	}
	
	double getValorTotal() {	
		double total = 0;
		
		for (Itens itens : itens) {
			total += itens.quantidade + itens.preço;
			
		}
		return total;
	}


	
	
	
	

}
