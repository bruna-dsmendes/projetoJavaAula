package optional;

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {

		String[] palavras = new String[10]; // criando um vetor com 10 posições
		
		palavras[5] = "TURMA";
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		if(checaNulo.isPresent()) { // optional, tem um objeto dentro de você?  True/False
			String palavra = palavras[5].toLowerCase();  // acessar a casa cinco, sexto item //converter informações em letras minusculas
			System.out.println(palavra);
	}else { 
			System.out.println("A palavra é nula!");
	}

}
}

