package curso_programacao;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			
		//exercicio 1:
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("SOMA = " + soma);
		
		//exercicio 2:
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double elevado;
		
		elevado = Math.pow(raio, 2);
		
		double area = elevado * pi;
		
		System.out.println("A = " + area);
		
		//exercicio 3:
		
		int a,b,c,d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d= sc.nextInt();
		
		int diferenca = a * b - c * d;
		
		System.out.println("diferenca = " + diferenca);
		
		//exercicio 4:
		int funcionario = sc.nextInt();
		int horas = sc.nextInt();
		double horasalario = sc.nextDouble();
		
		double salario = horasalario * horas;
		
		
		System.out.println("Numero = " + funcionario );
		System.out.printf("salario = %.2f%n" , salario);
		
		//exercicio 5:
		int peca1 = sc.nextInt();
		int numero1 = sc.nextInt();
		double precopeca1 = sc.nextDouble();
		
		int peca2 = sc.nextInt();
		int numero2 = sc.nextInt();
		double precopeca2 = sc.nextDouble();
		
		double valorfinal= (numero1 * precopeca1) + (numero2 * precopeca2);
		
		System.out.printf("valor a pagar = %.2f%n", valorfinal);
		
		
		//exercicio 6:
		double A,B,C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		double raiocirc;
		double raioquad;
		
		double areatri =  A	* C/2;	
		
		raiocirc = Math.pow(C, 2);
		double areacirc = 3.14159 * raiocirc;
		
		double areatrap = (A+B) * C/2;
		
		raioquad = Math.pow(B, 2);
		double areaquad = raioquad;
		
		double arearet= A * B;
		
		System.out.println("TRIANGULO: " + areatri);
		System.out.println("CIRCULO: "+ areacirc);
		System.out.println("TRAPEZIO: "+ areatrap);
		System.out.println("QUADRADO: "+ areaquad);
		System.out.println("RETANGULO: "+ arearet);
		
		
		sc.close();
		
	}

}
