package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Escreva quantos alunos: ");
		int alunos = entrada.nextInt();
		System.out.println("Escreva quantas notas: ");
		int notas = entrada.nextInt();
		
		double matriz[][] = new double [alunos][notas]; 
		
		int total = 0;
		
		for (int i = 0; i < matriz.length; i++ ) {
			for (int j = 0; j < matriz[i].length; j++ ) {
			System.out.println("Escreva a nota " + j + "do aluno " + i + ": ");
			matriz[i][j] = entrada.nextDouble();
			
			total += matriz[i][j];
		
			}
		}
		
		System.out.println("A media sera : " + total/(alunos * notas));
		
		
	    
		
		
	}

}
