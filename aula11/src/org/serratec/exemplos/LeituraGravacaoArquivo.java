package org.serratec.exemplos;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraGravacaoArquivo {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo");
			String nomeArquivo = sc.next();
			FileReader file = new FileReader(nomeArquivo);
			Scanner scArquivo = new Scanner(file);
			List<Empregado> empregados = new ArrayList<>();

			while (scArquivo.hasNext()) {
				String linha = scArquivo.nextLine();
				if (!linha.isEmpty()) {
					String[] dados = linha.split(";");
					System.out.println(dados[0]);
					System.out.println(dados[1]);
					System.out.println(dados[2]);
				}
			}
			scArquivo.close();
			file.close();
			sc.close();

		} catch (Exception e) {
			System.err.println("Arquivo não encontrado");
		}
	}
}
