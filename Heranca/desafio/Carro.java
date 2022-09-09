package Heranca.desafio;

public class Carro {
	
	final int velMax;
	public int velAtual;
	private int delta = 5;
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	Carro(int velocidadeMax){
		velMax = velocidadeMax;
	}
	
	boolean acelerar(Carro carro)
	{
		if(velAtual + getDelta() > velMax) {
			velAtual = velMax;
		}
		else {
			velAtual += getDelta();			
		}
		return true;
	}
	
	boolean frear(Carro carro) {
		if (velAtual >=5) {
			velAtual -= 5;
		}else {
			velAtual = 0; 
		}
		return true;
	}
}
