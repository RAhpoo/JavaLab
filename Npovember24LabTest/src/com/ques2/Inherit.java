package com.ques2;
public class Inherit {
	public void display()
	{
		System.out.println("This is a Parent Class");
	}

}
class B extends Inherit{

	public void display()
	{
		super.display();
		System.out.println("This is a Child Class");
	}
}