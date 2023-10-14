package curso_programacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 EXERCICIOS DE FIXAÇAO DE POO:
		 */
		// exercicio 3:
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.note1 = sc.nextDouble();
		student.note2 = sc.nextDouble();
		student.note3 = sc.nextDouble();
		
		
		System.out.println("FINAL GRADE = " + student.notaDoAluno());
		
		if(student.notaDoAluno() < 60.0) {
			System.out.println("falied");
			System.out.println("MISSING" + student.notaDoAluno() + "points");
		}
		else{
			System.out.println("PASS");
		}
		
		
		
		
		
		sc.close();
	}
}
