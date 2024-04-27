import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //Principio get/put
        // problema 2:
        // Fazendo um metodo que copia os elementos de uma lista para outra lista que pode ser mais generica que a primeira:

        // Covariancia:

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        list.add(20); // erro de compilaçao, pois voce n pode adicionar um numero que o compilador n sabe se vai ser compativel com outro tipo number

        // Contravariancia
        List<Object> myObjs = new ArrayList<>();
        intList.add("Maria");
        intList.add("santos");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);

        Number x = myNums.get(0);// erru de compilaçao, pois pode ser number ou qualquer tipo superior a number, mas ele n pode guardar em um tipo NUMBER


    }
}
