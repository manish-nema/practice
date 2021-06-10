package com.ibm;

public class TestChar {

	public static void main(String[] args) {
		System.out.println(str(27));
	}
	
	static String str(int i) {
	    return i < 0 ? "" : str((i / 26) - 1) + (char)(97 + i % 26);
	}
}
