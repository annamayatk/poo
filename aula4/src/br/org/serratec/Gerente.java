package br.org.serratec;

public class Gerente extends Funcionario {
	private String nivel;

	public Gerente(String cpf, String nome, Double salario, String nivel) {
		super(cpf, nome, salario);
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Gerente [nivel=" + nivel + "]";
	}

	public String getNivel() {
		return nivel;
	}
	
	@Override
	public void reajusteSalarial(Double valor) {
		salario = salario + salario * valor / 100;
	}
	
}
