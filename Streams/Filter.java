package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8,1);
		Aluno a2 = new Aluno("Bia", 4.8,2);
		Aluno a3 = new Aluno("Daniel", 5.8,3);
		Aluno a4 = new Aluno("Gui", 8.8,2);
		Aluno a5 = new Aluno("Rebeca", 1.8,1);
		Aluno a6 = new Aluno("Pedro", 9.8,3);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> MaisQue1 = a -> a.serie > 1;
		Function<Aluno, String> Saudacao = a-> "Parabens " + a.nome +"! Voce foi aprovado(a)";
		
		alunos.stream()
		.filter(aprovado)
		.filter(MaisQue1)
		.map(Saudacao)
		.forEach(System.out::println);
		
	}

}
