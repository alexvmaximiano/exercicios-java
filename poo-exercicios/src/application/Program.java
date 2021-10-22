package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter the measures: ");
		System.out.print("Width: ");
		rectangle.Width = sc.nextDouble();
		System.out.print("Heigth: ");
		rectangle.Height = sc.nextDouble();
		
		System.out.println();
		System.out.println(rectangle);
		
		sc.close();
	}

}
