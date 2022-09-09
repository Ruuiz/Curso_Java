package ModuloMetodos;

public class TesteProduto {
	
	public static void main(String[] args) {
		
		Produto.desconto = 0.2;
		
		Produto p1 = new Produto("roda", 10);	
		
		System.out.println(p1.nome);
		System.out.println(p1.precoComDesc());
		
	
		
	}

}
