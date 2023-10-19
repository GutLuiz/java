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
package util;

public class Dinheiro {
	public static final double DOLAR = 5.05;
	
	public static double CurrencyConverter(double dolar2){
		return (dolar2 * DOLAR) + ((dolar2 * 6) /100) ;
	}
}
