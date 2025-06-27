package org.serratec.exemplo;

public class TecnicoConcomitante extends ColegioAplicacao {
	protected String nomeCurso;
	
	public TecnicoConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
		super(nome, nomeCoordenador);
		this.nomeCurso = nomeCurso;
	}

	@Override
	public void reuniaoDePais() {		
	}

	@Override
	public void fazerMatricula() {		
	}
	
}
