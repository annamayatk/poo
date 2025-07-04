package org.serratec.exemplos;

import java.time.LocalDate;

public class Pedido {
	private Integer numero; /// Integer com letra maiuscula => vira uma classe, e ai dá para usar metódos para comparar etc.
	private LocalDate data;
	private Double valor;
	private Integer quantidade;
	private Double total;

	public Pedido(Integer numero, LocalDate data, Double valor, Integer quantidade) {
		this.numero = numero;
		this.data = data;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getTotal() {
		return quantidade * valor;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}