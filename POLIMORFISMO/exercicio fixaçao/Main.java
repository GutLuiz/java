package curso_programacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;



public class Main {

    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);	
   
    
    System.out.print("Quantos funcionarios tem?");
    int n = sc.nextInt();
    
    List<Employee> list = new ArrayList<>();
    int i;
    for(i = 1; i <= n ; i ++) {
    	System.out.println("Employee #" + i + "data:");
    	System.out.print("Outsourced?(y/n)");
    	char ch = sc.next().charAt(0);
    	System.out.print("Name:");
    	sc.nextLine();
    	String name = sc.nextLine();
    	System.out.print("Hours: ");
    	int hours = sc.nextInt();
    	System.out.print("value per Hour: ");
    	double valuePerHour = sc.nextDouble();
    	
    	if(ch == 'y') {
    		System.out.print("Additional charge: ");
    		double additionalCharge = sc.nextDouble();
    		Employee emp = new OutsourceEmployee(name,hours,valuePerHour,additionalCharge);
    		list.add(emp);
    	}
    	else {
    		Employee emp = new Employee (name, hours, valuePerHour);
    		list.add(emp);
    	}
    }
    
    System.out.println();
    System.out.println("PAYMENTS: ");
    for (Employee emp : list) {
    	System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
    }
    
    
    
    
    sc.close();
       
    }
}
