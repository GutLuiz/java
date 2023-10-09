package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Expressao condicional ternaria:
		// (condicao) ? valor_se_verdadeiro : valor_se_falso
		//ex: (10 != 3) ? "maria" : "alex" ----> "maria"
		// mais exemplo:
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
		
		System.out.println(desconto);
		

		

		sc.close();

	}

}
