package curso_programacao;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*
			FORMATAÇAO DE DATAS:
		 */
		
			
			LocalDate d04 = LocalDate.parse("2022-07-20"); //Imprimir uma data qualquer
			LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Data com o tempo
			Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
			
			//FORMATANDO:
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM");//imprimindo horas e minutos agora.
			DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM").withZone(ZoneId.systemDefault()); //formatando para horario local
			
			
			
			
			System.out.println("d04 = " + d04.format(fmt1));//imprimir de outra forma a data.
			System.out.println("d05 = " + d05.format(fmt2));
			System.out.println("d06 = " + fmt3.format(d06));
			
		sc.close();
		
	}
}

		
