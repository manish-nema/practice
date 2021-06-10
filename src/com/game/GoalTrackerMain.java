package com.game;

import java.io.File;
import java.io.FileFilter;
import java.text.ParseException;
import java.lang.Math;

public class GoalTrackerMain
{
	
	public static void main(String[] args) throws ParseException, Exception
	{
		GoalTracker goalTrackerImpl = new GoalTrackerImpl();
		
		/*
		 * goalTrackerImpl.scoreForTeam("A"); goalTrackerImpl.scoreForTeam("A");
		 * goalTrackerImpl.scoreForTeam("B"); goalTrackerImpl.scoreForTeam("A");
		 * goalTrackerImpl.scoreForTeam("C"); goalTrackerImpl.scoreForTeam("C");
		 * goalTrackerImpl.lossForTeam("C"); goalTrackerImpl.lossForTeam("B");
		 * goalTrackerImpl.scoreForTeam("C"); goalTrackerImpl.scoreForTeam("C");
		 * goalTrackerImpl.scoreForTeam("C");
		 */
	StringBuilder sb = new StringBuilder();
	sb.append("hello");
	sb.append("\n");
	sb.append("Hi");
StringBuilder sb1 = new StringBuilder();
sb1 = sb;

StringBuilder sb2 = new StringBuilder();
sb1.insert(0, "hhh:\n");
System.out.println(sb1);
int i =1;
if(i<=1)
{
	//System.out.println(i);
}
System.out.println(str(37));

	}
	public static File[] createArrayBasedOnFlag(File originalFilesDir,String flag)
	{
		System.out.println("CallingScript createArrayBasedOnFlag start");
		 File[] csvfilelist = originalFilesDir.listFiles(new FileFilter()
		 {
				public boolean accept(File pathname)
				{
					boolean isAccept=false;
					if(pathname.getName().endsWith("_V.csv") || pathname.getName().endsWith("_H.csv"))
						{

							System.out.println("pathname.getAbsolutePath():::"+pathname.getAbsolutePath());
							isAccept=true;
						}
					
					
					return isAccept;
				}
				
				});	
		 System.out.println("CallingScript createArrayBasedOnFlag end");
		 return csvfilelist;
	}

	static String str(int i) {
	    return i < 0 ? "" : str((i / 26) - 1) + (char)(97 + i % 26);
	}
	
}
