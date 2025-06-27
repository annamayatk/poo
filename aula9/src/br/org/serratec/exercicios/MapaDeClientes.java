package br.org.serratec.exercicios;

import java.util.HashMap;
import java.util.Map;

public class MapaDeClientes {

	public static void main(String[] args) {
		
		String[][] clientes = {
				{"123", "Marcos", "m@gmail.com"},
				{"143", "Carla", "c@gmail.com"},
				{"167", "Anna", "a@gmail.com"}
		};
		
		Map<String, String> mapaClientes = new HashMap<>();
		
		for (int i=0; i < clientes.length; i++ ) {
			String id = clientes[i][0];
			String nome = clientes[i][1];
			String email = clientes[i][2];
			
			String valor = nome + "-" + email;
			
			mapaClientes.put(id, valor);
		}
		
		for (Map.Entry<String, String> entrada : mapaClientes.entrySet()) {
			System.out.println("Id: " + entrada.getKey() + " | Dados: " + entrada.getValue());
		}
	}

}
