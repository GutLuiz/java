package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Product;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("fale o numero de produtos e em seguida os produtos.");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i = 0 ; i<n; i++ ) {
			sc.nextLine(); // quebra de linha que ficou pendente
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double soma = 0;
		
		for(int i = 0; i < n ; i++ ) {
			soma += vect[i].getPrice();
		}
		double avg = soma/n;
		
		System.out.printf("MEDIA: $ %.2f%n " , avg);
		
			
		
		sc.close();
	}
}
package util;

public class Product {
		private String name;
		private double price;
		
		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		
}

