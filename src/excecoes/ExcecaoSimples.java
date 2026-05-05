package excecoes;

public class ExcecaoSimples extends Exception {
	
	// Atributo 
	// final não pode ser herdado
	
	private static final long serialVersionUID = 1L; // é tipo long e não int
	
	public ExcecaoSimples() {}
	
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
		
	}
	

}
