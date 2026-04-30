package pooHeranca;

public class Estudante extends Pessoa { //Clase filha ou classe Derivada de pessoa
	
	//Atributos
    private String matricula;
    private String curso;
    
    
    //Metodo construtor
	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		super(nome, idade, email); // Super -> Classe mãe \ Método construtor da classe mãe
		// Pessoa(nome, idade, email)
		this.matricula = matricula;
		this.curso = curso;
	}
	
	
	// Metodo de acesso (Get pega ou mostra - set processa)
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
