package generics;

public class ParesTeste {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<Integer, String>();
		
		resultadoConcurso.adicionar(1, "Arthur");
		resultadoConcurso.adicionar(2, "Samy");
		resultadoConcurso.adicionar(3, "Enzo");
		resultadoConcurso.adicionar(4, "Caio");
		resultadoConcurso.adicionar(5, "Gui");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(3));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(5));
		System.out.println(resultadoConcurso.getValor(4));
		
	}

}
