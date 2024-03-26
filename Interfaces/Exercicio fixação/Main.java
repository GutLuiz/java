package curso_programacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.Contrato;
import model.ContratoServico;
import model.Installment;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			System.out.println("Entre com os dados do contrato: ");
			System.out.print("Numero: ");
			int nmr = sc.nextInt();
			System.out.print("Data (dd/MM/yyy): ");
			LocalDate date = LocalDate.parse(sc.next(), fmt);
			System.out.print("Valor do contrato; ");
			double totalValue = sc.nextDouble();
			
			Contrato obj = new Contrato(nmr, date, totalValue);
			
			System.out.print("Entre com o numero de parcelas");
			int n = sc.nextInt();
			
			ContratoServico contratoServico = new ContratoServico(null);
			
			contratoServico.processContract(obj, n);
			
			System.out.println("Parcelas: ");
			
			for(Installment install : obj.getInstallment()) {
				System.out.println(install);
			}
			
	        sc.close();
	}

}
