package ques1;


import java.util.HashSet;
import java.util.Set;

public class ContactBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Set<String> a = new HashSet<String>();
        Set<String> b = new HashSet<String>();
        Set<String> c = new HashSet<String>();
        
        a.add("Pranjal Rajeev");
        a.add("9874563210");
        a.add("Pranjal@gmail.com");
       
        
        b.add("Suman Kumar");
        b.add("9632145870");
        b.add("Suman@gmail.com");
        
        //Duplicate input
        c.add("Suman Kumar");
        c.add("9632145870");
        c.add("Suman@gmail.com");
        
 
        // Printing elements of HashSet object
        System.out.println(a);
        System.out.println(b);

	}

}