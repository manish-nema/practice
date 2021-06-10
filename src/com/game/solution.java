package com.game;
import java.io.*;
import java.nio.file.Files; 
  
public class solution { 
    public static void main(String args[]) 
    { 
  
        // try-catch block to handle exceptions 
        try { 
  
            // Create a file object 
            File f = new File("C:/Users/ManishNema/Documents/report/16426"); 
  
           // File[] files=f.listFiles();
            // Create a FilenameFilter 
			
			  FilenameFilter filter = new FilenameFilter() {
			  
			  public boolean accept(File f, String name)
			  { 
				boolean isAccept=false;
			    if(name.endsWith("_H.csv") ||name.endsWith("_H.CSV"))
			  {
			    	isAccept=true;
			  }
			  return isAccept;
			  }
			  };
			  
			  // Get all the names of the files present // in the given directory // and
		File[] files = f.listFiles(filter);
			 
  
            System.out.println("Files are:"); 
  
            // Display the names of the files 
            for (int i = 0; i < files.length; i++) { 
                System.out.println(files[i].getName()); 
            //    File des = new File(f.getAbsolutePath()+"/"+123+"/"+"SORTED_VOICE.csv");
                File newd = new File(f.getAbsolutePath()+"/"+123+"/"+"hello.csv"); 
              //  newd.mkdir();
                System.out.println("PATH "+newd.getAbsolutePath());
           //     File des = new File(newd.getAbsolutePath()+"/"+"SORTED_VOICE.csv");
             //   File f1 = new File(f.getAbsolutePath()+"/"+files[i].getName()); 
               // FileOutputStream fos = new FileOutputStream(des);
            //    FileInputStream fis = new FileInputStream(files[i].getName());
           ///     Files.copy(f1.toPath(), fos);
               if(newd.exists())
               {
            	   System.out.println("File exist");
               }
               else
               {
            	   System.out.println("File doen not exist");
               }
               PrintWriter writer = new PrintWriter(new FileWriter(newd));
               writer.print("hello");
               writer.flush();
               writer.close();
            } 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
} 