package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Product;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 1:
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		int i = 0;
		int[] vect = new int[n];
		
		
		for( i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i]  = sc.nextInt();
			
		}
		for(i = 0; i < n ; i++) {
			if(vect[i] < 0) {
				System.out.println("NUMEROS NEGATIVOS: " + vect[i]);
			}
		}
		
		
	
		
		
		
		
		
		sc.close();
	}
}
