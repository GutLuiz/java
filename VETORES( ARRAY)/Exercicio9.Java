package curso_programacao;
import java.util.Locale;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 9:
		System.out.print("Quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();
		int i;
		
		int[] vect = new int[n];
		for(i = 0 ; i < n ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		int npares = 0;
		int soma = 0;
		for(i = 0 ; i < n ; i++) {
			if(vect[i] % 2 == 0 ) {
				soma += vect[i];
				npares ++;
			}
		}
		
		int media = 0;
		
		if(npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			 media = soma/npares;
			 System.out.println("media dos pares = " + media);
		}
		
		
		
	
		sc.close();
	}
}
