package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		geraErro1();
		
		
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	
	//Excecao nao chegada/nao verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
		
	}
	
	//Excecao checada/verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02!");	
	}

}
