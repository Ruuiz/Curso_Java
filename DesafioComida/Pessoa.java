package DesafioComida;

public class Pessoa {
	
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		
		this.nome = nome;
		this.peso = peso;
		
	}
	
	void Comer(Comida comida){
		
		if (comida != null) {
			peso += comida.kg;
		}
		
	}
	
	  String Impressao(){
		  
		    return "O peso total da pessoa " + nome + " sera: " + peso;
				
	
		
	}
	
	
	

}
