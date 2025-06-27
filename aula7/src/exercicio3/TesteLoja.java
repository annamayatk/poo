package exercicio3;

import java.util.ArrayList;

public class TesteLoja {
	public static void main(String[] args) {
		Loja minhaLoja = new Loja("Pet chique", new ArrayList<>());
		
		minhaLoja.adicionarAnimal(new Cachorro("Paco", 9, "Chow chow"));
		minhaLoja.adicionarAnimal(new Cachorro("Cuca", 12, "Labrador"));
		minhaLoja.adicionarAnimal(new Gato("Lily", 6, "Cinza"));
		
		System.out.println("\n🐾 Lista inciial de animais: ");
		minhaLoja.listarAnimais();
		
		try {
			System.out.println("\n Tentando adotar o animal na posicao 1 ");
			minhaLoja.adotarAnimal(1);
			
			System.out.println("\n Tentando adotar o animal na posicao 8");
			minhaLoja.adotarAnimal(8);
		} catch (AnimalException e) {
			System.out.println("Erro ao adotar: " + e.getMessage());
		}
		
		System.out.println("\nLista após adoções: ");
		minhaLoja.listarAnimais();
		
	}
	}

