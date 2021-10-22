package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {

		this.setName(name);
		this.setPrice(price);
		this.quantity = quantity;
	}

	public Product(String name, double price) {

		this.setName(name);
		this.setPrice(price);
	}

	
	
	public double valueInStock() {
		return this.getPrice() * this.quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return getName() + ", $ " + String.format("%.2f", getPrice()) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", valueInStock());
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
