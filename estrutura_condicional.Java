package curso_programacao;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 //expressoes comparativas :
		 // < : menor
		 // > : maior
		 // <= : menor igual
		 // >= : maior igual
		 // == : igual
		 // != : diferente
		
		 //expressoes logicas:
		 // && : E
		 // !! : ou
		 // ! : nao 
		  
		//estrutura condicional:
		// condiçao simples:
		//exemplo:
		int x =  5;
		
		System.out.println("bom dia");
		if (x < 0 ) {
			System.out.println("boa tarde");
		}
		System.out.println("boa noite");
		// regra: se o bloco de comando for verdadeira, eka vai aparecer no console
		// se for falsa, ela nao vai aparecer.
		
		// composta :
		//regra: verdadeira somente executa o bloco if e falsa executa o else.
		int hora;
		System.out.println("quantas horas?");
		hora = sc.nextInt();
		if (hora < 12) {
			System.out.println("bom dia!");
		}
		else {
			System.out.println("boa tarde!");
		}
		
		// e se eu tiver mais de duas possibilidades?
		int horario;
		horario = sc.nextInt();
		
		if (horario < 12) {
			System.out.println("bom dia! ");
		}
		else if (horario < 18) {
			System.out.println("boa tarde!");
		}
		else {
			System.out.println("boa noite!");
		}
		
		
		

	    sc.close();
		
	}

}
