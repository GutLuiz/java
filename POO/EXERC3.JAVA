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
package entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;

	
	public double notaDoAluno() {
		return note1 + note2 + note3;
	}
	public double resultado() {
		if(notaDoAluno() > 60) {
			return 60.0 - notaDoAluno();
		}
		else {
			return 0.0;
		}
		
	

}

