package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// exercicio 1:

		System.out.println("digite um numero inteiro: ");
		int x = sc.nextInt();

		if (x >= 1 & x <= 1000) {
			for (int i = 0; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("valor invalido");
		}

		// exercicio 2:
		System.out.println("fale um valor inteiro:");
		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 & x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + "out");

		// exercicio 3:

		System.out.println("digite um valor inteiro: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();

			double media = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0) / 10.0;
			System.out.println(media);

		}

		// exercicio 4:
		System.out.println("fale um numero: ");
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				double divisao = (double) num1 / num2;
				System.out.println(divisao);
			}

		}

		// exercicio 5:

		System.out.println("fale um numero:");
		int x = sc.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= x; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);

		// exercicio 6:
		System.out.println("fale um numero:");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}

		// exercicio 7:
		System.out.println("fale um numero positivo:");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {

			int primeiro = i;
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, quadrado, cubo);
		}

		sc.close();

	}

}
