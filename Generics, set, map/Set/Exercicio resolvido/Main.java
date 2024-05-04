import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: "); // endereço do arquivo
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){ // lendo arquivo
            Set<LogEntry> set = new HashSet<>(); // Usando o hashset, pois ele é mais rapido e n necessita de posição e sim de total

             String line = br.readLine(); // lendo a primeira linha do arquivo

             while (line != null){ // enquanto n acabar a linha do arquivo leia:
                 String[] fields = line.split(" ");// Fazendo um split para dividir quando tiver um espaço em branco
                 String username = fields[0];// pegando a posição do username
                 Date moment = Date.from(Instant.parse(fields[1]));// pegando a posição da data e seu formato

                 set.add(new LogEntry(username,moment)); // adicionando o set

                 line = br.readLine(); // lendo a proxima linha
             }
            System.out.println("Total users: " + set.size());// printando o total de user com basae no nome.

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }


        sc.close();



    }
}
