package curso_programacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;



public class Main {
    public static void main(String[] args)  throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);	
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    System.out.print("Enter the number of tax payers: ");
    int n = sc.nextInt();
    
    List<Pessoa> list = new ArrayList<>();
    int i;
    
    for(i = 1; i <= n ; i++) {
    	System.out.println("Tax payer #" + i + " data:");
    	System.out.print("Individual or company (i/c)?");
    	char ch = sc.next().charAt(0);
    	System.out.print("Name: ");
		String nome = sc.next();
		System.out.print("Anual income: ");
		double anual = sc.nextDouble();
    	
    	if(ch == 'i') {
    	
    		System.out.print("Health expenditures: ");
    		double gastosSaude = sc.nextDouble();
    		
    		list.add(new Fisica(nome,anual,gastosSaude));
    	}
    	else if (ch == 'c') {
    	
    		System.out.println("Number of emolyees: ");
    		int func = sc.nextInt();
    		
    		list.add(new Juridica(nome, anual, func));
    	}
    	
    }
    
    System.out.println();
    System.out.println("TAXES PAID: ");
    for( Pessoa pes : list) {
    	System.out.println(pes.getNome() + ": " + String.format("%.2f", pes.imposto()) );
    }
    double sum = 0;
    for(Pessoa pes: list) {
    	sum += pes.imposto();
    }
    
    System.out.println("TOTAL: " + String.format("%.2f", sum));
    
    
    
    
    sc.close();
       
    }
}
