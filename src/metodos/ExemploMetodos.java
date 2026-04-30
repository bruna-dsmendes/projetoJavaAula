package metodos;

import metodoExterno.ExemploMetodoExterno;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2,5);	// resultado = 7
		// String texto = mensagem(); // não retorna informação
		
		System.out.println("O primeiro resultado: " + resultado);
		
		// Executando Método c/ Retorno e com Parametro
		System.out.println("O segundo resultado é: " + somar(8,3));
		
		// Executando Método s/ Retorno e sem Parametro
		mensagem();
				
		// Executando Método s/ Retorno e sem Parametro
		ExemploMetodoExterno.info();	// Estamos importando esse método do outro Arquivo
		
		// Executando Método s/ Retorno e com Parametro 
		saudacao("Bom dia, turma");
	}
	
	// Criando o método c/ retorno e c/ parametro
	public static int somar(int num1, int num2) {	// Assinatura do Método
		return num1 + num2;		// lógica do método
	}
	
	// Criando o método s/ retorno e s/ parametro
	public static void mensagem() {
		System.out.println("Esse método não tem retorno (void)");
	}
	
	// Criando o método s/ retorno e c/ parametro
	public static void saudacao(String msg) {
		System.out.println(msg);
	}

}
