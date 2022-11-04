/* Question 1: Piggie Bank
 @Author: Rahul jaiswal
 @Date: 3 Nov 2022
 */

//package
package com.ques3;

//creating class
public class POJO {
	
	//declaring instance variables
	private int addamt;
	private int amount;
	
	
	//default constructor
	public POJO() 
	{
		super();
		// TODO Auto-generated constructor stub
		System.out.println("DEFAULT CONSTRUCTOR");
		this.amount=50;
	}



	//Parameterised constructor
	public POJO(int addamt, int amount) 
	{
		System.out.println("PARAMERISED CONSTRUCTOR");
		this.addamt = addamt;
		this.amount = amount;
	}



	public int getAddamt() {
		return addamt;
	}



	public int setAddamt(int addamt) {
		return this.addamt = addamt;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}