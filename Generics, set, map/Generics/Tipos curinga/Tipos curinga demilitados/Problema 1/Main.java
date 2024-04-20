
import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        // CURINGAS DEMILITADOS:
        // PROBLEMA 1;
        // FAZENDO UM METODO PARA RETORNAR A SOMA DAS AREAS DE UMA LISTA DE FIGURAS:

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3, 2));
        myShapes.add(new Circle(2));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2));
        myCircles.add(new Circle(3));

        System.out.println("Total area: " + totalArea(myShapes));
        System.out.println("Total area: " + totalArea(myCircles));


        sc.close();

    }
    public static double totalArea(List<? extends Shape> list){
        double sum = 0;
        for(Shape s : list){
            sum += s.Area();
        }
        return sum;
    }
}
