package org.serratec.exemplo;

public final class Direito extends Faculdade implements Oab, Eventos {
	protected int tempoDuracao;
	
	public Direito(String nome, String nomeFaculdade, int blocos, int tempoDuracao) {
		super(nome, nomeFaculdade, blocos);
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public String toString() {
		return "Direito [tempoDuracao=" + tempoDuracao + "]";
	}
	
	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
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
	public boolean realizarProva() { //Oab
		return false;
	}

	@Override
	public String matrizCurricular() {
		return null;
	}

	@Override
	public void fazerMatricula() {
		
	}
	
	
}
