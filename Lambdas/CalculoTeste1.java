package Lambdas;

public class CalculoTeste1 {
	
	public static void main(String[] args) {
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(3, 2));
		
	    calculo = new Mult();
		System.out.println(calculo.executar(3, 2));
		
	}

}
