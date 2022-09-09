package Heranca.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Arthur",30);
		p1.setIdade(20);
		
		System.out.println(p1.getIdade());
		
	}

}
