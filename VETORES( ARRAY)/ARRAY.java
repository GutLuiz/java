package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Empregado;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
			VETORES: Em programaçao, vetor é o nome dado a arranjos unidimensionais
			
			- Arranjo (array) é uma estrutura de dados:
					= hoomogenia (dados do mesmo tipo)
					= ordenanda (elementos acessadps por meio de posiçoes)
					= alocada de uma vez so, em um bloco contiguo de memoria.
		
				-- VATANTAGENS DO ARRAY:
					= Acesso imediato aos elementos pela sua posiçao
				-- DESVANTAGENS DO ARRAY:	
				 	= tamanho fixo
				 	= Dificuldade para remover posiçoes (inserçoes e deleçoes
			
		 */
		//EXEMPLOS:
		
			int n = sc.nextInt();
			double[] vect = new double[n];
			
			for(int i = 0; i < n; i++) {
				vect[i] = sc.nextDouble();
			}
			
			double soma = 0;
			for(int i = 0; i< n; i++) {
				soma += vect[i];
			}
			double avg = soma/n;
			
			System.out.println("MEDIA : " + avg);
		
		
		sc.close();
	}
}
