package aulas;

public class CalculoInss {

	public static void main(String[] args) {
		String nome = "Humberto da Silva";
		double salario = 4092.0;
		String salarioFinal = calcularDescontoInss(salario);
		System.out.println("Sr.(a) " + nome);
		System.out.println("Salário inicial: " + salario + " ---> " + salarioFinal);
	}

	public static String calcularDescontoInss(double salario) {
		double salarioDescontado;

		if (salario <= 1518.0) {
			return "Desconto de 0%";
		} else if (salario >= 1518.01 && salario <= 2793.88) {
			salarioDescontado = salario * 0.91;
			return "Desconto de 9%" + " = " + salarioDescontado;
		} else if (salario >= 2793.89 && salario <= 4190.83) {
			salarioDescontado = salario * 0.88;
			return "Desconto de 12%" + " = " + salarioDescontado;
		} else if (salario >= 4190.84 && salario <= 8157.41) {
			salarioDescontado = salario * 0.86;
			return "Desconto de 14%" + " = " + salarioDescontado;
		} else {
			return "Sem informações do INSS";
		}
	}
}