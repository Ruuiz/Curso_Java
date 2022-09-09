package fundamentos;

public class temperatura {

	
	public static void main(String[] args) {
		
		double f,c,divisao, ajuste;
		
		divisao = 5.0/9;
		ajuste = 32;
		f = 86;
		c = 0;
		
		c = (f - ajuste) * divisao;

		System.out.println("a temperatura em celcius sera de: " + c);
	}
}
