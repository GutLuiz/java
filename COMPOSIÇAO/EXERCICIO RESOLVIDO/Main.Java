package curso_programacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Work;
import entities.enums.WorkLevel;



public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		/*
		    ----> COMPOSIÇAO <-----
		    = E um tipo de associaçao que permite que um objeto contenha outro.
		    	- Relaçao "tem-um" ou "tem-varios"
		    	
		    ==VANTAGENS:
		    	- Organizçao
		    	- coesao
		    	- flexibilidade
		    	- reuso
		 */
		//exemplo resolvido:
		
		System.out.print("Enter department name: ");
		String departamentoNome = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary:  ");
		double workerSalary = sc.nextDouble();
		
		Work worker = new Work(workerName, WorkLevel.valueOf(workerLevel), workerSalary, new Departamento(departamentoNome));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			System.out.println("Enter contract #" + i + "data:");
			System.out.print("Date (DD/MM/YYYY): " );
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration(Hours): ");
			int hours = sc.nextInt();
			HoraContrato contract = new HoraContrato(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		
		System.out.print("Enter month and year to calculate income(MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartamento());
		System.out.println("Income: " + monthAndYear + ": " + worker.income(year, month));
		
		
sc.close();
		
	}
}

		
