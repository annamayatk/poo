package org.serratec.exemplos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class TesteLocalDate {

	public static void main(String[] args) {
			
		LocalDate dataHoje = LocalDate.now();
		LocalDate dataManual = LocalDate.of(2025, 4, 16);
		
		Locale locale = new Locale ("pt", "BR");
		
		System.out.println(dataManual.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, locale));
		System.out.println(dataHoje.isLeapYear() ? "Sim" : "Nao é bissexto");
		
		LocalTime hora = LocalTime.now();
		System.out.println(hora.plusHours(2));
		
		LocalDate dataNascimento = LocalDate.of(1998, 5, 7);
		
		Period periodo = Period.between(dataNascimento, dataHoje);
		System.out.println("sua idade é: " + periodo.getYears() + " anos " + periodo.getMonths() + " meses " + periodo.getDays() + " dias");
	}

}
