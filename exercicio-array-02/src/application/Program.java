package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
		/* Fazer um programa para ler um n�mero inteiro N e os dados (nome e
			pre�o) de N Produtos. Armazene os N produtos em um vetor. Em
			seguida, mostrar o pre�o m�dio dos produtos.
	 * */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i= 0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			//Innstanciando um novo produto com as informa��es;
			
			vect[i] = new Product(name, price);
					
		}
		
		double sum = 0.0;
		
		for (int i = 0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/n;
		System.out.printf("AVERAGE PRICE: $ %.2f", avg);
		
		sc.close();
	}

}
