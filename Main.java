package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static final double PI = 3.14159; // PI seria no codigo uma funçao constante, com isso, adicionamos a palavra "final".E sempre a variavel com letra maisucula.
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
		  //versao 1 (metodo na propria classe do programa):
		  
		
		System.out.println("enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("circuference: %.2f%n " , c);
		System.out.printf("volume: %.2f%n " , v);
		System.out.printf("PI value:  %.2f%n " , PI);
		
		
		
		sc.close();
	}
	public static double circumference(double radius) {
		return  2.0 * PI * radius;
}
	public static double volume(double radius) {
		return  4.0 * PI * radius * radius * radius / 3.0;
}	
}