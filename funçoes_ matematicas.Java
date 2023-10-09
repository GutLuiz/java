package curso_programacao;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//funçoes matematicas:
		// A = Math.sqrt(x); significa que a variavel A recebe a raiz quadradada de X
		// A = Math.pow (x, y); significa que a variavel A recebe o resultado de X elevado a y
		// A = Math.abs(x); significa que a variavel A recebe o valor absoluto de x
		//exemplos de cada funçao:
		
		//raiz quadrada:
		double x = 3.0;
		double y= 4.0;
		double z = -5.0;
		double a,b,c;
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		
		System.out.println("raiz quadrada de " + x + "=" + a);
		System.out.println("raiz quadrada de " + y + "=" + b);
		System.out.println("raiz quadrada de 25 = " + c );
		
		//elevaçao:
		a = Math.pow(x, y);
		b = Math.pow (x, 2.0);
		c= Math.pow(5.0, 2.0);
		
		System.out.println( x + "elevado a " + y + "=" + a);
		System.out.println(x + "elevado ao quadrado = " + b );
		System.out.println("5 elevado ao quadrado = " + c);
		
		//valor absoluto:
		
		a = Math.abs(y);
		b = Math.abs(z);
		
		System.out.println("valor absoluto de " + y + "=" + a);
		System.out.println("valor absoluto de " + z + "=" + b);
		
		
				
		sc.close();
		
	}

}
