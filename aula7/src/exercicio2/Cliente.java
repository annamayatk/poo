package exercicio2;

public class Cliente {
	protected Integer id;
	protected String nome;
	protected Integer idade;
	protected String telefone;
	
	public Cliente(Integer id, String nome, Integer idade, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}
	
	
	
	
	
}
