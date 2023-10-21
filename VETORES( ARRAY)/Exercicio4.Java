package curso_programacao;
import java.util.Locale;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 4:
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		int i;
		for(i = 0 ; i < n ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		int quantidade = 0;
		for(i = 0 ; i < n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.println("Numero par : " + vect[i]);
				quantidade += 1; 
			}
		}
		System.out.println("Quantidade de pares = " + quantidade);
		
		
		
	
		
	
		
		
		
		sc.close();
	}
}
