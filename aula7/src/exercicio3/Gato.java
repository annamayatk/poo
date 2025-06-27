package exercicio3;

public class Gato extends AnimalDeEstimacao {
	protected String cor;

	public Gato(String nome, Integer idade, String cor) {
		super(nome, idade);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String imprimir() {
		return super.imprimir() + "\nCor do gato: " + cor;
	}
	
	
}
