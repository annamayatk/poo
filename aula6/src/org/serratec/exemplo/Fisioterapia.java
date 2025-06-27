package org.serratec.exemplo;

public final class Fisioterapia extends Faculdade implements Eventos {

	public Fisioterapia(String nome, String nomeFaculdade, int blocos) {
		super(nome, nomeFaculdade, blocos);
	}

	@Override
	public String programacao() {
		return null;
	}

	@Override
	public String conteudoEventos() {
		return null;
	}

	@Override
	public String matrizCurricular() {
		return null;
	}

	@Override
	public void fazerMatricula() {		
	}
	
}
