package curso_program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//lendo uma palavra em entrada de dados:
		String x;
		x = sc.next();
		
		System.out.println("voce digitou: "+ x);
		// lendo um inteiro em uma entrada de dados:
		int y;
		y = sc.nextInt();
		System.out.println("voce digitou: "+ y);
		// lendo ponto flutuante em uma entrada de dados:
		double z;
		z = sc.nextDouble();
		System.out.println("voce digitou: " +z);
		// lendo um caractere em uma entrada de dados:
		char w;
		w = sc.next().charAt(0); //o comando "charat" pega o primeiro caractere da string que voce colocar no terminal
		System.out.println("voce digitou: " + w);
		// lendo varios dados na mesma linha:
		String a;
		int b;
		double c;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("dados digitados:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
		
		sc.close();
	}

}
