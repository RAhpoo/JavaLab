//use of Exception Handling  in java

package com.ques1;

import java.util.Scanner;
class basicCalc {
public static  void main (String[] args) {
	try {
		int n1,n2,ans;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two number");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("Enter the operator (+,-,*,/)");
		op=sc.next().charAt(0);
		switch(op) {
		case '+' : ans=n1+n2;
		break;
		case '-' : ans=n1-n2;
		break;
		case '*' : ans=n1*n2;
		break;
		case '/' : ans=n1/n2;
		break;
		default: System.out.println("Error");
		return;
		}
		System.out.println("Answer is :"+ans);
	}
		catch(Exception e){
			System.out.println("You can not divided by zero");
			
			
		}
		
}
}

