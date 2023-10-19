package curso_programacao;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//ler o texto ate a quebra de linha:
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("dados digitados: ");
		System.out.println(s1); 
		System.out.println(s2);
		System.out.println(s3);
		
		// quebra de linha pendente:
		// Quando voce usa um comando de leitura diferente do "nextLine" e da alguma quebra de linha
		// fica pendente na entrada padrao. A soluçao é fazer mais uma linha extra de "nextLine".
		
		int x;
		String s4, s5, s6;
		
		x = sc.nextInt();
		sc.nextLine();
		s4 = sc.nextLine();
		s5 = sc.nextLine();
		s6 = sc.nextLine();
		
		System.out.println("dados digitados: ");
		System.out.println(x);
		System.out.println(s4); 
		System.out.println(s5);
		System.out.println(s6);
		
		//resumo entrada de dados:
		
		//Scanner: -next() , nextInt(), nextDouble(), next().charAt(0) 
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
