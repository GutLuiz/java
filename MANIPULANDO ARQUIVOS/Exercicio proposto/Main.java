package curso_programacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		
		List<Account> list = new ArrayList<>();
		
		//Caminho de entrada:
		System.out.println("Enter file path:");
		String SourceFileStr = sc.nextLine();
		
		//Criando o file para passar o caminho:
		File sourceFile = new File(SourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		//criando um novo diretorio:
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		System.out.println("Folder created: " + success);
		
		//criando o arquivo de saida:
		
		String TargetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(SourceFileStr))){
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Account (name, price, quantity));
				
				itemCsv = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(TargetFileStr)) ){
				for(Account item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println(TargetFileStr + "Created");
			}
			catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		
		
		

		sc.close();
	}

}
