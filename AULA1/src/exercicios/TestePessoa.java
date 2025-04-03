package exercicios;

public class TestePessoa {

	public static void main(String[] args) {
			Pessoa pessoa1 = new Pessoa();
			Pessoa pessoa2 = new Pessoa();
				
			Pessoa pessoa3 = new Pessoa();
			
			pessoa1.setNome("Diogo");
			pessoa1.setPeso (83.0);
			pessoa1.setAltura(1.79);
			
			pessoa2.setNome ("Diogo");
			pessoa2.setPeso (63.0);
			pessoa2.setAltura(1.75);
			
			System.out.println(pessoa1.getNome() + ", você está " + pessoa1.resultado());
			System.out.println(pessoa2.getNome() + ", você está " + pessoa2.resultado());
		
			System.out.println(pessoa1.getNome().equals(pessoa2.getNome()));
			System.out.println(pessoa1);
			System.out.println(pessoa2);
	}

}
