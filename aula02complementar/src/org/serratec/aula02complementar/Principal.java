package org.serratec.aula02complementar;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade = 30;
		double altura = 1.75;
		char turma = 'A';
		String nome = "Diogo Silva";
		
		double nota1 = 10.;
		double nota2 = 10.;
		double media = (nota1 + nota2) / 2;
		
		boolean aprovado = (media > 6.5);
		int conceito = 5;
		boolean recuperacao = (media < 6) || (conceito <6);
		
		if (aprovado) {
			System.out.println("Parabéns, boas férias!");
		} else {
			System.out.println("Aguardo você na recuperação!");
		}
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String outroNumero = "s";

		while (outroNumero.equalsIgnoreCase("s")) {
			System.out.println("Digite um número para verificar a tabuada: ");
			numero = sc.nextInt();
			sc.nextLine();
			
			for(int i=1; i<=10; i++) {
				System.out.printf("%d X %d = %d \n", i, numero, i* numero);
			}
			
			System.out.println("Digitar outro número? Digite S para sim ");
			outroNumero = sc.nextLine();
		}
		sc.close();
	}

}
