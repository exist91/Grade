package com.maple.grade;

public class Calculator 
{
	//1~100 사이 점수를 입력받아 학점 출력(A,B,C,D,E,F)
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