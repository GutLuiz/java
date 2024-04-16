package services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable <T>>T max(List<T> list){ // colocando que a lista vai usar um tipo generico, um tipo T
        if (list.isEmpty()){ // se estiver vazia a lista manda uma exceção
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);  // recebendo o primeiro elemento da lista
        for(T item : list){ //
            if(item.compareTo(max) > 0 ){ // comparando se cada item da lista é maior que o max
                max = item;
            }
        }
        return max;
    }
}
