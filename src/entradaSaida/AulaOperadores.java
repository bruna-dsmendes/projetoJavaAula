package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {

		// Variaveis
		float celsius, fahrenheit;
		Scanner leia = new Scanner(System.in); //precisa importar scanner, clicando em cima dele
		
		// Entrada de Dados
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextFloat(); // 28,3
		
		// Processamento
		fahrenheit = celsius * 1.8f + 32;
		
		// Saida
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
	}

}
