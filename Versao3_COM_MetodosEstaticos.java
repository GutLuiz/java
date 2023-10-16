package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Main {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		/*
		  MEMBROS ESTATICOS (membros de classe):
		  =Sao membros que fazem sentido independentemente de objetos. Nao precisam de objetos para serrem chamados.
		   Sao chamados do proprio nome da classe.
		  
		  -APLICAÇOES COMUNS:
		  = classes utilitarias, exemplo: Math.sqrt(double);
		  = declaraçao de constantes
		 */
		  //exemplos:
		  //versao 3 (colocando as classes diretamente na main):
		
		 
		
		System.out.println("enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("circuference: %.2f%n " , c);
		System.out.printf("volume: %.2f%n " , v);
		System.out.printf("PI value:  %.2f%n " , Calculator.PI);
		
		
		
		sc.close();
}
}
package util;

public  class Calculator {	
	public static final double PI = 3.14159; 
	
	public static double circumference(double radius) {
		return  2.0 * PI * radius;
}
	public static double volume(double radius) {
		return  4.0 * PI * radius * radius * radius / 3.0;
}	

}

