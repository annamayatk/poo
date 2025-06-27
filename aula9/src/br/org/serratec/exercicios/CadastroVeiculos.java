package br.org.serratec.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadastroVeiculos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Veiculo> mapaVeiculos = new HashMap<>();

		System.out.println("Cadastro de veículos. Digite 'sair' como placa para encerrar");

		while (true) {
			System.out.println("\nPlaca: ");
			String placa = scanner.nextLine();

			if (placa.equalsIgnoreCase("sair")) {
				break;
			}

			System.out.println("Marca: ");
			String marca = scanner.nextLine();

			System.out.println("Modelo: ");
			String modelo = scanner.nextLine();

			System.out.println("Ano: ");
			int ano = scanner.nextInt();
			scanner.nextLine();

			Veiculo veiculo = new Veiculo(marca, modelo, ano);
			mapaVeiculos.put(placa, veiculo);
		}

		// buscar veiculo pela placa
		System.out.println("\nDigite a placa que deseja buscar: ");
		String placaBusca = scanner.nextLine();

		Veiculo veiculoBuscado = mapaVeiculos.get(placaBusca);

		if (veiculoBuscado != null) {
			System.out.println("Veiculo encontrado: ");
			System.out.println("Marca: " + veiculoBuscado.getMarca());
			System.out.println("Modelo: " + veiculoBuscado.getModelo());
			System.out.println("Ano: " + veiculoBuscado.getAno());
		} else {
			System.out.println("Veiculo nao encontrado com a placa: " + placaBusca);
		}

	}
}
