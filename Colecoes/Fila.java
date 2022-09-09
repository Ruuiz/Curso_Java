package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
			
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Ana"); 
		fila.offer("Carlos"); 
		fila.offer("Samy"); 
		fila.offer("Enzo"); 
		fila.contains("Ana");
 	}
}
