package DesafioComida;

public class Janta {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Samy", 54);
		
		Comida c1 = new Comida("acai", 0.350);
		
		p1.Comer(c1);
		
		System.out.println(p1.Impressao());
		
	}

}
