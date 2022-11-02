package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private int length;
	private int width;
	private boolean square;
	
	
	public Rectangle(int l, int w, boolean sq) {
		
		length = l;
		width = w;
		square = sq;
		
	}
	
	public int Length(int l) {
		
		length = l;
		return length;
	
	}
	
	public int Width(int w) {
		
		width = w;
		return width;
	
	}
	
	
	public int Area(int l, int w) {
		
		length = l;
		width = w;
		
		return ((int) length * width);
	}
	
	public int Perimeter( int l, int w) {

		length = l;
		width = w;
		
		return ((2*length) + (2*width));
	}
	
	public boolean Smaller(Rectangle x, Rectangle y) {

		if (x.Area(length, width) > y.Area(length, width)) {
			
			return false;
			
		}
		
		return true;
		
	}
	
	public void Draw() {
		
		if (square == true) {
			
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.square(0.5, 0.5, (0.5 * length));
		}
		
		else {
			
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.rectangle(0.5, 0.5, (0.5 * width), (0.5 * length));
			
		}
	}
	

	public static void main(String[] args) {
	
	
		Rectangle r = new Rectangle(5, 2, false);
		Rectangle R = new Rectangle(6, 3, true);
	
		System.out.println("Area: " + r.Area(5, 2));
		System.out.println("Perimeter: " + r.Perimeter(5, 2));
		System.out.println("Area: " + R.Area(6, 3));
		System.out.println("Perimeter: " + R.Perimeter(6, 3));
		
		System.out.println("Smaller in comparison?: " + r.Smaller(R, r ));
	
		r.Draw();
	
	}
}

