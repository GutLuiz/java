package curso_programacao;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*
			CALCULOS COM DATA-HORA: 
		 */
			LocalDate d01 = LocalDate.parse("2022-07-20");
			LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
			Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
			
			LocalDate pastWeek = d01.minusDays(7); // d01 - 7 dias
			LocalDate nextWeek = d01.plusDays(7); // d01 + 7 dias
			
			
			LocalDateTime pastWeekTime = d02.minusDays(7);
			LocalDateTime nextWeekTime = d02.plusDays(7);
			
			Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
			Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
			
			
			
			System.out.println("past week = " + pastWeek);
			System.out.println("next week = " + nextWeek);
			System.out.println("past week = " + pastWeekTime);
			System.out.println("next week = " + nextWeekTime);
			System.out.println("past week = " + pastWeekInstant);
			System.out.println("next week = " + nextWeekInstant);
			
			System.out.println();
			
			//DURAÇAO:
			
			Duration t1 =Duration.between(pastWeekTime, d02);
			Duration t2 =Duration.between(pastWeek.atStartOfDay(), d01.atStartOfDay());
			
			System.out.println("T1 dias = " + t1.toDays()); //	Mostrando a diferença de DIAS 
			System.out.println("T2 dias = " + t2.toDays());  
			
		sc.close();
		
	}
}

		
