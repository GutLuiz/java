package curso_programacao;
import java.util.Locale;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 7:
		
		System.out.print("Quantos valores vai ter cadda vetor? ");
		int n = sc.nextInt();
		int i;
		
		int[] vectA = new int[n];
		
		
		System.out.println("Digite os valores do vetor A: ");
		for(i = 0; i < n; i++) {
			
			vectA[i] = sc.nextInt();
		}
		
		int[] vectB = new int[n];
		
		System.out.println("Digite os valores do vetor B: ");
		for(i = 0; i < n; i++) {
			
			vectB[i] = sc.nextInt();
		}
		
		int soma = 0;
		System.out.println("Valor resultante: ");
		for(i = 0 ; i < n; i++) {
				soma = vectA[i] + vectB[i];
				System.out.println(soma);
		}
			
	
	
		sc.close();
	}
}
