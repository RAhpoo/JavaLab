package com.ques2;
public class StringEx{  
public static void main(String args[])
{  
String name="javatpoint";  
char ch=name.charAt(4);    //returns the char value at the 4th index 

String str1 = "Hello";  
String str2 = "Javatpoint";  
String str3 = "Reader";  
// Concatenating one string   
String str4 = str1.concat(str2);          
System.out.println(str4);  
// Concatenating multiple strings  
String str5 = str1.concat(str2).concat(str3);  


String str = "Welcome to Javatpoint portal";      
int strLength = str.length(); 
String s1="java string";    
//The string s1 does not get changed, even though it is invoking the method      
//concat(), as it is immutable. Therefore, the explicit assignment is required here.  
s1.concat("is immutable");    
s1=s1.concat(" is immutable so assign it explicitly");    



System.out.println(s1);    
System.out.println(ch); 
// Fetching first character  
System.out.println("Character at 0 index is: "+ str.charAt(0));      
// The last Character is present at the string length-1 index  
System.out.println("Character at last index is: "+ str.charAt(strLength-1));     
System.out.println(s1);
System.out.println(str5);  
}
}  