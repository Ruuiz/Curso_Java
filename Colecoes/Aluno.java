package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	String nome;
	
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void AdicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this); 
	}
	
	public String toString() {
		return nome;
	}

}
