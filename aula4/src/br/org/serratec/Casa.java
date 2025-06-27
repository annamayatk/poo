package br.org.serratec;

public class Casa extends Imovel {
	private Boolean garagem;

	public Casa(String local, Double valor, Proprietario proprietario, Boolean garagem) {
		super(local, valor, proprietario);
		this.garagem = garagem;
	}

	
	@Override
	public String toString() {
		return super.toString() + "Possui garagem: " + (garagem == true ? "Sim" : "Não");
	}

	public Boolean getGaragem() {
		return garagem;
	}

	public void setGaragem(Boolean garagem) {
		this.garagem = garagem;
	}
	
	
	
	
}
