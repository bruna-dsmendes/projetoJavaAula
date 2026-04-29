package introducao;

public class VariaveisConstantes {

	public static void main(String[] args) {
	
		// Variaveis
		int idade = 31;
		String nome = "Bruna"; //String é uma classe que representa uma sequência de caracteres.
		float graus = 20.0f; //float -> ponto flutuante
		boolean resposta;    //boolean -> true/false
		
		// Constantes - Por boas práticas colocamos em maiúsculas
		final int QUANTIDADE = 50;
		final String TURMA = "Turma 84";
		final double AREA = 3.1415;
		
		System.out.println(nome);  //printf não pula linha
		System.out.println(QUANTIDADE);
		System.out.println(graus);
		
	}

}
