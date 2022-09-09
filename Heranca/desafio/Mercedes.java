package Heranca.desafio;

public class Mercedes extends Carro {
	
	public Mercedes(int velMax) {
		super(velMax);
	}
	
	public boolean acelerar(Mercedes mercedes)
	{
		velAtual += 15;
		return true;
	}
	
	public boolean frear(Mercedes mercedes) {
		if (velAtual > 0) {
			velAtual -= 15;
		}
		return true;
	}

}
