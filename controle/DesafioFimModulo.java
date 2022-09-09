package controle;

import java.util.Random;
import java.util.Scanner;

public class DesafioFimModulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numpc;
		int chute;
		int continuar;
		
		
		do {
			
		
		
		Random aleatorio = new Random ();
		numpc = aleatorio.nextInt(101);
		System.out.println(numpc);
	
		
		System.out.println("Vamos começar!! Digite um numero de 0 a 100 e tente acertar: ");
		chute = entrada.nextInt();
		
		while (chute != numpc) {
			
			for (int i = 1; i < 11; i++) {
				System.out.print("Tentativa: \n" + (i+1));
				System.out.print("Digite seu numero: ");
				chute = entrada.nextInt();
				
				if (chute == numpc) {
					break;
				}
			}
			
		}
		
		System.out.print("PARABEEENS, VOCE ACERTOU. DESEJA JOGAR NOVAMENTE? (Caso nao, digite 0, se sim digite algum outro numero)");
		continuar = entrada.nextInt();
		
		
		}while(continuar != 0);
		
		entrada.close();
	}

}
