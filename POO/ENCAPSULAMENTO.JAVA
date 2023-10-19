package util;

public class Product {
	//ecapsulando:
	private String name; // PRIVATE: SERVE PARA QUE OATRIBUTO N SEJA ACESSADO.
	private double price;
	private int quantity;
	
	//contrutores:
	public Product() {
		
	}
	
	public Product( String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String naame, double price) {
		this.name = naame;
		this.price = price;
	}
	//colocando os sets e gets:
	public String getName() {// GET: METODO PARA OBTER ESSE NOME
		return name;
	}
	public void setName(String name) {//SET: METODO PARA ALTERAR MEU ATRIBUTO
		this.name = name;//atribuindo o valor para o atributo do objeto
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	
	public String toString() {
		return name + 
				", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
