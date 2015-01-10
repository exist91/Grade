package com.maple.grade;

public class Calculator 
{	
	public void calculateGrade(Student stu)
	{
		for(int i = 0; i < stu.getSubjectCount(); i++)
		{
			stu.setSelectedGrade(i, convertScoreToGrade(stu.getSelectedScore(i)));
		}
	}
	
	public void calculateTotalScoreAndAverageGrade(Student stu)
	{
		int sum = 0;
		
		for(int i = 0; i < stu.getSubjectCount(); i++)
		{
			sum += stu.getSelectedScore(i);
		}
		
		stu.setTotalScore(sum);
		stu.setAverageGrade( convertScoreToGrade(sum/stu.getSubjectCount()) );
	}
	
	private String convertScoreToGrade(int score)
	{	
		if(score < 1 || score > 100) return "error";
		else if(score >= 90) return "A";
		else if(score >= 80) return "B";
		else if(score >= 70) return "C";
		else if(score >= 60) return "D";
		else return "F";
	}
}