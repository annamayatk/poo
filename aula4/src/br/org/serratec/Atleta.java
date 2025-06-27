package br.org.serratec;

public class Atleta implements Olimpiadas {
	String nome;
	Double peso;
	String modalidade;
	Integer totalParticipantes;
	Pais pais;
	
	public Atleta(String nome, Double peso, String modalidade, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		//this.totalParticipantes = totalParticipantes;
		this.pais = pais;
	}
	
	public String verificaSituacao() {
		if (peso>90) {
			modalidade = "peso pesado";
			return "participará";
		}else if (peso >= 60 && peso <= 90) {
			modalidade = "peso médio";
			return "participará";
		}else {
			return "não participará";
		}
	}
	
	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", peso=" + peso + ", modalidade=" + modalidade + ", totalParticipantes="
				+ totalParticipantes + ", pais=" + pais + "]";
	}
	public String getNome() {
		return nome;
	}
	public Double getPeso() {
		return peso;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public Integer getTotalParticipantes() {
		return totalParticipantes;
	}
	public Pais getPais() {
		return pais;
	}
	
	
}
