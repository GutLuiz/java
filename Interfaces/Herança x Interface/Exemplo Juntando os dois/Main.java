package curso_programacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AbastractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;


public class Main {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			AbastractShape  s1 = new Circle(2.0,Color.BLACK);
			AbastractShape  s2 = new Rectangle(4, 3, Color.WHITE);
			
			System.out.println("Circle color: " + s1.getColor());
			System.out.println("Circle area: "  + String.format("%.2f", s1.area()));
			System.out.println("Rectangle color: " + s2.getColor());
			System.out.println("Rectangle area: " + String.format("%.2f", s2.area()));
			
	        sc.close();
	}

}
