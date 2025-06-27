package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroClientes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Cliente> listaClientes = new ArrayList<>();

		while (true) {
			System.out.println("Digite o ID do cliente (negativo para sair): ");
			Integer id = scanner.nextInt();
			scanner.nextLine();

			if (id < 0) {
				break;
			}

			System.out.println("Digite o nome do cliente: ");
			String nome = scanner.nextLine();

			System.out.println("Digite a idade do cliente: ");
			Integer idade = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Digite o telefone do cliente: ");
			String telefone = scanner.nextLine();

			Cliente cliente = new Cliente(id, nome, idade, telefone);
			listaClientes.add(cliente);

		}

		if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente");
        } else {
            System.out.println("\n--- Lista de Clientes ---");
            for (Cliente c : listaClientes) {
                System.out.println(c);
                System.out.println("------------------------");
            }
        }

		scanner.close();
	}
}
