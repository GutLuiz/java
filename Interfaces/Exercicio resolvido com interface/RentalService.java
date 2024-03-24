package model;

import java.time.Duration;

public class rentalService {
	private double pricePerDay;
	private double pricePerHour;
	
	private BrazilTaxService taxService;

	public rentalService(double pricePerDay, double pricePerHour, BrazilTaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes(); //Usando o duration.between para calcular a diferença entre dois objetos de tempo como por exemplo da questao, o localdatetime.
		double hours = minutes/ 60;
		
		double Payment;
		if(hours <= 12) {
			Payment = pricePerHour * Math.ceil(hours);//arrendondando pra cima 
		}
		else {
			Payment = pricePerDay * Math.ceil(hours/24);
		}
		
		
		double tax = taxService.tax(Payment);
		
		carRental.setInvoice(new Invoice(Payment,tax));
	}
	
	
}
