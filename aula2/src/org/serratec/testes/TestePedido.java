package org.serratec.testes;

import java.time.LocalDate;

import org.serratec.exemplos.Pedido;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(123, LocalDate.of(2025, 2, 3), 2000., 5);
		
		System.out.println("Número pedido:" + pedido1.getNumero() + " Total: " + pedido1.getTotal());
	}
	
}