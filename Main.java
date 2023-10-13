package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//soluçao sem o POO:
		double xA , xB, xC , yA, yB, yC;
		
		System.out.println("enter the measures of triangle x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("enter the measures of triangle y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p*(p-xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p*(p-yA) * (p - yB) * (p - yC));
		
		System.out.printf("triangule X area: %.4f%n", areaX );
		System.out.printf("triangule Y area: %.4f%n", areaY );
		
		if(areaX > areaY) {
			System.out.println("larger area: X");
		}
		else {
			System.out.println("larger area : Y");
		}
		
		sc.close();
	}
}
