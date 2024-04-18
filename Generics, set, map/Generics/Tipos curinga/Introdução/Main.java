
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // TIPOS CURINGA:
        // ERROS DE COMPILAÇÃO:

        List<Object> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();
        myObjs = myObjs; // O sub tipo Integer n pode interagir dessa forma com o Object

        //Basicamente o list de object não é a mesma coisa que um list de Integer.

        // O supertipo de qualquer tipo de lista e List<?>. Este é um tipo curinga:
        List<?> myObjs1 = new ArrayList<>();
        List<Integer> myNumbers1 = new ArrayList<>();

        sc.close();

    }
}
