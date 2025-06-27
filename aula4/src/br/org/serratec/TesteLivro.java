package br.org.serratec;

public class TesteLivro {
	
	public static void main(String[] args) {
		
	Livro livro1 = new Livro("Stephenie Meyer", "Crepúsculo", 80.0);
	Livro livro2 = new Livro("Paulo Coelho", "O Alquimista", 120.0);
	
	
	Operacao operacaoVenda = new Operacao("venda", 0.0, livro1);
	operacaoVenda.venderLivro();
	System.out.println("Tipo: " + operacaoVenda.getTipo() + " Valor da operação de venda: " + operacaoVenda.getValorOperacao()+ " Autor: " + livro1.getAutor() + " Título: " + livro1.getTitulo());
	
	Operacao operacaoEmprestimo = new Operacao("empréstimo", 0.0, livro2);
	operacaoEmprestimo.emprestarLivro();
	System.out.println("Tipo: " + operacaoEmprestimo.getTipo() + " Valor da operação de empréstimo: " + operacaoEmprestimo.getValorOperacao()+ " Autor: " + livro2.getAutor() + " Título: " + livro2.getTitulo());
	
	System.out.println("Valor do livr: " + livro1.getValor());
	livro1.reajuste(6.0);
	System.out.println("valor do livro com reajuste de 10%: " + livro1.getValor());
	
	}
	
}
