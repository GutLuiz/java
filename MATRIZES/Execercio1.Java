package curso_programacao;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// exercicio:
		System.out.print("Fale dois numeros inteiros");
		int M = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[M][n];
		
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Fale um numero da matriz: ");
		int x = sc.nextInt();
		
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position: " + i + ", " + j);
					
					if(j > 0) {
						System.out.println("left: " + mat[i][j - 1]);
					}
					if(i > 0) {
						System.out.println("up: " + mat[i - 1][j]);
					}
					if(j < mat[i].length - 1) {
						System.out.println("right: " + mat[i][j + 1]);
					}
					if(i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
			
				}
		
		
		sc.close();
	}
}
