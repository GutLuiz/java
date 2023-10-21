package curso_programacao;
import java.util.Locale;

import java.util.Scanner;

import util.Altura;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 3:
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		
		
		Altura[] vect = new Altura[n];
		
		int i;
		for( i = 0 ; i < n ; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i + 1); //%da é uma sequência de formato onde %d será substituído pelo valor de i + 1
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i]= new Altura(nome, idade, altura);
			
		}
		
		
		
		double soma = 0;
		for(i = 0 ; i < n ; i++) {
			soma += vect[i].getAltura();
		}
		
		double media = soma/n;
		
		System.out.printf("Altura media: %.2f%n " , media);
		
		double porcentagem = 0;
		for(i = 0 ; i < n; i++) {
			if(vect[i].getIdade() < 16) {
				porcentagem = 100/n ;
				System.out.println(porcentagem +"%");
				System.out.println(vect[i].getNome());
			}
		}
	
		
		sc.close();
	}
}
package util;

public class Altura {
		private String nome;
		private int idade;
		private double altura;
		
		public Altura(String nome, int idade, double altura) {
			this.nome = nome;
			this.idade = idade;
			this.altura = altura;
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

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		
		
		

}


