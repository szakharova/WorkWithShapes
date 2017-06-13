package org.itstep;

import java.util.ArrayList;

public class ShowOurWork {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setArea(25);
		Triangle triangle = new Triangle();
		Square square = new Square();

		circle.setRadius(10);
		circle.setArea((int) (Math.PI * circle.getRadius() * circle.getRadius()));

		triangle.setBaseLine(15);
		triangle.setHeight(7);
		triangle.setArea((triangle.getBaseLine() * triangle.getHeight()) / 2);

		square.setSide(15);
		square.setArea(square.getSide() * square.getSide());

		ArrayList<Shape> listOfShapes = new ArrayList<>();
		listOfShapes.add(square);
		listOfShapes.add(triangle);
		listOfShapes.add(circle);

		for (int i = 0; i < listOfShapes.size(); i++) {
			System.out.println("Area of shape is = " + listOfShapes.get(i).getArea());
			//System.out.println(listOfShapes.get(i).hashCode());
		}
		
		ArrayList<String> listOfIP = new ArrayList<>();
		for (int i = 100; i < 200; i++) {
			String ip = "123.25.58."+ i;
			listOfIP.add(ip);
		}
		System.out.println(listOfIP.size());
		System.out.println(listOfIP.get(15));
	}

}
