import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //Principio get/put
        // problema 2:
        // Fazendo um metodo que copia os elementos de uma lista para outra lista que pode ser mais generica que a primeira:

        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14,6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts,myObjs);
        printList(myObjs);
        copy(myDoubles,myObjs);
        printList(myObjs);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        // Eu acesso os elementos no source depois adiciono no destiny:
        for(Number number : source){
            destiny.add(number);
        }
    }

    public static void printList(List<?> list){
        for(Object obj: list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
