package com.ques4;

public class Duplicate {

	public void duplicate(String s) {
		int len = s.length();
		int i, j;
		String dupli = "";
		for (i = 0; i <= len; i++) {
			for (j = len - 1; j > 0; j--) {
				if (s.charAt(i) == s.charAt(j - 1)) {
					dupli = dupli + s.charAt(i);
				}

			}
		}
		System.out.println("Duplicate chars in String :" + dupli);
	}

}