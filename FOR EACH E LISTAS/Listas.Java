package curso_programacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		/*
		     -------> LISTAS <-------
		     
		 == Homogenia, ou seja, dentro de uma lista so pode ter um tipo de dado (somente double ou somente int etc..)
		 == Ordenada ( os elementos acessados por meio de posiçoes(semelhante ao array))
		 == Inicia vazia, e seus elementos sao alocados sob demanda (diferente da array que precisa colocar quantos devem ser no iniciio do vetor)
		 == Cada elemento ocupa um "no" (ou nodo) da lista ate ter um valor determinado para ter o fim da lista.
		 
		 -Tipo (interface): List ---> Define apenas as especificaçoes das operaçoes.
		 - Classes que implementam : ArrayLista, LinkedLista, etc..
		 
		 = Vantagens: 
		  - Tamanho variavel 
		  - Facilidade parra se realizar inserçoes e deleçoes
		  
		 = Desvantagens:
		  - Dependendo da implementaçao da lista, existe acesso sequencial aos elementos. 
		  
		 */
		// exemplos:
		
		
		List<String> list = new ArrayList<>();// Implementando a lista no meu programa
		
		// Adicionando Strings no meu programa:
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //adicionando uma String em alguma posiçao da minha lista
		
		System.out.println(list.size()); // O size mostra o tamanho da lista
		
		//Printando pelo for each:
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//MANEIRAS PARA REMOVER DA LISTA:
		list.remove("Anna"); // A lista consegue remover com o valor ou o numero da posiçao do elemento.
		list.removeIf(x -> x.charAt(0) == 'M');// A lista consegue remover tambem o predicado.
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// MANEIRA PARA ACHAR A POSIÇAO DO VALOR NA LISTA:
		System.out.println("Posiçao do BOB: " + list.indexOf("Bob"));
		System.out.println("Posiçao de Marco: " + list.indexOf("Marco")); // Sempre quando nao tem algum valor na lista e voce esta pedindo, aparece no console um numero negativo
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//MANEIRAS PARA PRINTAR APENAS PALAVRAS QUE COMEÇAM COM A LETRA:
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
		sc.close();
	}
}
