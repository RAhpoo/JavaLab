package com.ques4;

public class Rectangle {
	public int length;
	public int breadth;

	public int area(int length, int breadth) {
		return length * breadth;

	}

	public int perimeter(int length, int breadth) {
		return 2 * (length + breadth);

	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

}

class Square extends Rectangle {

	int side;

	public Square(int length, int breadth, int side) {
		super(length, breadth);
		this.side = side;
	}

}