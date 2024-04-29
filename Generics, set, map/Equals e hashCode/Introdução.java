import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        /*
             HashCode e equals: São operações utilizadas para comparar se um objeto é igual a outro.

             - Equals: lento, resposta 100%
             - HashCode: rapido, porem a resposta positiva não é 100%

             - Tipo comuns (String, Date, Double, etc..) ja possuem implementação para essas operações.
             Classes personalizadas precisam sobrepo-las.
         */


        // Equals: Metodo que compara se o objeto é igual a outro, retornando true ou false.
        //exemplo:

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));

        //HashCode: Metodo que compara o codigo.
        //exemplo:
        String c = "Maria";
        String d = "Alex";

        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

    }
}
