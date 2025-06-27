package exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("João Silva");

        while (true) {
            System.out.println("\n=== Menu da Biblioteca ===");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Pesquisar livros por faixa de preço");
            System.out.println("4. Calcular o total dos livros");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o preço do livro, separando os centavos com virgula: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();  // Limpar o buffer do scanner
                    Livro livro = new Livro(titulo, autor, preco);
                   
                    try {
                        biblioteca.adicionar(livro);
                        System.out.println("Livro adicionado com sucesso!");
                    } catch (PrecoInvalidoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    biblioteca.listar();
                    break;
                case 3:
                    System.out.print("Digite o valor inicial da faixa de preço: ");
                    double valorInicial = scanner.nextDouble();
                    System.out.print("Digite o valor final da faixa de preço: ");
                    double valorFinal = scanner.nextDouble();
                    
                    try {
                        int livrosNaFaixa = biblioteca.pesquisarFaixaDePreco(valorInicial, valorFinal);
                        System.out.println("Número de livros na faixa de preço: " + livrosNaFaixa);
                    } catch (FaixaPrecoInvalidaException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                    
                case 4:
                    double total = biblioteca.calcularTotalLivros();
                    System.out.println("Total em dinheiro dos livros: R$ " + total);
                    break;
                case 5:
                    System.out.println("Saindo... Até logo!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

