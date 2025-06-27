package org.serratec.aula05;

public class Apartamento extends Imovel {

	public Apartamento(String endereco, int numero) {
		super(endereco, numero);
	}
	  
	@Override
	double calcularComissaoVendedor() {
		return getValor() * 0.03;
	}
}
