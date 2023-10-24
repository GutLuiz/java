package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Apartamento;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*
		  -----> BOXING <-----
		  
		  = É um processo de conversão de um objeto tipo valor parra um objeto tipo referencia compativel
		  
		  -----> UNVOXING <----- 
		  
		  = é o processo de conversao de um objeto tipo referencia parra um objeto tipo valor compativel
		  
		 */
		 //EXEMPLOS DE AMBAS:
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
		
		/*
		    ----> WRAPPER CLASSES <----
		    
		    = Sao classes equivalente aos tipos primitivos (int e double, por exemplo,)
		    = Sendo assim o boxing e unboxing é natural na linguagem 
		    = O uso comum sao nos campos de entidades em sistemas de informaçao.
		    
		 */
		//EXEMPLOS:
		
		public Integer quantity;
		public Double price;
		
		
		
		
		sc.close();
	}
}
