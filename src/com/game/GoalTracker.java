package com.game;

public interface GoalTracker {

	public void scoreForTeam(String name); 
	
	public void lossForTeam(String name);
	
	public String displayScores(); 
}
