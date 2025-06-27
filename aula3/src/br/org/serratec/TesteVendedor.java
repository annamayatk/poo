package br.org.serratec;

import java.util.Scanner;

public class TesteVendedor {
    public static void main(String[] args) {
        // Criando os vendedores (com nome e CPF)
        Vendedor vendedor1Info = new Vendedor("João", "123.456.789-00");
        Vendedor vendedor2Info = new Vendedor("Ana", "987.654.321-00");

        // Criando os vendedores fixos com salário base, comissão e passando o vendedor como parâmetro
        Fixo vendedor1 = new Fixo(3000.00, 0.05, vendedor1Info); // Vendedor 1: Salário base R$3000 e comissão 5%
        Fixo vendedor2 = new Fixo(3500.00, 0.04, vendedor2Info); // Vendedor 2: Salário base R$3500 e comissão 4%

        // Criando o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3) {
            // Menu de opções
            System.out.println("\n___ Sistema de Vendedores ___");
            System.out.println("1 - João");
            System.out.println("2 - Ana");
            System.out.println("3 - Sair");
            System.out.print("Escolha o vendedor (1, 2 ou 3): ");
            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

            switch (opcao) {
                case 1:
                    // Exibir informações do Vendedor João
                    vendedor1.exibirInformacoes();

                    // Perguntar o valor da venda
                    System.out.print("\nDigite o valor da venda para João: R$ ");
                    double valorVenda1 = scanner.nextDouble();
                    vendedor1.calcularSalario(valorVenda1); // Calcular o salário de João com o valor da venda

                    // Exibir informações atualizadas de João
                    System.out.println("Após o cálculo do salário bruto:");
                    vendedor1.exibirInformacoes();
                    break;

                case 2:
                    // Exibir informações do Vendedor Ana
                    vendedor2.exibirInformacoes();

                    // Perguntar o valor da venda
                    System.out.print("\nDigite o valor da venda para Ana: R$ ");
                    double valorVenda2 = scanner.nextDouble();
                    vendedor2.calcularSalario(valorVenda2); // Calcular o salário de Ana com o valor da venda

                    // Exibir informações atualizadas de Ana
                    System.out.println("Após o cálculo do salário bruto:");
                    vendedor2.exibirInformacoes();
                    break;

                case 3:
                    // Sair do programa
                    System.out.println("\n___ Salários Finais ___");
                    vendedor1.exibirInformacoes();
                    vendedor2.exibirInformacoes();
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Fechar o Scanner
        scanner.close();
    }
}
