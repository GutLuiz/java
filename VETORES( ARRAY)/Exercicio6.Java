package curso_programacao;
import java.util.Locale;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 6:
		System.out.print("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int i;
		
		for(i = 0 ; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		double media = 0;
		
		int pares = 0;
		double soma = 0;
		for(i = 0 ; i < n; i++) {
			if(vect[i] % 2 == 0) {
				soma  += vect[i];
				pares ++;
		}
		
			
		if(pares == 0) {
			System.out.println("Nenhum numero par!");
		}
		else {
			media = soma / pares;
			System.out.println("Media dos pares: " + media);
		}
	
		
		
	
	
		sc.close();
	}
}
}
