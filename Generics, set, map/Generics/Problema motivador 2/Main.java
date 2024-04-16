import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

             List<Product> list = new ArrayList<>(); // endereço da lista

             String path = "C:\\temp\\in.txt"; // endereço do arquivo

        try(BufferedReader br = new BufferedReader(new FileReader(path))){ // lendo o arquivo

            String line = br.readLine(); // lendo uma linha do arquivo
            while(line != null){
                String[] fields = line.split(", "); // criando uma matriz que leia com o referencial depois da virgula
                list.add(new Product(fields[0], Double.parseDouble(fields[1]))); // adicionando as linhas na lista uma String e depois um double
                line = br.readLine(); // lendo a linha
            }
            Product x = CalculationService.max(list);
            System.out.println("Max:  ");
            System.out.println(x);
        } catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }


        sc.close();

    }
}
