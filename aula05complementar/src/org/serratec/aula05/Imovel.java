package org.serratec.aula05;

public class Imovel {
	private String endereco;
	private int numero;
	private String complemento;
	private double valor;
	private String adicionais;
	public static int totalImoveis = 0;

	public Imovel(String endereco, int numero) {
		super();
		this.endereco = endereco;
		this.numero = numero;
		totalImoveis++;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getAdicionais() {
		return adicionais;
	}

	void descreverImovel() {
		System.out.println("Endereço: " + endereco + ", número: " + numero);
		System.out.println("Complemento: " + complemento);
		System.out.println("Valor: " + valor);
		System.out.println("Adicionais: " + adicionais);
	}

	double calcularComissaoVendedor() {
		return valor * 0.1;
	}

	double calcularComissaoVendedor(double valor) {
		return valor + 300;
	}

	void incluirAdicionais(String texto) {
		if (adicionais == null) {
			adicionais = texto;
		} else {
			adicionais = adicionais + "\n" + texto;
		}
	}

}
