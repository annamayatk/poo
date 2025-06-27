package org.serratec.exercicio;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("Diogo");
		Carro carro = new Carro("Civic Type R", LocalDate.of(2025, 4, 11), p1, "Esportivo");

		carro.trocarOleo();
		carro.revisao();

		System.out.println("Nome do proprietário: " + p1.getNome());
		System.out.println("Dados do carro: " + carro.getModelo() + " " + carro.getCategoria());
		System.out.println("Valor cobrado pelos serviços: " + carro.getValorCobrado());
	}
}
