package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Apartamento;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		/*
		  LAÇO "FOR EACH" : sintaxe opcional e simplificada para percorrer coleçoes.
		  
		 */
		// exemplos:
		
		String [] vect = new String[] {"Maria", "bob" , "Alex"};
		
		for( int i = 0 ; i < vect.length; i ++) {
			System.out.println(vect[i]);
		}
		
		// com FOR EACH:
		
		for (String obj : vect) {
			System.out.println(obj);
		}
		
		
		sc.close();
	}
}
