package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("a",-7,3);
		
		try {
			Validar.aluno(aluno);
		} catch (StringVaziaException | NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}//catch NumeroForaIntervaloException e
		
		System.out.println("fim");
		
	}

}
