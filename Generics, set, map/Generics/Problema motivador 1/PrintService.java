package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>(); // Armazendando uma lista T

    public void addValue(T value){ // Operação que recebe um valor inteiro e adiciona na lista
        list.add(value);
    }

    public T first()  {
        if (list.isEmpty()){ // se ela for vazia:
            throw new IllegalStateException("List is empty");
        }
        return list.get(0); // colocando o primeiro inteiro como no metodo first
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){ // se a lista não estiver vazia imprima:
            System.out.print(list.get(0));
        }
        for (int  i = 1; i < list.size(); i++){ // usando um for para percorrer ate o ultimo indice
            System.out.print(", " + list.get(i)); // printando
        }
        System.out.println("]");
    }

}
