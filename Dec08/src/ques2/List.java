package ques2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class List {

	public int iD(int iD)
	{
		return iD;
		
	}
	public String Name(int iD, String name)
	{
		return name;
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer, String> l = new HashMap<>();
		l.put(1, "Pranjal Rajeev");
		l.put(2, "Suman Kumar");
		l.put(3, "Saurav");
		
		System.out.println("Enter the ID you want to Search : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		sc.close();
	}

}