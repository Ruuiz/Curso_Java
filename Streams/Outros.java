package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Arhtur", 7.5, 2);
		Aluno a2 = new Aluno("Ana", 8.5, 1);
		Aluno a3 = new Aluno("Samy", 9.5, 3);
		Aluno a4 = new Aluno("Gui", 5.5, 2);
		Aluno a5 = new Aluno("Arhtur", 7.5, 2);
		Aluno a6 = new Aluno("Pedro", 8.5, 1);
		Aluno a7 = new Aluno("Samy", 9.5, 3);
		Aluno a8 = new Aluno("Gui", 5.5, 2);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		
		System.out.println("\n\nSkip/Limit...\n\n");
		alunos.stream()
		.distinct()
		.skip(1)
		.limit(3)
		.forEach(System.out::println);
		
		System.out.println("\n\nTakeWhile");
		alunos.stream()
		.distinct()
		.takeWhile(a -> a.nota >=7)
		.forEach(System.out::println);
	
	
	
	}

}
