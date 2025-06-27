package exercicio3;

public class Cachorro extends AnimalDeEstimacao {
	protected String raca;

	public Cachorro(String nome, Integer idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String imprimir() {
		return super.imprimir() + "\nRaça do cachorro: " + raca;
	}

}
