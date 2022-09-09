package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
	
	public static void main(String[] args) {
		
		Set<String> teste = new HashSet<>();
		
		teste.add("Arthur");
		teste.add("Ahur");
		teste.add("Arthu");
		teste.add("Arthudsr");
		teste.add("Art");
		
		
		for(String candidato: teste) {
			System.out.println(candidato);
		}
		
		
	}

}
