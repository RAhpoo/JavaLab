package com.ques2;
public class Hotel {

//POJO class: 
public class Hotel {

	private int room_no;
	private int room_type;
	private int acfacility;
	private float area;
	private float price;
	

	// default constructor
	public Hotel() {
		
		System.out.println("Default............");

	}

	// parameterised constructor
	
	public Hotel(int id, String stName) {
		this(); // constructor chaining
		System.out.println("Paramterized 1.............");
		// calling the Object class

					this.price = 3000;

	}

	// parameterised constructor
	
	public Hotel(int room_no, int room_type, int acfacility, float area, float price) {
		
		// this refers to current object
		
		this.room_no = room_no;
		this.room_type = room_type;
		this.acfacility = acficility;
		this.area = area;
		System.out.println("Paramterized 2............");
	}

	// copy constructor

	public int getRoom_no() {
		return room_no;
	}

	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}

	public int getRoom_type() {
		return room_type;
	}

	public void setRoom_type(int room_type) {
		this.room_type = room_type;
	}

	public int getAcfacility() {
		return acfacility;
	}

	public void setAcfacility(int acfacility) {
		this.acfacility = acfacility;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}


	
	@Override
	public String toString() {
		return "Hotel room_no=" + room_no + ", room_type=" + room_type + ", acfacility=" + acfacilty+",area=" + area + ", price=" + price ";
	}
}
