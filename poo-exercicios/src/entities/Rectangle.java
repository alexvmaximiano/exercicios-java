package entities;

public class Rectangle {
	
	public double Width;
	public double Height;
	
	public double area() {
		return this.Width * this.Height;
	}
	
	public double perimeter() {
		return (this.Width * 2) + (this.Height *2);
	}
	
	public double diagonal() {
		
		return Math.sqrt(Math.pow(Width, 2) + (Math.pow(Height, 2)));
	}
	
	public String toString() {
		return "AREA: " + String.format("%.2f%n", area())
				+"PERIMETER: " + String.format("%.2f%n", perimeter())
				+"DIAGONAL: " + String.format("%.2f%n", diagonal());
	}
}
