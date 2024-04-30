import entities.Client;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Demonstração 2:

        //criando dos conjuntos para parametro
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //União:
        Set<Integer> c = new TreeSet<>(a); // Colocando com que o c tenha o parametro de A
        c.addAll(b); // fazendo que todos os dados que não se repetem entrem para o conjunto C
        System.out.println(c);

        //Interseção:
        Set<Integer> d = new TreeSet<>(a); // Colocando com que o D tenha o parametro de A
        d.retainAll(b); // Fazendo com que todos que se repetem do conjunto A com o B entrem para o conjunto D
        System.out.println(d);

        // Diferença:
        Set<Integer> e = new TreeSet<>(a); // Colocando com que o E tenha o parametro de A
        e.removeAll(b);// Fazendo com que todos do A que não se repetem com o B entrem para o conjunto E
        System.out.println(e);
    }
}
