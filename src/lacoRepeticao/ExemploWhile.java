package lacoRepeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero1, numero2, resultado;
		String continua = "";
		
		// Comando - equalsIgnoreCase
		// O termo equals serve para verifica se uma String é igual a outra. Ex: X é igual a X?
		// O termo IgnoreCase serve para ignorar letras maiusculas e minusculas, tratanto todas igualmente.

		// O valor dentro da variavel continua é igual a N? Sim, é n. 
		// Logo o resultado da verificação é TRUE.
		// Mas, o operador de negação ( ! ) inverte essa lógica, transformando TRUE em FALSE.
		
		// Como é FALSE, o While não repete mais a sua lógica

		while (!continua.equalsIgnoreCase("n")) {

			System.out.println("Digite primeiro valor: ");
			numero1 = leia.nextInt();

			System.out.println("Digite segundo valor: ");
			numero2 = leia.nextInt();

			resultado = numero1 + numero2;

			System.out.println("O resultado da soma é: " + resultado);
			
			System.out.println("Deseja continuar? (s/n)");
			continua = leia.next();
		}
	}

}
