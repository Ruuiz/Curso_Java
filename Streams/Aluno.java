package Streams;

import java.util.Objects;

public class Aluno {
	
	String nome;
    double nota;
    int serie;
	public Aluno(String nome, double nota,int serie ) {
		this.nome = nome;
		this.nota = nota;
		this.serie = serie;
	}
	
	public String toString() {
		return nome + " tem nota " + nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, nota, serie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota)
				&& serie == other.serie;
	}

}
