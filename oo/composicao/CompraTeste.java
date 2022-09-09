package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "joao";
		c1.adicionarItem(new Itens("caneta",20,3.5));
		c1.adicionarItem(new Itens("borracha",20,2.2));
		c1.adicionarItem(new Itens("lapis", 20, 1.5));
		
		System.out.println(c1.getValorTotal());
		
	}
}
