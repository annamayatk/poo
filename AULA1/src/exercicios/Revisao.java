package exercicios;

public class Revisao {

	// função inicio abaixo
	public static void main(String[] args) {
		int valor;
		String[] nomes = { "Laranja", "Amarelo", "Preto" };

		System.out.println("Aula 1");
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("Preto")) {
				continue;
			}
			System.out.println(nomes[i]);
		}
	}
}
