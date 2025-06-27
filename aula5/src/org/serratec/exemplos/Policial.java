package org.serratec.exemplos;

//final na classe nao pode ter filhos
public final class Policial {
	protected String nome;
	//protected final String LOTACAO = "Brasilia";
	protected final String LOTACAO;
	
	public Policial(String nome, String lOTACAO) {
		this.nome = nome;
		LOTACAO = lOTACAO;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLOTACAO() {
		return LOTACAO;
	}


	//nao pode ser sobrescrito
	public final void imprimir() {
		System.out.println("Dados do policial: ");
	}
}
