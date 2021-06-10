package com.ibm;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListRemove {

	public static void main(String[] args) {
	List<String> l = new ArrayList<>();
	l.add("ABC");
	l.add("PQR");
	l.add("XYZ");
	
	ListIterator<String> it = l.listIterator();
	while(it.hasNext())
	{
		if(it.next().equalsIgnoreCase("ABC"))
		it.remove();
	}
	
		//l.removeIf(s-> s.equalsIgnoreCase("ABC"));
	
	System.out.println(l);

	}

}
