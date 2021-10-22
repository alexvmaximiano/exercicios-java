package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees will be registered: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Employee #" + (i+1));
			System.out.print("Enter the ID number: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the name: ");
			String name = sc.nextLine();
			System.out.print("Enter the salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			Employee emp = new Employee(name, salary, id);
			list.add(emp);
		}
		
		//Buscando pelo ID
		System.out.println("Enter the ID has been a increase salary: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("The ID does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		//Listing employees:
		
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();

	}

}
