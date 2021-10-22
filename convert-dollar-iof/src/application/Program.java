package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyCoverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double cotacao = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double qtdDollar = sc.nextDouble();
		
		
		System.out.printf("Amount to be paid in reais =  R$ %.2f%n", CurrencyCoverter.convert(qtdDollar, cotacao));
		
		sc.close();

	}

}
