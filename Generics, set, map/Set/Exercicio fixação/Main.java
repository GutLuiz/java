

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();
        Set<Integer> setC = new TreeSet<>();
        Set<Integer> setAll = new TreeSet<>();

        int sum = 0;

        System.out.print("How many students for course A? ");
        int x = sc.nextInt();

        for(int i = 1; i <= x; i++){
            int estudante = sc.nextInt();
            setA.add(estudante);
            setAll.add(estudante);
        }

        System.out.print("How many students for course B?");
        int y = sc.nextInt();

        for(int i = 1; i <= y; i++){
            int estudante = sc.nextInt();
            setA.add(estudante);
            setAll.add(estudante);
        }


        System.out.print("How many students for course C?");
        int z = sc.nextInt();

        for(int i = 1; i <= z; i++){
            int estudante = sc.nextInt();
            setA.add(estudante);
            setAll.add(estudante);
        }

        for (int estudante : setA){
           if (!setB.contains(estudante) && (!setC.contains(estudante))){
               sum ++;
            }
        }

        System.out.println(sum);
        sc.close();

    }
}
