package model;

import java.time.LocalDate;

public class ContratoServico {
	
	private OnlinePaymentService online;
	
	
	
	
	public ContratoServico(OnlinePaymentService online) {
		this.online = online;
	}

	public void processContract(Contrato contrato, Integer months) {
		double basicQuota = contrato.getTotalValue() / months;// fazendo a divisão do total pela a quantidade de parcelas.
		
		for(int i = 1; i <= months; i++) {
			LocalDate dueDate = contrato.getDate().plusMonths(i);// colocando a data certa das parcelas adicionando mais um mes
			
			double interest = online.interest(basicQuota, i);// Trazendo o calculo da taxa
			
			double fee = online.paymentFee(basicQuota + interest); // fazendo o calculo trazendo a divisao da parcela de um mes mais a taxa.
			
			double quota = basicQuota + interest + fee; // valor total com a taxa e os juros
			
			contrato.getInstallment().add(new Installment(dueDate,quota)); // nisso ele instancia na lista e adiciona a data e o valor total.
		}
	}
}
