package br.org.serratec;

public class Assistente extends Funcionario {
	private Double adicional;

	public Assistente(String cpf, String nome, Double salario, Double adicional) {
		super(cpf, nome, salario);
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return "Assistente [adicional=" + adicional + ", cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + "]";
	}

	public Double getAdicional() {
		return adicional;
	}
	
	@Override
	public void reajusteSalarial(Double valor) {
		salario = salario + salario * valor / 100 + adicional;
	}
}
