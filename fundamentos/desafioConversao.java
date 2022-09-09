package fundamentos;
import java.util.Locale;
import java.util.Scanner;

public class desafioConversao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Fale o primeiro numero: ");
		String num1 = entrada.nextLine();
		
		System.out.println("Fale o segundo numero: ");
		String num2 = entrada.nextLine();
		
		System.out.println("Fale o terceiro numero: ");
		String num3 = entrada.nextLine();
		
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		double numero3 = Double.parseDouble(num3);
		
		double media = (numero1+ numero2 + numero3)/3;
		
		System.out.printf("A media sera de %.2f ",  media);
		
		entrada.close();
		
		
		
	}
 
}
