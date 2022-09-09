package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			
		imprimirNomeDoAluno(a1);
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro quando foi imprimir o nome");			
		}
		
		try {
			System.out.println(7/0);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());			
		}
		
		
	}

	public static void imprimirNomeDoAluno(Aluno aluno) {
		
		System.out.println(aluno.nome);
		
	}
}
