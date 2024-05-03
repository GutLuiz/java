import entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
           COMO AS COLEÇÕES HASH TESTAM IGUALDADE?
           - Se o hashCode e equals estiverem implementados:
                == Primeiro HashCode. Se der igual, usa equals para confirmar
                == Lembre se: String,integer, double, etc. Ja possuem equals e HashCode.
           - Se hashCode equals NAO estiverem implementados:
                == Compara as referencias(ponteiros) dos objetos.
         */

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook" , 1200.0);

        System.out.println(set.contains(prod));

    }
}
