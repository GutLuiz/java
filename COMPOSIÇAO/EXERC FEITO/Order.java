package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		private Date moment;
		private OrderStaus status;
		private Client produto;
		private List<OrderItem> Item = new ArrayList<>();
		
public Order() {
}


public Order(Date moment, OrderStaus status, Client produto) {
	this.moment = moment;
	this.status = status;
	this.produto = produto;
}

public Date getMoment() {
	return moment;
}


public void setMoment(Date moment) {
	this.moment = moment;
}


public OrderStaus getStatus() {
	return status;
}


public void setStatus(OrderStaus status) {
	this.status = status;
}


public Client getProduto() {
	return produto;
}


public void setProduto(Client produto) {
	this.produto = produto;
}


public List<OrderItem> getItem() {
	return Item;
}

public void addItem(OrderItem item) {
	Item.add(item);
}
public void removeItem(OrderItem item) {
	Item.remove(item);
}
public Double total() {
	double soma = 0;
	for(OrderItem s: Item) {
		soma+=s.subTotal();
	}
	return soma;
}
public String toString() {
	StringBuilder  prod = new StringBuilder();
	prod.append("Order momment: ");
	prod.append( sdf.format(moment) + "\n");
	prod.append("client: ");
	prod.append( produto + "\n");
	prod.append("Order items: \n");
	for(OrderItem item : Item){
		prod.append(item + "\n");
	}
	prod.append("total price: $");
	prod.append(String.format("%.2f", total()));
	return prod.toString();
}
}
