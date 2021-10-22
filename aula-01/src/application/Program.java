package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the datas: ");
		System.out.print("Product: ");
		String name = sc.nextLine();
		System.out.print("Value unity: ");
		double price = sc.nextDouble();

		Product product = new Product(name, price); // Tornando campos obrigatórios.

		System.out.println();
		System.out.print("Products data: " + product);
		System.out.println();

		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.print("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int removeQuantity = sc.nextInt();
		product.removeProducts(removeQuantity);
		System.out.print("Updated data: " + product);
		System.out.println();
		sc.close();
	}

}
