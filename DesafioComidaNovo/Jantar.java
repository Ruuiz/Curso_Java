package DesafioComidaNovo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Arthur",75);
		
		Comida c1 = new Comida("maça",0.2);
		Comida c2 = new Comida("laranja",0.5);
		
		System.out.println(p1.peso);
		
		System.out.println("Comendo c1: " + p1.comer(c1));
		System.out.println("Comendo c2: " + p1.comer(c2));
		
	}

}
