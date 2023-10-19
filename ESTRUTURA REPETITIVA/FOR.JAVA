package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// estrutura repetitiva "for":
		//sintaxe da estrutura:
		
		// for(inicio ; condicao ; incremento){
		// comando 1
		// comando 2
		// }
		
		//exemplos:
		
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		//contagem regressiva usando "for":
		
		for(int i=4; i>=0; i--) {
			System.out.println("valor de i: " + i);
		}
		
		
		System.out.println(soma);
		
		
		
		
		

		sc.close();

	}

}
