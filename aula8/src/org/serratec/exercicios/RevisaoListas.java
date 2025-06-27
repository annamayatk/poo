package org.serratec.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevisaoListas {
	public static void main(String[] args) {
		List<String> cores = new ArrayList<>(); //esse dá para adc numeros depois
		cores.add("Branco");
		
		
		List<Integer> numeros = Arrays.asList(10, 20, 30, 40);  //esse aqui nao dá para adc numeros depois
		//numeros.add(60)  isso daria errado
		//  numeros.set(0, 15);   //esse aqui pode!
				
		List<String> times = List.of("Flamengo", "Vasco", "Botafogo", "Fluminense");
		//esse tipo de lista nao aceita nem adicao nem modificacao
	}
}
