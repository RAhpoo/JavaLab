package com.ques3;


public class StrReverse {
	
	public void strrev(String s)
	{
		int i;
		String rev="";
		int len = s.length();
		for(i=len; i>0; --i)
		{
			rev = rev+ s.charAt(i-1);
		}
		System.out.println("Reverse of String is :"+rev);
	}

}