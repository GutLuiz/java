package curso_programacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.enums.Circle;
import entities.enums.Color;
import entities.enums.Rectangle;



public class Main {
    public static void main(String[] args)  throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);	
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    /*
      Metodos ABASTRATAS:
      = SAO metodos que nao possuem implementaçao 
      == Metodos precisam ser abastratos quando a classe é generica demais para conter sua implementaçao 
      === Se uma classe possuir pelo menos um metodo abstrato, entao esta classe tambem é abstrata.
      
     */
    // EXERCICIO RESOLVIDO:
    
    List<Shape> list = new ArrayList<>();
    System.out.print("Enter the number of shapes: ");
    int n = sc.nextInt();
    
    
    
    for(int i = 1; i <= n ; i ++) {
    	System.out.println("Shape #" + i + "data: ");
    	System.out.print("Rectangle or Circle (r/c)? ");
    	char ch = sc.next().charAt(0);
    	System.out.print("Color (BLACK/BLUE/RED):");
    	Color color = Color.valueOf(sc.next());
    	
    	if(ch == 'r') {
    		System.out.print("widht: ");
    		double widht= sc.nextDouble();
    		System.out.print("height: ");
    		double height=sc.nextDouble();
    		list.add(new Rectangle(color,widht, height));
    	}
    	else if (ch == 'c') {
    		System.out.print("Radius: ");
    		double radius = sc.nextDouble();
    		list.add(new Circle(color,radius));
    	}
    }
    System.out.println();
    System.out.println("SHAPE AREAS: ");
    
    for (Shape shp : list) {
    	System.out.println(String.format("%.2f",shp.area()));
    }
    sc.close();
       
    }
}
