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
			OPERAÇOES IMPORTANTES COM DATA-HORA: 
		 */
		
			
			LocalDate d04 = LocalDate.parse("2022-07-20"); //Imprimir uma data qualquer
			LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Data com o tempo
			Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
			//CONVERTER DATA-HORA GLOBAL PARA LOCAL:
			LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //covertendo um instante para um horario local, considerando o horario do meu computador
			LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));// convertento um instante para um horario local, que nesse exemplo, seria o fuso horario de Portugal.
			LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());// Com o fuso horario da minha maquina, o fuso horario local é 3 horas a menos.
			LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
			
			System.out.println("r1 = " + r1);
			System.out.println("r2 = " + r2);
			System.out.println("r3 = " + r3);
			System.out.println("r4 = " + r4);
			
			System.out.println();
			
			/*
			  OBTER DADOS DE UMA DATA-HORA LOCAL:
			 */
			
			System.out.println("d04 dia da semana= " + d04.getDayOfWeek());
			System.out.println("d04  dia =  " + d04.getDayOfMonth());
			System.out.println("d04  mes =  " + d04.getMonthValue());
			System.out.println("d04  ano =  " + d04.getYear());
			
			System.out.println();
			
			System.out.println("d05 hora = " + d05.getHour());
			System.out.println("d05 minutos = " + d05.getMinute());
			
			
			
			
			
		sc.close();
		
	}
}

		
