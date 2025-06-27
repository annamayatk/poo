package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	protected String responsavel;
	protected List<Livro> livros;

	public Biblioteca(String responsavel) {
		this.responsavel = responsavel;
		this.livros = new ArrayList<>();
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void adicionar(Livro livro) throws PrecoInvalidoException {
	    if (livro.getPreco() < 0) {
	        throw new PrecoInvalidoException("Preço do livro não pode ser negativo!");
	    }
	    livros.add(livro);
	}

	public void listar() {
		if (livros.isEmpty()) {
			System.out.println("Não há livros na biblioteca.");
		} else {
			for (Livro livro : livros) {
				System.out.println(livro);
			}
		}
	}

	public int pesquisarFaixaDePreco(double valorInicial, double valorFinal) throws FaixaPrecoInvalidaException {
	    if (valorFinal < valorInicial) {
	        throw new FaixaPrecoInvalidaException("O preço final não pode ser menor que o preço inicial.");
	    }

	    int count = 0;
	    for (Livro livro : livros) {
	        if (livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
	            count++;
	        }
	    }
	    return count;
	}

	public double calcularTotalLivros() {
		double total = 0.0;
		for (Livro livro : livros) {
			total += livro.getPreco();
		}
		return total;
	}

}
