package org.serratec.exercicios;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		
		// diferença do Set(qualquer tipo de Set) para o List<> ---> Set não permite elementos iguais
		
		Set<String> times = new HashSet<>();
		
		// Set<String> times = new LinkedHashSet<>();  ---> mantem a ordem de inserção da lista
		
		// Set<String> times = new TreeSet<>();  ---> ordena em ordem alfabetica
		

		times.add("Flamengo");
		times.add("Vasco");
		times.add("Vasco");  //nao irá imprimir pois é repetido
		times.add("Fluminense");
		times.add("Botafogo");
		times.add("Flamengo");

		for (String time : times) {
			System.out.println(time);
		}
	}
}
