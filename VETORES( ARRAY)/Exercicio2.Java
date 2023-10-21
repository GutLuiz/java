package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 2:
		
		System.out.print("Quantos numeros voce vai digitar?  ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		int i;
		for( i = 0; i < n ; i++){
				vect[i] = sc.nextDouble();
				
		}
		for(i = 0 ; i < n; i++) {
			System.out.println("VALORES= " + vect[i]);
		}
		
		
		double soma = 0;
		
		for(i = 0 ; i < n; i++) {
			soma += vect[i];
		}
		System.out.println("SOMA = " +soma);
		
		
		double media = 0;
		
		for(i = 0 ; i < n ; i++) {
			media = soma / n; 
		}
		System.out.println("Media = " +  media);
		
		
		
		
		sc.close();
	}
}
