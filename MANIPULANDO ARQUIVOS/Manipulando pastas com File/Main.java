package curso_programacao;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// manipulando pastas com File:
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory); // criando um vetor que so busque os diretorios (pastas)
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}

		// Agora somente com arquivos:

		File[] files = path.listFiles(File::isFile); // criando um vetor que so busque os arquivos
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}

		// criando uma subpasta a partir da pasta temp:
		boolean success = new File(strPath + "\\gut").mkdir();
		System.out.println("Directory created sucessfully: " + success);

		sc.close();
	}

}
