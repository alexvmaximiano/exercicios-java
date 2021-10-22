package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Lista de funcionários vazia
		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int numberEmployeesRegistered = sc.nextInt();

		for (int i = 1; i <= numberEmployeesRegistered; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();

			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			// Adiciona um novo item na lista com os dados coletados.
			list.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		// Procure nos Employee com o filtro X tal qual o x com o valor do ID = o valor
		// do ID digitado então pegue o primeiro resultado
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		// validação do id = null
		if (emp == null) {
			System.out.println("This id not exist!");
		} else {
			System.out.println("Enter the percentage to increase: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		// Listando os funcionários:
		System.out.println();
		System.out.println("List of Employees: ");

		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

}
