package curso_programacao;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.BrazilTaxService;
import model.CarRental;
import model.Vehicles;
import model.rentalService;



public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			/*
			  									--->INTERFACES<----
			  
			  Interface é um tipo que define um conjunto de operações que uma classe deve implementar.
			  A interface estabelece um contrato que a classe deve cumprir
			  
			  Pra que usar interfaces?
			  	= Para criar sistemas com baixo acoplamento e flexiveis.
			  
			 */
			
			//Problema exemplo:
			
			System.out.println("Entre com os dados do aluguel: ");
			System.out.print("Modelo do carro: ");
			String carModel = sc.nextLine();
			System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
			LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt); // mandando o programa ler do formato que eu quero 
			System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
			LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);
			
			CarRental cr = new CarRental(start,finish, new Vehicles(carModel)); // instaciando o veiculo dentro do CarRental
			
			System.out.print("Entre com o preço por hora: ");
			double pricePerHour = sc.nextDouble();
			System.out.print("Entre com o proço por dia: ");
			double pricePerDay = sc.nextDouble();
			
			rentalService rentalservice = new rentalService(pricePerHour, pricePerDay, new BrazilTaxService());
			
			rentalservice.processInvoice(cr);
			
			
			System.out.println("FATURA: ");
			System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
			System.out.println("Imposto: " + cr.getInvoice().getTax());
			System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
			
			
			
		
	        sc.close();
	}

}
