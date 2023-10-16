package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Dinheiro;

public class Main {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		/*
		  MEMBROS ESTATICOS EXERCICIOS:
		 */
		  //
		//EXERCICIO 1:
		 
		
		System.out.printf("What is the dollar price: %.2f%n " , Dinheiro.DOLAR);
		
		
		System.out.print(" How many dollars will be bought? ");
		double dolar2= sc.nextDouble();
		
		
		double total = Dinheiro.CurrencyConverter(dolar2);
		
		
		
		System.out.printf("Amount to be paid in reais = %.2f%n " , total);
		
	
		
		
		
		sc.close();
}
}