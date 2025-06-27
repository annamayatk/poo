package org.serratec.exemplo;

public abstract class Faculdade extends Universidade {
	protected String nomeFaculdade;
	protected int blocos;
	
	public Faculdade(String nome, String nomeFaculdade, int blocos) {
		super(nome);
		this.nomeFaculdade = nomeFaculdade;
		this.blocos = blocos;
	}
	
	@Override
	public String toString() {
		return "Faculdade [nomeFaculdade=" + nomeFaculdade + ", blocos=" + blocos + "]";
	}

	
	public String getNomeFaculdade() {
		return nomeFaculdade;
	}

	public int getBlocos() {
		return blocos;
	}

	public abstract String matrizCurricular();
	
}