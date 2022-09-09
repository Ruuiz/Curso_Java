package Colecoes;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Arthur");
		Aluno aluno3 = new Aluno("Samy");
		
		Curso curso1 = new Curso("Programacao");
		Curso curso2 = new Curso("Gastronomia");
		Curso curso3 = new Curso("Antropologia");
		
		curso1.AdicionarAluno(aluno1);
		curso1.AdicionarAluno(aluno2);
		
		curso2.AdicionarAluno(aluno1);
		curso2.AdicionarAluno(aluno3);
		
		aluno1.AdicionarCurso(curso3);
		aluno2.AdicionarCurso(curso3);
		aluno3.AdicionarCurso(curso3);
		
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso " + curso2.nome + " E meu nome é " + aluno.nome);
		}
		
		System.out.println(curso1.alunos.get(0).cursos);
	}

}
