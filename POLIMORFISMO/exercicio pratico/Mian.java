package curso_programacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;



public class Main {
    public static void main(String[] args)  throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);	
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();
    
    List<Product> list = new ArrayList<>();
    int i;
    
    for(i = 1; i <= n ; i++) {
    	System.out.print("Product #" + i + " data:" );
    	System.out.print("Common, used or imported (c/u/i)? ");
    	char tipo = sc.next().charAt(0);
    	System.out.print("Name: ");
    	sc.nextLine();
    	String name = sc.nextLine();
    	System.out.print("Price: ");
    	double price = sc.nextDouble();
    	
    	if(tipo == 'c') {
    		list.add(new Product(name,price));
    	}
    	else if(tipo == 'i') {
    		System.out.print("taxa de importaçao: ");
    		double taxa = sc.nextDouble();
    		list.add(new ImportedProduct(name,price,taxa));
    	}
    	else {
    		System.out.print("manufacture date (dd/mm/yyyy): ");
    		 Date data = sdf.parse(sc.next());
    		 list.add(new UsedProduct(name,price,data));
    	}
    }
    
    System.out.println();
    
    System.out.println("PRICE TAGS:");
    for(Product prod : list) {
    	System.out.println(prod.priceTag());
    }
    
    
    
    sc.close();
       
    }
}
