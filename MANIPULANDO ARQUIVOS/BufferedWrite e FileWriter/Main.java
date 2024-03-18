package curso_programacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

			/*
			  CLASSES:
			  --> FILEWRITER: Stream de escrita de caracteres em arquivos
			  	- cria/recria o arquivo: new FileWriter (pasta)
			  	- Acrescenta ao arquivo existentte: new FileWriter(pasta,true)
			  	
			  --> BufferedWrite (mais rapido).	
			  
			 */
		//Exemplo:
		
		// criando um vetor com as mensagens:
		String[] linhas = new String[] {
				"Good morning" , "Good Afternoon", "Good night"
		};
		
		// criando o caminho do arquivo:
		String pasta = "c:\\temp\\out.txt";
		
		//criando a logica para mandar a mensagem para o arquivo:
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pasta, true))){ // com o true ele acrescenta de novo a mensagem, sem o true ele apenas recrria a a mensagem.
			for(String linha : linhas) {
				bw.write(linha);
				bw.newLine(); // quebra de linha
			}
		}
		catch(IOException e){
				e.printStackTrace();
			}
		}
					
	}


