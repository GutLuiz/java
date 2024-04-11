import entities.PrintService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /*
         GENERICS:
          - Generics permitem que classes, interfaces e metodos possam ser parametrizados por tipo. Seus beneficios sao:
             =  Reuso
             = type safety
             = Performance
          - Uso comum: coleções
         */
        // Problema motivador 1 (reuso):

        PrintService<String> ps = new PrintService<>();
        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i ++){
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();



    }
}
