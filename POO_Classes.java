package curso_programacao;

import java.util.Scanner;

import entities.triangule;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		CLASSES:
		É um tipo estruturado que pode conter(membros):
		= atributos (dados/campos) --> ex: triangulo, ele tem atributos que sao a, b, c, tem dados como nome cpf etc..
		= metodos (funçoes/ operaçoes) 	
		 */
		//Exemplo:
		
		triangule x, y;
		//criando um objeto:
		x = new triangule();
		y = new triangule();
		
		System.out.println("Enter the measure of triangule x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measure of triangule y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println(areaX);
		System.out.println(areaY);
		
		if(areaX > areaY) {
			System.out.println(x);
		}
		else {
			System.out.println(y);
		}
		
		
		sc.close();
	}
}

package entities;

public class triangule {
	//colocando os atributos:
	public double a;
	public double b;
	public double c;

	//criando um funçao para calcular a area do triangulo:
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p*(p - a)*(p-b)*(p-c));
		return result;
}


