package com.maple.grade;

public class Student 
{
	private int max = 20;
	private int count = -1;
	private String name;
	private String[] subject = new String[max];
	private int[] score = new int[max];
	private String[] grade = new String[max];
	private int total_score;
	private String average_grade;
	
	public void setTotalScore(int sco)
	{
		total_score = sco;
	}
	public int getTotalScore()
	{
		return total_score;
	}
	public void setAverageGrade(String grd)
	{
		average_grade = grd;
	}
	public String getAverageGrade()
	{
		return average_grade;
	}
	public int getSubjectCount()
	{
		return count;
	}
	
	public void setName(String na)
	{
		name = na;
	}
	public String getName()
	{
		return name;
	}
	
	public String getSelectedSubject(int cnt)
	{
		return subject[cnt];
	}
	public int getSelectedScore(int cnt)
	{
		return score[cnt];
	}
	public void setSelectedGrade(int cnt, String grd)
	{
		grade[cnt] = grd;
	}
	public String getSelectedGrade(int cnt)
	{
		return grade[cnt];
	}
	
	public void addSubject(String sub, int sco)
	{
		if(count == max)
		{
			System.out.println("Subject 배열 꽉참");
		}
		else
		{
			count++;
			subject[count] = sub;
			score[count] = sco;
		}
	}
}
