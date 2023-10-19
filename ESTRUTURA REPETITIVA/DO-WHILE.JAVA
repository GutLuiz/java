
package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//estrutura "do-while":
		// sintaxe da estrutura:
		// do{
		// comando 1
		// comando 2
		//}while(condicao);
		
		//comparando estrutras
		
		//exemplo com a estrutra while:
		System.out.print("digite a temperatura em celsius:");
		double c = sc.nextDouble();
		
		double f = 9.0 * c / 5.0 + 32;
		System.out.printf("equivalente em fahrenheit: %.1f%n ",f);
		 
		System.out.print("deseja repetir (s/n?)");
		char resposta = sc.next().charAt(0);
		
		while(resposta != 'n') {
			System.out.print("digite a temperatura em celsius:");
			c = sc.nextDouble();
			
			f = 9.0 * c / 5.0 + 32;
			System.out.printf("equivalente em fahrenheit: %.1f%n ",f);
			 
			System.out.print("deseja repetir (s/n?)");
			
		}
		
		
		// com a estrutura do-while:
		char resposta;
		do{
			System.out.print("digite a temperatura em celsius:");
			double c = sc.nextDouble();
			
			double f = 9.0 * c / 5.0 + 32;
			System.out.printf("equivalente em fahrenheit: %.1f%n ",f);
			 
			System.out.print("deseja repetir (s/n?)");
			char resposta = sc.next().charAt(0);
		}while(resposta != 'n');
		
		
		
		
		sc.close();

	}

}
