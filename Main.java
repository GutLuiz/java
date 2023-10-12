package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*funçoes:
		 Suas principais vantagens: modularizaçao, delegaçao e reaproveitamento.
		 essas funçoes recebem o nome de "metodos".
		*/
		
		//exemplos:
		System.out.println("enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b ,c ); //funçao criada
		
		showresult(higher); //funçao para mostrar no console
		
		sc.close();

	}
	public static int max(int x, int y, int z) {//declarando os parametros, retornando algum valor pro programa
		int aux;//variavel local da funçao, existindo somente no escopo da funçao
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
		
	}
	public static void showresult(int value) {//declarando os paramentros, retornando algum valor na tela
		System.out.println("higher =  " + value);
	}

}
