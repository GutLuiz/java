package curso_programacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 EXERCICIOS DE FIXAÇAO DE POO:
		 */
		// exercicio 2:
		Funcionario x = new Funcionario();
		
		System.out.print("NAME: " );
		x.Name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		x.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		x.Tax = sc.nextDouble();
		
		System.out.printf("Employee: " + x.Name +"," +  "$ %.2f%n" , x.NetSalary());
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		
		System.out.printf("Upadate data: " + x.Name + "," + "$ %.2f%n" , x.result);
		
		
		
		
		sc.close();
	}
}
package entities;

public class Funcionario {
		public String Name;
		public double GrossSalary;
		public double Tax;
		public double result;
		
		
		
		public double NetSalary() {
			return GrossSalary - Tax;
		}
		public void increaseSalary(double percentage) {
			 double increaseAmount = (GrossSalary * percentage) / 100;
		        result = GrossSalary + increaseAmount - Tax;
			   
		}
}

