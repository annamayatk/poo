package org.serratec.exercicio;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public Double lavarVeiculo() {
		Double valor = +TipoServico.LAVAGEM.getValorPorServico();
		valorCobrado += valor;
		return valor;
	}

	@Override
	public Double trocarOleo() {
		Double valor;

		if (dataConserto.getDayOfWeek().name().equals("SATURDAY")) {
			valor = +TipoServico.OLEO.getValorPorServico() - 50.;

		} else {
			valor = +TipoServico.OLEO.getValorPorServico();

		}
		valorCobrado += valor;
		return valor;
	}

	@Override
	public Double revisao() {
		Double valor;

		if (dataConserto.getMonth().name().equals("AUGUST")) {
			valor = +TipoServico.REVISAO.getValorPorServico() * 0.9;
		} else {
			valor = +TipoServico.REVISAO.getValorPorServico();
		}
		valorCobrado += valor;
		return valor;
	}

}
