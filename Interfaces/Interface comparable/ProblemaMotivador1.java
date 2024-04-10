import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //INTERFACE COMPARABLE:
        // Problema motivador:

        List<String> list = new ArrayList<>(); // criando uma lista
        String path = "C:\\temp\\in.txt"; // colocando o endereço da pasta

        try(BufferedReader br = new BufferedReader(new FileReader(path))){ //Criaando uma classe que armazena em buffer os caracteres lidos a partir do Filereader.

            String name = br.readLine(); // lendo uma linha de texto do arquivo
            while(name != null){ // fazendo um while para ler todas as linhas de texto do arquivo e colocando ele em uma lista.
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list); // ordenando a coleção
            for(String s : list){ // printando a lista
                System.out.println(s);
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


}
