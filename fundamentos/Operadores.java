package fundamentos;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double num1 = entrada.nextDouble();
				
		System.out.print("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		entrada.nextLine();
	
		System.out.println("Digite o simbolo de sua operação (+ - * /): ");
		String operacao = entrada.nextLine();
	
		entrada.close();
		
		double resultadofinal = "+".equals(operacao) ? num1 + num2 : 0;
		resultadofinal = "-".equals(operacao) ? num1 - num2 : resultadofinal;
		resultadofinal = "*".equals(operacao) ? num1 * num2 : resultadofinal;
		resultadofinal = "/".equals(operacao) ? num1 / num2 : resultadofinal;

		System.out.printf("A conta sera : %f %s %f", num1 , operacao, num2);
		
	}

}
