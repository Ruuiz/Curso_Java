package Heranca;

public class Heroi extends Player {
	
	public boolean atacar(Player inimigo) {
		boolean ataque1 = super.atacar(inimigo);
		boolean ataque2 = super.atacar(inimigo);
		return ataque1 || ataque2;
	
	
}
}
