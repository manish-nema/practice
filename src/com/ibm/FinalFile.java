package com.ibm;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class FinalFile
{
	 boolean flag=false;
   public static void main(String[] args) throws Exception
   {
      File file = new File("C:\\Users\\ManishNema\\Documents\\report");
      System.out.println(file.getParentFile());
      System.out.println(file.getParent());
      File[] fileList = file.listFiles();
      PrintWriter writer;
      for(File f : fileList)
      {
    	  if(f.getName().startsWith("SORTED_VOICE")) {
    		  System.out.println(f.getAbsolutePath());
    		
    		StringBuilder str = new StringBuilder();
    		
    		str.append("Header part");
    	
    		str.append(System.getProperty("line.separator"));
    		
    		str.append(writeBody(f));
    		str.append("Footer part");
    		writer=new PrintWriter(new FileWriter(f));
    		writer.print(str);;
    		writer.flush();
    		writer.close();
      }}
     
   }
 
   
   public static StringBuilder writeBody(File f)  throws Exception
	{
		System.out.println("CSVUtility:writeBody start");
		StringBuilder htmlString = new StringBuilder();
		BufferedReader reader = new BufferedReader(new FileReader(f));
		try
		{
			int recordNo=0;
			String line= null;
			while((line = reader.readLine()) != null)
			{
				String[] record = line.split(",");
				for (int i = 0; i<record.length ;i++)
				{
					htmlString.append(record[i]+",");
					if(recordNo==12)
					{
						htmlString.append(System.getProperty("line.separator"));
						recordNo=-1;
					}
					recordNo++;
				}
				htmlString.append(System.getProperty("line.separator"));
			}
			//System.out.println("after while "+htmlString);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception"+e);
			//logger.error(" CSVReport:: writeBody() : Exception - "+ e.getMessage());
			throw new Exception(e);
		}
		finally
		{
			try 
			{
				if(reader!=null)
				reader.close();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		return htmlString;
	}
   public void getFiles(String dir)
   {
      File directory = new File(dir);
 
      //Verify if it is a valid file name
      if (!directory.exists())
      {
         System.out.println(String.format("Directory %s does not exist", dir));
         return;
      }
 
      //Verify if it is a directory and not a file path
      if (!directory.isDirectory())
      {
         System.out.println(String.format("Provided value %s is not a directory", dir));
         return;
      }
 
      //File[] files = directory.listFiles(logFilefilter);
      m1(directory);
      
// System.out.println(files.length);
		/*
		 * for (File f: files) { System.out.println("hello "+
		 * f.toString()+" lenght "+f.length());
		 * 
		 * }
		 */      //Let's list out the filtered files
      
   }
 
   
   public void m1(File dir) {
	  
   //create a FileFilter and override its accept-method
   File[] logFilefilter =dir.listFiles( new FileFilter() {
      //Override accept method
      public boolean accept(File file) {
    	  boolean isAccept=false;
         //if the file extension is .log return true, else false
    	//  System.out.println(file.toString());
    	 // String []a = file.toString().split(".LOG");
    	  //String aa=a[0]+".ctl";
    	  //File aafile = new File(aa);
    	  //System.out.println(aafile.getName());
    	  System.out.println(file.getName());
         if (file.getName().endsWith(".LOG")) {
        	 flag=true;
        	 isAccept=true;
         }
         return isAccept;
      }
   });
   if(flag)
   {
	   System.out.println("flag is true");
   }
   }
}