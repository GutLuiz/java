import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //INTERFACE COMPARABLE:
        // Problema motivador:

        List<Employee> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){ //Criaando uma classe que armazena em buffer os caracteres lidos a partir do Filereader.

            String employeeCsv = br.readLine();
            while(employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for(Employee emp : list){
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


}
