package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	String nome;
	
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void AdicionarAluno(Aluno aluno) {
		 this.alunos.add(aluno);
		 aluno.cursos.add(this);
	}
	
	@Override
	public String toString() {
		
		return nome;
	}


}
