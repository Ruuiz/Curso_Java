package generics;

public class CaixaNumeroTeste {
	
	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
		caixaA.guardar(1.23);
		System.out.println(caixaA.abrir());

		
		CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
		caixaB.guardar(123);
		System.out.println(caixaB.abrir());
		
	}

}
