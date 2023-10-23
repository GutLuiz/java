package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Velho;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 10:
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Velho[] vect = new Velho[n];
		
		for(int i = 0 ; i < n ; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("nome: ");
			String nome = sc.nextLine();
			
			System.out.print("idade: ");
			int idade = sc.nextInt();
			vect[i] = new Velho(nome, idade);
		}
		
		int maior = 0;
		String nome = null;
		
		for(int i = 0 ; i < n ; i++) {
			if (vect[i].getIdade() > maior) {
				maior = vect[i].getIdade();
				nome = vect[i].getNome();
			}
		}
		
		System.out.println("Pessoa mais velha: " + nome );
		
		
		
		
		
			
		sc.close();
	}
}
package util;

public class Velho {
		private String nome;
		private int idade;
		
		public Velho(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		
}
