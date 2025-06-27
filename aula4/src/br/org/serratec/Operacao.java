package br.org.serratec;

public class Operacao implements Livraria {
	String tipo;
	Double valorOperacao;
	Livro livro;
	
	public Operacao(String tipo, Double valorOperacao, Livro livro) {
		super();
		this.tipo = tipo;
		this.valorOperacao = valorOperacao;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Operacao [tipo=" + tipo + ", valorOperacao=" + valorOperacao + ", livro=" + livro + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public Double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public void venderLivro() {
		valorOperacao = livro.getValor() * 1.09;
	}
	
	public void emprestarLivro() {
		double valorPorcentagem = livro.getValor() * 0.02;
		
		valorOperacao = valorPorcentagem + taxaEmprestimo;
	}
	
}
