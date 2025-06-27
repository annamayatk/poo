package exercicio3;

public abstract class AnimalDeEstimacao implements Animal {
	protected String nome;
	protected Integer idade;

	public AnimalDeEstimacao(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String imprimir() {
		return "Nome do animal: " + nome + "\nIdade do animal: " + idade;
	}

}
