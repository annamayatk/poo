package org.serratec.exemplos;

public class Empresa implements Tributos {
	private String razaoSocial;
	private Double rendimentos;
	
	
	public Empresa(String razaoSocial, Double rendimentos) {
		super();
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
	}

	@Override
	public Double calcularIR() {
		return rendimentos * IRPESSOAJURIDICA;
	}
	
	
	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaoSocial + ", rendimentos=" + rendimentos + "]";
	}

	@Override
	public Double calcularICMS() {
		return rendimentos * ICMS;
	}
	

}
