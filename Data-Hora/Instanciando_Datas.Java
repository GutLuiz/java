package curso_programacao;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*
			INSTACIANDO DATAS:
		 */
			LocalDate d01 = LocalDate.now(); 
			LocalDateTime d02 = LocalDateTime.now(); // data hora local
			Instant d03 = Instant.now(); // data hora global que tem o fuso horario do GMT(Horario de Londres)
			
			LocalDate d04 = LocalDate.parse("2022-07-20"); //Imprimir uma data qualquer
			LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Data com o tempo
			Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
			Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");// Colocando o fuso horario de Londres(padrao)
			
			//Maneira de formatar do seu jeito a data:
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate d08 = LocalDate.parse("22/09/2023", fmt1);
			
			LocalDate d10 = LocalDate.of(2022, 7, 20);
			
			System.out.println("DO1 = " +d01);
			System.out.println("d02 = " +d02);
			System.out.println("d03 = "+d03);
			System.out.println("d04 = " + d04);
			System.out.println("d05 = " + d05);
			System.out.println("d06 = " + d06);
			System.out.println("d07 = " + d07);
			System.out.println();
			System.out.println("Data formatada:");
			System.out.println("d08 = " + d08);
			System.out.println("d010 = " + d10);
					
			
			

		sc.close();
		
	}
}

		
