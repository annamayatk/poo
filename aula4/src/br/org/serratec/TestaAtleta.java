package br.org.serratec;

public class TestaAtleta {
	 public static void main(String[] args) {
		Pais pais1 = new Pais ("Brasil");
		Pais pais2 = new Pais ("China");
		
		Atleta atleta1 = new Atleta("Diego Hypolito", 65.0, "Ginástica", pais1);
		Atleta atleta2 = new Atleta("Paulo André", 75.0, "Atletismo", pais1);
		Atleta atleta3 = new Atleta("Xin Jiang", 98.0, "Futebol", pais2);
		
		int totalParticipantes = 0;
		
		String situacao1 = atleta1.verificaSituacao();
		System.out.println(atleta1.getNome() + " - " + situacao1);
		if (situacao1.equals("participará")) totalParticipantes++;
		
		String situacao2 = atleta2.verificaSituacao();
		System.out.println(atleta2.getNome() + " - " + situacao2);
		if (situacao2.equals("participará")) totalParticipantes++;

		String situacao3 = atleta3.verificaSituacao();
		System.out.println(atleta3.getNome() + " - " + situacao3);
		if (situacao3.equals("participará")) totalParticipantes++;

		System.out.println("Total de participantes: " + totalParticipantes);
	}
}
