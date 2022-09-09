package Heranca.desafio;

public class Porsche extends Carro implements Esportivo,Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Porsche() {
		super(315); 
	}
	
	public Porsche(int velMax) {
		super(velMax);
		setDelta(15);
	}
	

	public boolean acelerar(Porsche porsche) {
		boolean acelera = super.acelerar(porsche); 
		velAtual += 15;
		return acelera;
	}
	public boolean frear(Porsche porsche) {
		boolean frea = super.frear(porsche); 
		velAtual -= 15;
		return frea;
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
		
	}
	
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}
		else if (ligarTurbo && ligarAr) {
			return 30;
		}
		else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
	}


}
