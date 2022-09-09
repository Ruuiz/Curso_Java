package oo.composicao.Desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Arthur");
		Cliente c2 = new Cliente("Samy");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("papel", 2.5, 2);
		compra1.adicionarItem("caneca", 5, 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("folha", 5, 2);
		compra2.adicionarItem("caneca", 5, 1);
		
		c1.compras.add(compra1);
		c1.compras.add(compra2);
		
		c2.compras.add(compra1);
		
		
		System.out.println("Foi gasto um total de " + c1.TotalGasto()  + " pelo cliente 1 e um total de " + c2.TotalGasto() + " pelo cliente2.");
		
		
		
	}

}
