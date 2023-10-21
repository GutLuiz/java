package curso_programacao;
import java.util.Locale;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 5:
		
		System.out.println("Quantos numeros voce vai digitar: ");
		int  n = sc.nextInt();
		
		double[] vect = new double[n];
		
		int i;
		for(i = 0; i < n ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double maior = vect[0];
		int posicao = 0;
		
		for(i = 0; i < n ; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}
		}
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("Posiçao do maior valor: " + posicao);
		
		
	
		
	
		
		
		
		sc.close();
	}
}
