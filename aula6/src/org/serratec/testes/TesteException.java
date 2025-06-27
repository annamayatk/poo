package org.serratec.testes;

public class TesteException {

	public static void main(String[] args) {

		try {
			System.out.println("Resultado: " + divisao(10, 0));

		} catch (ArithmeticException ex) {
			System.out.println("Impossivel dividir por zero");
			ex.printStackTrace();
		}

	}

	public static int divisao(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Operação inválida, divisão por ZERO ");
		} else {
			return a / b;
		}
	}
}

/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * org.serratec.testes.TesteException.divisao(TesteException.java:9) at
 * org.serratec.testes.TesteException.main(TesteException.java:5)
 */