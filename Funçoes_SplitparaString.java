package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// funcoes para string:
		String  original = "abcde FGHIJ ABC abc DEFG";
		
		//imprime todas as strings da variavel mencionada, em letras minusculas!
		String s01 = original.toLowerCase();
		
		//imprime todas as strings da variavel mencionada, em letras maiusculas!
		String s02 = original.toUpperCase();
		
		//ele elimina todos os espaços em branco ao redor da string
		String s03 = original.trim();
		
		//ele imprime apenas a partir do numero que voce coloca no ()
		String s04 = original.substring(2);
		
		//ele imprime apenas a partir do primeiro numero, e voce pode colocar um limite, que é o segundo numero!
		String s05 = original.substring(2, 9);
		
		//ele troca a primeira string que eu coloquei pela segunda.
		String s06 = original.replace('a', 'x');
		
		// O raplace tambem pode trocar as substrings!
		String s07 = original.replace("abc", "xy");
		
		// Os dois a seguir respectivamente, mostram a primeira ocorrencia do que esta no () e a ultima que esta ()
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("Replace('a', 'x'): -" + s06 + "-");
		System.out.println("Replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("index of 'bc': " + i);
		System.out.println("last of 'bc': " + j);
		
		
		//operaçoes split:
		// ela faz com que o texto que tem na string tenha vetores e possa ser printado em diferentes formas
		String s = "potato apple lemon";
		
		//colocando vetor, e dentro do () mostra o que vai separar a string:
		String[] vect = s.split(" "); // nesse exemplo, o espaço em branco ira separar o valor dos vetores
		
		System.out.println(vect[0]);//logo, 'potato' ira ser printado pois esta no vetor 0!
		System.out.println(vect[1]);//logo, 'apple' ira ser printado pois esta no vetor 1!
		System.out.println(vect[2]);//logo, 'lemon' ira ser printado pois esta no vetor 2!
		
		sc.close();

	}

}
