package curso_programacao;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities_enums.OrderStatus;



public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*
		    ----> ENUMERAÇOES <----
		    = É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionandas
		    = Palavra chave: enum
		    
		    ==VANTAGENS:
		    - melhor semantica
		    - codigo mais legivel e auxialidado pelo compilador
		 */

	     Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
	     
		 System.out.println(order);
		 
		sc.close();
		
	}
}
package entities;



import java.util.Date;

import entities_enums.OrderStatus;

public class Order {
		private Integer id;
		private Date moment;
		private OrderStatus status;
		
		
		public Order() {
			
		}
		public Order(Integer id, Date moment, OrderStatus status) {
			this.id = id;
			this.moment = moment;
			this.status = status;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Date getMoment() {
			return moment;
		}
		public void setMoment(Date moment) {
			this.moment = moment;
		}
		public OrderStatus getStatus() {
			return status;
		}
		public void setStatus(OrderStatus status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
		}
}
package entities_enums;

public enum OrderStatus {
//DEFININDO UM CONJUNTO DE COSTANTES:	
		PENDING_PAYMENT,
		PROCESSING,
		SHIPPED,
		DELIVERED;
}


	


		
