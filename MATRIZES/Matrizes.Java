package curso_programacao;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*
		  -----> MATRIZES <-----
		  
		  = MATRIZ é o nome dado a arranjos bidimensionais.
		  
		 */
		//exemplo:Fazer um programa para ler um numero N e uma matriz de ordem N contendo numeros inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores negattivos.
		
		int N = sc.nextInt();
		//criando matriz:
		int[][] mat = new int[N][N];// o dois cochetes demonstram que é uma matriz bidimensional
		
		for(int i = 0; i < mat.length; i ++) { // colocando a linha
			for(int j = 0 ; j < mat[i].length ; j++) { // colocando a coluna
				mat[i][j] = sc.nextInt(); // pedindo para que coloque o valor nos dois
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i < N ; i ++ ) {
			System.out.print(mat[i][i] + " " );// A diagonal princial tem o mesmo valor
		}
		System.out.println();
		
		
		int count = 0;
		for(int i = 0 ; i < mat.length; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				if(mat[i][j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.println("Negative numbers: " + count);
		
		sc.close();
	}
}
