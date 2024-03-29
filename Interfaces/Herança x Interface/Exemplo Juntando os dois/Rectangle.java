package model.entities;

import model.enums.Color;

public class Rectangle extends AbastractShape {
	private double width;
	private double height;
	public Rectangle(double width, double height, Color color) {
		super(color);
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	
}
