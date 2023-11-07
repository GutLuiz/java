package curso_programacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStaus;
import entities.Product;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String Name = sc.nextLine();
		System.out.print("Email: ");
		String Email = sc.nextLine();
		System.out.print("Birth date: ");
		Date data = sdf.parse(sc.next());
		
		Client cliente = new Client(Name, Email ,data);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStaus status = OrderStaus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cliente);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String prodStr = sc.nextLine();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int prodQuanty = sc.nextInt();
			
			Product product = new Product(prodStr, prodPrice);
			
			OrderItem it = new OrderItem(prodQuanty, prodPrice, product);
			
			order.addItem(it);
		}
			System.out.println("ORDER SUMMARY");
			
			System.out.println(order);
		
		sc.close();
		
	}
}

		
