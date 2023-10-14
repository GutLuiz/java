package curso_programacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 EXERCICIOS DE FIXAÇAO DE POO:
		 */
		// exercicio 1:
		Retangulo retangulo = new Retangulo();
		
		System.out.println("enter rectangule width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		
		System.out.printf("AREA = %.2f%n" , retangulo.Area());
		System.out.printf("PERIMETER= %.2f%n " , retangulo.Perimenter());
		System.out.printf("DIAGONAL = %.2f%n " , retangulo.Diagonal());
		
		
		
		sc.close();
	}
}
