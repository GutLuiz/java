package model.entities;

import model.enums.Color;

public class Circle extends AbastractShape {
	
	private double radius;

	public Circle(double radius, Color color) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
}
