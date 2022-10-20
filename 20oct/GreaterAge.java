/*
program: Wap to find grater of three person
@author: Rahul Jaiswal
@date: 20 oct 2022
*/
import java.util.*;
//class declaring
class GreaterAge
{
	//main stated
	public static void main(String args[])
	{
		//declaring the object of scanner		 
		Scanner sc =new Scanner(System.in);
		
		//declaring variables
		int age1,age2,age3;
		
		//taking input
		System.out.println("Enter  three age :");
		age1=sc.nextInt();
		age2=sc.nextInt();
		age3=sc.nextInt();
		
		//cheaking the greater age
		if((age1>age2)&&(age1>age3))
		  System.out.println("Oldest person :"+age1);
	     else if(age2>age3)
		    System.out.println("Oldest person :"+age2);
		 else
			 System.out.println("Oldest person :"+age3);
	}//end of main
}//end of class
