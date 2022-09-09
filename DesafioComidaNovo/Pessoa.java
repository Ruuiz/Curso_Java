package DesafioComidaNovo;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(Comida comida){
		return peso += comida.peso;
	}


}
