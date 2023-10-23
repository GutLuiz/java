package curso_programacao;
import java.util.Locale;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 8:
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int i;
		
		double[] vect = new double[n];
		for(i = 0 ; i < n; i++) {
			  System.out.print("Digite um numero: ");
			  vect[i] = sc.nextDouble(); 
		}
		
		double soma = 0;
		for(i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n; 
		
		System.out.printf("Media do vetor = %.3f%n" , media);
		
		System.out.println("Elementos abaixo da media: ");
		for(i = 0 ; i < n ; i++) {
			if(vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
	
	
		sc.close();
	}
}
