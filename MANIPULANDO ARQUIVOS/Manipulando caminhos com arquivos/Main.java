package curso_programacao;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Informaçoes sobre o caminho do arquivo:
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Descobrir apenas o nome do arquivo:
		
		System.out.println("getName: " + path.getName());
		
		//Descobrir so o caminho do arquivo:
		System.out.println("getParent: " + path.getParent());
		
		//Descobrir todo taminho:
		System.out.println("getPath: " + path.getPath());
		

		sc.close();
	}

}
