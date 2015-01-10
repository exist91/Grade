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
		this.total_score = sco;
	}
	public int getTotalScore()
	{
		return this.total_score;
	}
	public void setAverageGrade(String grd)
	{
		this.average_grade = grd;
	}
	public String getAverageGrade()
	{
		return this.average_grade;
	}
	public int getSubjectCount()
	{
		return this.count + 1;
	}
	
	public void setName(String na)
	{
		this.name = na;
	}
	public String getName()
	{
		return this.name;
	}
	
	public String getSelectedSubject(int cnt)
	{
		return this.subject[cnt];
	}
	public int getSelectedScore(int cnt)
	{
		return this.score[cnt];
	}
	public void setSelectedGrade(int cnt, String grd)
	{
		this.grade[cnt] = grd;
	}
	public String getSelectedGrade(int cnt)
	{
		return this.grade[cnt];
	}
	
	public void addSubject(String sub, int sco)
	{
		if(this.count == max)
		{
			System.out.println("Subject 배열 꽉참");
		}
		else
		{
			this.count++;
			this.subject[count] = sub;
			this.score[count] = sco;
		}
	}
}
