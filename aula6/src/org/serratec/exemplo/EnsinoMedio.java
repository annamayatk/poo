package org.serratec.exemplo;

public final class EnsinoMedio extends ColegioAplicacao {
	protected int numeroAlunos;
	
	public EnsinoMedio(String nome, String nomeCoordenador, int numeroAlunos) {
		super(nome, nomeCoordenador);
		this.numeroAlunos = numeroAlunos;
	}

	@Override
	public void reuniaoDePais() {		
	}

	@Override
	public void fazerMatricula() {		
	}


	
}
