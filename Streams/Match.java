package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Arhtur", 7.5, 2);
		Aluno a2 = new Aluno("Ana", 8.5, 1);
		Aluno a3 = new Aluno("Samy", 9.5, 3);
		Aluno a4 = new Aluno("Gui", 5.5, 2);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));
		
	}

}
