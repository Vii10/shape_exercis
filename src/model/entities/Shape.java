package model.entities;

import model.enums.Color;
import model.util.InterfaceArea;

public abstract class Shape implements InterfaceArea{
	
	private Color color;

	public Shape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
