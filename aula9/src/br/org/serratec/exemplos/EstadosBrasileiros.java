package br.org.serratec.exemplos;

import java.util.Map;
import java.util.TreeMap;

public class EstadosBrasileiros {
	public static void main(String[] args) {
		Map<String, String> estados = new TreeMap<>();

		estados.put("MG", "Minas Gerais");
		estados.put("SP", "São Paulo");
		estados.put("ES", "Espírito Santo");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("AC", "Acre");

		for (Map.Entry<String, String> entrada : estados.entrySet()) {
			System.out.println("Sigla: " + entrada.getKey() + " - Estado: " + entrada.getValue());
		}
	}
}
