package org.serratec.aula05;

public class Principal {
	
	public static void main(String[] args) {
		Imovel imovel1 = new Imovel("Rua A", 20);
		imovel1.incluirAdicionais("vaga de garagem");
		imovel1.setValor(60000);
		imovel1.incluirAdicionais("piscina");
		imovel1.incluirAdicionais("academia");
		imovel1.incluirAdicionais("jacuzzi");
		
		Imovel imovel2 = new Apartamento("Rua B", 30);
		imovel2.setValor(60000);
		imovel2.incluirAdicionais("3 vagas de garagem");
		
		Imovel imovel3 = new Terreno("Rua C", 40);
		imovel3.setValor(60000);
		
		System.out.println("Dados imóvel 1");
		imovel1.descreverImovel();
		
		System.out.println("Dados imóvel 2");
		imovel2.descreverImovel();
		
		System.out.println("Dados imóvel 3");
		imovel3.descreverImovel();
		
		Imovel[] imoveis = {imovel1, imovel2, imovel3};
		for (Imovel  imovel : imoveis) {
			System.out.println("Comissão: " + imovel.calcularComissaoVendedor());
		}
		
		System.out.println("Comissão diferenciada: " + imovel1.calcularComissaoVendedor(500));
	}
	
	
}
