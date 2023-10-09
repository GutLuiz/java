package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// exercicio 1:
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("senha invalida, tente novamente!");
			senha = sc.nextInt();
		}

		System.out.println("acesso permitido!");

		// exercicio 2:

		int x, y;

		x = sc.nextInt();
		y = sc.nextInt();

		while (x != 0 & y != 0) {
			if (x > 0 & y > 0) {
				System.out.println("primeiro quadrante");
			}
			if (x < 0 & y > 0) {
				System.out.println("segundo quadrante");
			}
			if (x < 0 & y < 0) {
				System.out.println("terceiro quadrante");
			} else if (x > 0 & y < 0) {
				System.out.println("quarto quadrante");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}

		// exercicio 3:

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;

		System.out.println("qual numero voce quer solicitar?");
		tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;
			}
			if (tipo == 2) {
				gasolina += 1;
			}
			if (tipo == 3) {
				diesel += 1;
			}

			tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("alcool:" + alcool);
		System.out.println("gasolina: " + gasolina);
		System.out.println("diesel: " + diesel);

		sc.close();

	}

}
