package br.org.serratec;

public class Proprietario {  //está implicito extends object
	private String nome;
	
	public Proprietario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + "]";
	}

	
	 
	
}
