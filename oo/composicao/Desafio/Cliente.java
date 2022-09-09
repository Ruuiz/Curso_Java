package oo.composicao.Desafio;

import java.util.ArrayList;

public class Cliente {
	
	String nome;
	Compra compra;
	
	ArrayList<Compra> compras = new ArrayList<>();
	
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	
	
	double TotalGasto() {
		
		double totalgasto = 0;
		for(Compra compra: compras) {
			totalgasto += compra.CompraTotal();
 		}
		
		return totalgasto;
	}

}
