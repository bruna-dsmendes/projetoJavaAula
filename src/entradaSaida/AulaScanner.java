package entradaSaida;

import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {
		
		// Declarando as Variáveis
		Scanner leia = new Scanner(System.in);
		String nome;
		
		// Entrada de Dados
		System.out.println("Digite o seu nome: ");
		
		// Processamento
		nome = leia.nextLine();
		
		// Saida de dados
		System.out.println("Bom dia, " + nome + "."); // (+) Concatenar / juntar o conteúdo
		
		
	}

}
