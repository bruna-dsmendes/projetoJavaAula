package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclista, INadador, ICorredor{
	
	int competicoes;

	// Métodos Construtores
	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);	// Pessoa(nome, idade)
		this.competicoes = competicoes;
	}
	
	public TriAtleta(String nome, int idade) {
		super(nome, idade);
	}
	
	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}
	
	public void competicoesConcluidas() {
		System.out.println("Competições Concluídas: " + this.competicoes);
	}
	
	// Polimorfismo de Sobrecarga (Sobrecarga de Método)
	public void competicoesConcluidas(int numero) {
		System.out.println("Competições Concluídas: " + numero);
	}
	
	// Polimorfismo de Sobrescrita (Sobrescrita de Método)
	public void visualizar() {
		super.visualizar();
		System.out.println("Competições: " + this.competicoes);
	}
	
	// Métodos Implementados das Interfaces
	public void pedalar() {
		System.out.println("Estou pedalando...");
	}

	@Override	// Anotação - Etiqueta de Dados/Info
	public String aquecer() {
		return "Estou me aquecendo...";
	}

	@Override
	public void correr() {
		System.out.println("Correndo...");
		
	}

	@Override
	public void nadar(int distancia) {
		System.out.println("Vou nadar " + distancia + "km.");
	}
	
}

