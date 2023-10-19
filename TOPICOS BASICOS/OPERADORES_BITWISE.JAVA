package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// operadores bitwise:
		// & = operaçao "e" bit a bit 
		// | operaçao "ou" bit a bit
		// ^ operaçao "ou-exclusivo" bit a bit
		
		//exemplos praticos:
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		
		//aplicaçoes comuns para verificar bit:
		int n = sc.nextInt();
		int mask = 32; // no exemplo, o 32 é aquele que so tem 1 bit no sexto numero.
		if((n & mask)!=0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
