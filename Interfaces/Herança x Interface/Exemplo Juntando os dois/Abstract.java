package model.entities;

import model.enums.Color;

public abstract class AbastractShape implements Shape {
	private Color color;

	public AbastractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
