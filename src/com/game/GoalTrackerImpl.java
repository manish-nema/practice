package com.game;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class GoalTrackerImpl implements GoalTracker {

	Map<String,Integer>scores = new HashMap<>();
	ArrayList<String> l = new ArrayList<>();
	String result=null;
	
	public void scoreForTeam(String name) {
		// TODO Auto-generated method stub
		
		Integer score = scores.get(name);
		if(score ==null)
		{
			scores.put(name, 1);
			l.add(name);
			
		}
		else 
		{
			if(l.get(0).equalsIgnoreCase(name))
			scores.put(name, score+2);
			else
				scores.put(name, score+1);
			
		}
		l.set(0, name);
		result="score for Team"+" "+name;
		displayScores();
		
	}

	
	public void lossForTeam(String name) {
		// TODO Auto-generated method stub
		Integer score = scores.get(name);
		if(score !=0)
		{
			scores.put(name, score-1);
			l.set(0, "NA");
		}
		result="loss for Team"+" "+name;
		displayScores();

	}


	public String displayScores() {
		// TODO Auto-generated method stub
		System.out.println(result);
		System.out.println(scores);
		return null;
	}

}
