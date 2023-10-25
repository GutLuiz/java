package curso_programacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Funcionario;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		for(int i = 0 ; i < N ; i ++) {
			
			System.out.println();
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary : ");
			Double salary = sc.nextDouble();
			
			Funcionario emp = new Funcionario (id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		int pos = position(list, idsalary);
		if(pos == -1) {
			System.out.println("this id dos not exist!");
		}
		else {
			System.out.println("Enter the porcentage: ");
			double percent = sc.nextDouble();
			list.get(pos).aumentarSalario(percent); 
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for(Funcionario emp: list) {
			System.out.println(emp);
		}
		
		
		
		
		
		sc.close();
	}
	
	public static int  position(List<Funcionario> list, int id) { 
			for(int i = 0 ; i < list.size();i ++) {
				if(list.get(i).getId() == id) {
					return i;
				}
			}
			return -1;
	}
}
package util;

public class Funcionario {
			private Integer id;
			private String name;
			private Double Salary;
			
			public Funcionario() {
				
			}
			public Funcionario(Integer id, String name, Double salary) {
				this.id = id;
				this.name = name;
				this.Salary = salary;
			}
			
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public Double getSalary() {
				return Salary;
			}
			public void setSalary(Double salary) {
				Salary = salary;
			}
			
			public void aumentarSalario(double percentage) {
				Salary += Salary * percentage / 100;
			}
			@Override
			public String toString() {
				return id + ", " + name + ", " + String.format("%.2f", Salary);
			}
			
			
}
