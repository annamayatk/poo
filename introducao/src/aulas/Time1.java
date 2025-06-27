package aulas;

public class Time1 {
	public static void main(String[] args) {
		String estado = "Rio de Janeiro";
		String time = "";
		
		switch (estado) {
		case "Rio de Janeiro" :
			time = "Flamengo";
			break;
		case "São Paulo" :
			time = "Corinthians";
			break;
		default:
			time = "Time não encontrado";
			break;
		}
		
		System.out.println(estado + time);
	}
}
