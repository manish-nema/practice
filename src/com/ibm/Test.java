package com.ibm;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("af");
		l.add("ew");
		Object[] a = l.stream().toArray();

List<Object[]> ll = new ArrayList<>();
ll.add(a);
	}

}
