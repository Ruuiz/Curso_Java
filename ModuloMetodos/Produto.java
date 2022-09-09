package ModuloMetodos;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	
	Produto(String nomeprod, double precoprod){
		
		nome = nomeprod;
		preco = precoprod;
			
	}
	
	double precoComDesc() {
		
		return preco * (1 - desconto);
		
		
	}
	
	

}
