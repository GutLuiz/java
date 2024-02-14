package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import Exception.BusinessException;
import entities.Account;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number,holder,balance,withdrawLimit);
		
			
		
		
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		try {
			acc.withdraw(amount);
			System.out.println("new balance: " + acc.getBalance());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage()); //pega a mensagem que voce armazenou em outra classe.
		}
		
		
		
		
		
		
		sc.close();
	}
		
} 
