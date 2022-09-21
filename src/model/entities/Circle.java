package model.entities;

import model.enums.Color;

public class Circle extends Shape {
	
	private static final double PI = 3.13;
	private double radius;
	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	@Override
	public double Area() {
		return PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Area: " + Area() + "\n"
				+ "Cor: " +getColor();
	}
}
