package exercicio3;

import java.util.ArrayList;
import java.util.List;
import exercicio3.AnimalException;

public class Loja {
	protected String nomeLoja;
	List<Animal> animais = new ArrayList<>();

	public Loja(String nomeLoja, List<Animal> animais) {
		super();
		this.nomeLoja = nomeLoja;
		this.animais = animais;
	}

	public void adicionarAnimal(Animal animal) {
		animais.add(animal);
		System.out.println("Animal adicionado com sucesso!");
	}

	public void listarAnimais() {
		if (animais.isEmpty()) {
			System.out.println("Não há animais disponíveis para adoção.");
		} else {
			System.out.println("--- Animais Disponíveis ---");
			for (int i = 0; i < animais.size(); i++) {
				System.out.println("[" + i + "] " + animais.get(i).imprimir());
				System.out.println("---------------------------");
			}
		}
	}

	public void adotarAnimal(int index) throws AnimalException {
	    if (index < 0 || index >= animais.size()) {
	        throw new AnimalException("Animal não encontrado!");
	    }

	    Animal animalAdotado = animais.remove(index);
	    System.out.println("Animal adotado com sucesso:\n" + animalAdotado.imprimir());
	}

}
