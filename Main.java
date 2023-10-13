package curso_programacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//perguntando o nome, preço e a quantidade de produtos:
		Product product = new Product();
		System.out.println("enter product data: ");
		System.out.print("name: ");
		product.name = sc.nextLine();
		System.out.print("price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " +product);
		
		//adicionando produtos:
		System.out.println();
		System.out.println("enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
		product.addProducts(quantity); 
		
		System.out.println();
		System.out.println(" Upadate Product data: " + product);
		
		//removendo produtos:
		System.out.println();
		System.out.println("enter the number of products to be removed in stock:");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println(" Upadate Product data: " + product);
		
		sc.close();
	}
}
