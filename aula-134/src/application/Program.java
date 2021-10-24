package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Digite o número de contribuíntes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Contribuinte #" + i);
			System.out.print("Pessoa Física ou Jurídica? (F/J)" );
			char tipoPessoa = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda Anual R$");
			double rendaAnual = sc.nextDouble();
			if (tipoPessoa == 'f' ) {
				System.out.print("Total de gastos com saúde: R$");
				double gastosSaude = sc.nextDouble();
				
				list.add(new Fisica(nome, rendaAnual, gastosSaude));
				
			} else if (tipoPessoa == 'j') {
				System.out.print("Total de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				
				list.add(new Juridica(nome, rendaAnual, numeroFuncionarios));
				
			} else {
				System.out.print("Tipo de pessoa inválido");
			}
		}
		
		System.out.println("PESSOAS PAGANTES: ");
		double totalTaxas = 0.0;
		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getNome() + ": $" + String.format("%.2f", pessoa.calculaImposto()));
			totalTaxas += pessoa.calculaImposto();
		}
		System.out.println("TOTAL DE TAXAS PAGAS:");
		System.out.printf("$  %.2f%n", totalTaxas);
		
		sc.close();
	}

}
