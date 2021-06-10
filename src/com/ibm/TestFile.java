package com.ibm;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException {
		 File file = new File("C:\\manish");
		 File[] fileList = file.listFiles();
		 File f = new File(file.getAbsolutePath()+"/"+"latest.txt");
		 f.createNewFile();

	}

}
