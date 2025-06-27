package org.serratec.testes;

import org.serratec.calculos.TotalImposto;
import org.serratec.exemplos.Empresa;
import org.serratec.exemplos.Pessoa;

public class TesteImposto {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Sandro", 25000.);
		Empresa empresa = new Empresa("XPTO Ltda", 100000.);
		TotalImposto ti = new TotalImposto();
		
		System.out.println("Total Pagar pessoa: " + pessoa.calcularIR());
		System.out.println("Total pagar empresa: " + empresa.calcularIR());
		System.out.println("Total pagar ICMS: " + empresa.calcularICMS());
		
		
	}

}
