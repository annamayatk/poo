package br.org.serratec;

public class Livro {
	 String autor;
	 String titulo;
	 Double valor;
	 
	public Livro(String autor, String titulo, Double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", titulo=" + titulo + ", valor=" + valor + "]";
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getValor() {
		return valor;
	}
	 
	public void reajuste(Double percentual) {
		valor = valor + (valor * (percentual / 100));
	}
}
