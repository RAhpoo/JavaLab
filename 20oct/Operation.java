/*
program: wap to find 1.square,2.cube ,3.number is even/odd using swichcase
@author: Rahul Jaiswal
@date: 20oct
*/
import java.util.*;
class Operation //declaring a class
{
	//main started
    static void square(float n1)//formal//dummy arguments
	{
     float squ = n1*n1;
	 System.out.println("Result is :"+squ);
    }//end of started
	
	static void cube(float n1)//formal//dummy arguments
	{
     float cub = n1*n1*n1;
	 System.out.println("Result is :"+cub);
    }//end of started
	
	static void number(float n1)//formal//dummy arguments
	{
	 float number = n1;
	 //cheak number is even/odd
     if(number%2==0)
	 
	   System.out.println("It is Even Number :"+number);
	     else 
	      System.out.println("It is Odd Number  :"+number);
	   
     //end of ifelse
	}//end of started
	
	//main started
	public static void main(String args[]) 
	{
	 //declaring the object of scanner
	 Scanner sc=new Scanner(System.in);
	 
	 //declaring variables
	 float n1;
	 int choice;
	 
	 //taking input
	 System.out.println("Enter  number :");
	 n1= sc.nextFloat();
	 	 
		 //menu
		 System.out.println("1.Square");
		 System.out.println("2.Cube ");
		 System.out.println("3.Number is even/odd ");
         System.out.println("4.Exit ");
		 System.out.println("Enter the choice : ");
		 choice=sc.nextInt();
		 
		 //switchcase
		 switch(choice)
	 {
		 
		case 1:square(n1);
		        break;
		case 2:cube(n1);
		        break;
		case 3:number(n1);
		        break;
		case 4:System.exit(0);
		        break;				
		default :System.out.println("Wrong choice");
		        		
	 }//end of swithcase
	
	}//end of main

}//end of class