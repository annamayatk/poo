package org.serratec.aula05;

public class Terreno extends Imovel {

	public Terreno(String endereco, int numero) {
		super(endereco, numero);
	}

	@Override
	double calcularComissaoVendedor() {
		return getValor() * 0.05;
	}
}
