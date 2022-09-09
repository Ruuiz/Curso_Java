package controle;

import java.util.Scanner;

public class DesafioWhile {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		int count = 0;
		double nota = 0;
		
		 while( nota != -1 ){
			
			System.out.println("Digite uma nota valida: ");
			nota = entrada.nextDouble();
			
			if ( nota >= 0 && nota <= 10 ) {
				
			total += nota;
			count ++;
			} else if (nota != -1 ){
				
				System.out.println("Numero invalido, tente novamente \n");
			}
			
		}
		
		entrada.close();
		
		System.out.printf("O total sera: %f e a quantidade de notas sera de %d", total, count);
		
}

}
