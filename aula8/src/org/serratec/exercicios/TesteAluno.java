package org.serratec.exercicios;

import java.util.Set;
import java.util.TreeSet;

public class TesteAluno {
	
	public static void main(String[] args) {
		Set<Aluno> alunos = new TreeSet<>();
		
		alunos.add(new Aluno ("Antonio", "a@gmail.com", 45));
		alunos.add(new Aluno ("Brunos", "b@gmail.com", 67));
		alunos.add(new Aluno ("Carlos", "c@gmail.com", 25));
		alunos.add(new Aluno ("Debora", "d@gmail.com", 12));
		
		for (Aluno a : alunos) {
			System.out.println(a);
		}
	}
}
