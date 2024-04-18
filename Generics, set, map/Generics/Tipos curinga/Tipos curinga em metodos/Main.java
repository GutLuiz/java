
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Com tipos curinga podemos fazer metodos que recebem um generico de "qualquer tipo":

        List<Integer> myInts = Arrays.asList(5, 2 , 10);
        printList(myInts);

        sc.close();

    }
    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
