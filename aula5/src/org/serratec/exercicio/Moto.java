package org.serratec.exercicio;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private Integer cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, Integer cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public Double lavarVeiculo() {
		Double valor = +TipoServico.LAVAGEM.getValorPorServico();
		valorCobrado += valor;
		return valor;
	}

	@Override
	public Double trocarOleo() {
		Double valor = +TipoServico.OLEO.getValorPorServico();
		valorCobrado += valor;
		return valor;
	}

	@Override
	public Double revisao() {
		Double valor = +TipoServico.REVISAO.getValorPorServico();
		valorCobrado += valor;
		return valor;
	}
	
	
}
