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
 
public class IOUtils
{
	 boolean flag=false;
   public static void main(String[] args) throws Exception
   {
      IOUtils ioUtils = new IOUtils();
   //   ioUtils.getFiles("C:\\temp");
    //  FileOutputStream f = new FileOutputStream("C:/manish/manish.txt");
      File file = new File("C:\\Users\\ManishNema\\Documents\\report");
      File[] fileList = file.listFiles();
      String nextLine=null;
      PrintWriter writer;
      StringBuilder htmlString = new StringBuilder();
      for(File f : fileList)
      {
    	  if(f.getName().startsWith("SORTED_VOICE")) {
    		  System.out.println(f.getAbsolutePath());
    //		
    		  File newFile = new File(file.getAbsolutePath()+"/"+"TEST_SORTED_VOICE.csv");
    		  newFile.createNewFile();
    		StringBuilder str = new StringBuilder();
    		
    	//	BufferedReader reader = new BufferedReader(new FileReader(f));
			
		//	int linecount=0;
		
			/*
			 * if(reportdto_circle.getFormat().equalsIgnoreCase("P")){ document.open(); }
			 */
			
			/*
			 * while ((nextLine = reader.readLine()) != null) {
			 * 
			 * // System.out.println("nextLine "+nextLine); htmlString.append(nextLine);
			 * 
			 * }
			 */
			 
		
    		//InputStream in=new ByteArrayInputStream(htmlString.toString().getBytes());
    		//BufferedReader readerBody_circle=new BufferedReader(new InputStreamReader(in));
    		str.append("Header part");
    	
    		str.append(System.getProperty("line.separator"));
    		
    		//str.append(writeBody(readerBody_circle));
    		str.append(writeBody(f));
    		// str.append(System.getProperty("line.separator"));
    		str.append("Footer part");
    		writer=new PrintWriter(new FileWriter(f));
    		writer.print(str);;
    	//	writer.write(str);
    		writer.flush();
    		writer.close();
    	 // System.out.println("file created");
      }}
     
   }
 
   
  // public static StringBuilder writeBody(BufferedReader reader)  throws Exception
   public static StringBuilder writeBody(File f)  throws Exception
	{
		System.out.println("CSVUtility:writeBody start");
	//	System.out.println("print html "+htmlString);
		StringBuilder htmlString = new StringBuilder();
		//int recordCount = 0;
		BufferedReader reader = new BufferedReader(new FileReader(f));
		try
		{
			int recordno=0;
			String line= null;
			while((line = reader.readLine()) != null)
			{
				/*++recordCount;
				System.out.println("Appending recordCount*****");
				htmlString.append(recordCount+Constants.COMMA)*/;
				System.out.println("Line is "+line);
				String[] record = line.split(",");
				for (int i = 0; i<record.length ;i++)
				{
					htmlString.append(record[i]+",");
					System.out.println("Record is "+i+" "+record[i]);
					if(recordno==12)
					{
						System.out.println("with if");
						htmlString.append(System.getProperty("line.separator"));
						recordno=-1;
					}
					recordno++;
					//Thread.sleep(1000);
				}
				System.out.println("after while and before line separator "+htmlString);
				htmlString.append(System.getProperty("line.separator"));
			}
			System.out.println("after while "+htmlString);
			//htmlString.append(Constants.LINE_SEPERATOR);
			/*if(logger.isInfoEnabled()){
				logger.info("CSVUtility ::  writeBody(BufferedReader) Counter is "+recordCount);
			}*/
			//reportDto.setRecordCount(recordCount);
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
		/*if(logger.isInfoEnabled()){
			logger.info(" Exited from CSVReport ::  writeBody(BufferedReader reader, StringBuilder htmlString)");
		}*/
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