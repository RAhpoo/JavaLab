package com.ques5;

//creating class
public class Car {
	
	//enum
	enum car{I20(2010), polo(2016), salavia(2022), thar(2020);
		int i;
		car(int i)
		{
			this.i= i;
		}};
	
	//main method
		public static void main(String[] args)
	{
		for(car c:car.values())
		{
			System.out.println(c+"-"+c.i);
		}
	}
}