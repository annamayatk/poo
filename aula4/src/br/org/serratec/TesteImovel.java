package br.org.serratec;

public class TesteImovel {
	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("Anna");
		Casa casa = new Casa("Centro", 20000., p1, true);
		
		System.out.println("Valor do ITBI: " + casa.calcularITBI());
		System.out.println(casa);
	}
}
