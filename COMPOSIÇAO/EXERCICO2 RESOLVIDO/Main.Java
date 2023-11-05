package curso_programacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import entities.Comentarios;
import entities.Post;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		Scanner sc = new Scanner(System.in);
		//instanciando os posts
		Comentarios c1 = new Comentarios("Have a nice trip");
		Comentarios c2 = new Comentarios("Wow that awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "TRAVELING NEW ZEALAND", "I GOING TO VISIT THIS WONDERFUL COUNTRY", 12);
		
		//adicionando os comentarios:
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		Comentarios c3 = new Comentarios("Good night");
		Comentarios c4 = new Comentarios("May the force be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "Se you tomorrow", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		
		
		sc.close();
		
	}
}

		
