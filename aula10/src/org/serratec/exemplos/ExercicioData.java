package org.serratec.exemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*Faça um programa para ler uma data no formato dd/MM/yyyy e 
 * apresente ela no formato yyyyMMdd
 */

public class ExercicioData {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a data no formato dd/MM/yyyy: ");
		String dataString = scanner.nextLine();

		try {
			DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate data = LocalDate.parse(dataString, formatoEntrada);

			DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("yyyyMMdd");

			String dataFormatada = data.format(formatoSaida);

			System.out.println("Data no formato yyyyMMdd: " + dataFormatada);
		} catch (Exception e) {
			// Se ocorrer algum erro no parse, exibir uma mensagem
			System.out.println("Formato de data inválido. Por favor, use dd/MM/yyyy.");
		}

		// Fechar o scanner
		scanner.close();
	}

}
