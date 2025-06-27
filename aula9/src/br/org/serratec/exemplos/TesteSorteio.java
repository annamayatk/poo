package br.org.serratec.exemplos;

public class TesteSorteio {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno ("Ana", 23);
		Aluno aluno2 = new Aluno ("Marcos", 35);
		Aluno aluno3 = new Aluno ("Igor", 49);
		
		Sorteio <Aluno> sortear = new Sorteio<>();
		
		sortear.adicionar(aluno1);
		sortear.adicionar(aluno2);
		sortear.adicionar(aluno3);
		
		System.out.println("Aluno sorteado: " + sortear.sorteio());
	}

}
