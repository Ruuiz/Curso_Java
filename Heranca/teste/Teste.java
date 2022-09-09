package Heranca.teste;

import Heranca.desafio.Mercedes;
import Heranca.desafio.Porsche;

public class Teste {
	
	public static void main(String[] args) {
		
		Porsche p1 = new Porsche(250);
		
		Mercedes m1 = new Mercedes(200);
		
		p1.acelerar(p1);
		
		System.out.println(p1.velAtual);
		p1.ligarTurbo();
		m1.acelerar(m1);
		p1.acelerar(p1);
		System.out.println(p1.velAtual);
		
		m1.acelerar(m1);
		p1.acelerar(p1);
		
		m1.acelerar(m1);
		
		p1.frear(p1);
		
		m1.frear(m1);
		
		System.out.println(p1.velAtual);
		System.out.println(m1.velAtual);
	}

}
