package entities;

import entities.enums.Color;

public class Rectangle extends Shape {
	
	private Double heigh;
	private Double width;
	
	public Rectangle() {
		super();
	}
	public Rectangle(Double heigh, Double width) {
		super();
		this.heigh = heigh;
		this.width = width;
	}

	public Rectangle(Color color, Double heigh, Double width) {
		super(color);
		this.heigh = heigh;
		this.width = width;
	}
	public Double getHeigh() {
		return heigh;
	}
	public void setHeigh(Double heigh) {
		this.heigh = heigh;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	@Override
	public double area() {
		return heigh * width;
	}

}
