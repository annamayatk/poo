package org.serratec.exercicio;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected Double valorCobrado = 0.;
	protected LocalDate dataConserto;
	Proprietario proprietario;
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto
				+ ", proprietario=" + proprietario + "]";
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

	public String getModelo() {
		return modelo;
	}
	
	
	
	
	
}
