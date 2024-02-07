package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		/*
		 * ESTRUTURA TRY - CATCH:
		 * 
		 * =BLOCO TRY: - Contem o codigo que representa a execuçao normal do trecho de
		 * codigo que pode acarretar em uma execuçao.
		 * 
		 * =BLOCO CATCH: - Contem o codigo a ser executado caso uma exceçao ocorra -
		 * Deve ser especificado o tipo da exceçao a ser tradada (upcasting é permitido)
		 * 
		 */

		// EXEMPLO:

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();

			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch(InputMismatchException e) {
			System.out.println("input error!");
		}

		sc.close();

	}
}
