package com.maple.grade;

public class Calculator 
{	
	public String convertScoreToGrade(int score)
	{	
		if(score < 1 || score > 100) return "error";
		else if(score >= 90) return "A";
		else if(score >= 80) return "B";
		else if(score >= 70) return "C";
		else if(score >= 60) return "D";
		else return "F";
	}
	
}