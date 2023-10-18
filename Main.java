package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import util.Product;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		  MODIFICADORES DE ACESSO:
		  = PRIVATE : o membro so pode ser acessado pela propria classe.
		  = NADA: o membro so pode ser acessado nas classes do mesmo pacote
		  = PROTECTED: o membro so pode ser acessado no mesmo pacote, bem como em sbclasses de pacotes diferentes.
		  = PUBLIC : o membro é acessado por todas classes.
		 */
		
		
		sc.close();
	}
}