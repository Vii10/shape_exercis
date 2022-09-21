package model.entities;

import model.enums.Color;

public class Rectangle extends Shape {
	
	private double base;
	private double height;
	
	public Rectangle(Color color, double base, double height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double Area() {
		return base * height;
	}
	@Override
	public String toString() {
		return "Area: " + Area() + "\n"
				+ "Cor: " +getColor();
	}
}
