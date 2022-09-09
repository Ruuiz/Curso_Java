package Heranca;

public class Player {
	
	public int vida = 100;
	public int x;
	public int y;
	
	public boolean atacar(Player inimigo) {
		
		int deltaX = Math.abs(x-inimigo.x);
		int deltaY = Math.abs(y-inimigo.y);
		
		if(deltaX == 0 && deltaY == 1 ) {
			inimigo.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			inimigo.vida -= 10;
			return true;
		}else {
			return false;
		}
	}
	
	boolean andar(Direcao direcao) {
		 switch(direcao) {
		 case NORTE:
			 y--;
			 break;
		 case LESTE:
			 x++;
			 break;
		 case SUL:
			 y++;
			 break;
		 case OESTE:
			 x--;
			 break;
		 }
		 return true;
	}
}
