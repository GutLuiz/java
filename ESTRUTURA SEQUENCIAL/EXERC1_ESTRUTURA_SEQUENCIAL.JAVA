package curso_programacao;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//exercicio 1 estrutura sequencial:
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("area = %.2f%n", area);
		System.out.printf("preço = %.2f%n", preco);
			
		
		
		sc.close();
		
	}

}
