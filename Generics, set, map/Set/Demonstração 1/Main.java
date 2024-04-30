import entities.Client;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Demonstração 1:

        // criando um set:
        Set<String> set = new HashSet<>(); //OBS: O hashset é o mais rapido, mas ele tem uma desvantagem que ele n mostra na mesma ordem no terminal.

        //Adicionando dados:
        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        //Printando se tem a palavra notebook nos dados:
        System.out.println(set.contains("Notebook"));

        //Testando algumas operações;
        set.remove("Tablet"); // removendo um dado
        set.removeIf(x -> x.length() >= 3 ); // removendo se tiver 3 ou mais caracteres

        //Pritando os dados:
        for (String p : set) {
            System.out.println(p);
        }
    }
}
