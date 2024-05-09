


import entities.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Product, Double> cookies = new HashMap<>(); // instanciando nosso map

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("notebook", 1200.00);
        Product p3 = new Product("tablet", 400.00);

        cookies.put(p1, 10000.0);
        cookies.put(p2, 20000.0);
        cookies.put(p3, 15000.0);

        Product ps = new Product("Tv: ", 900.0);

        System.out.println("Contains 'ps' key: " + cookies.containsKey(ps));
        sc.close();



    }
}
