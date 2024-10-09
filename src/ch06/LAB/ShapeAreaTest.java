package ch06.LAB;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

class Shape {
	public double getArea() {
		return 0;
	}
	public Shape() {
		super();
	}
}

class Rectangle extends Shape {
	private double width, height;
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return width * height;
	}
}

class Triangle extends Shape {
	private double base, height;
	public double getArea() {
		return 0.5 * base * height;
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
}

public class ShapeAreaTest {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Shape obj1 = new Rectangle(10.0, 20.0);
		Shape obj2 = new Triangle(10.0, 20.0);
		
		bw.write("Rectangle: " + obj1.getArea() + "\n");
		bw.write("Triangle: " + obj2.getArea() + "\n");
		
		bw.flush();
		bw.close();
	}

}
