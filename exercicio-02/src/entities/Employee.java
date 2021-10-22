package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		return ((grossSalary * percentage) / 100)  + netSalary();
	}
}
