package model;

import java.time.LocalDate;

public class ContratoServico {
	
	private OnlinePaymentService online;
	
	
	
	
	public ContratoServico(OnlinePaymentService online) {
		this.online = online;
	}

	public void processContract(Contrato contrato, Integer months) {
		contrato.getInstallment().add(new Installment(LocalDate.of(2018, 7, 25), 206));
		contrato.getInstallment().add(new Installment(LocalDate.of(2018, 8, 25), 208));
	}
}
