package com.maple.grade;

public class Student 
{
	private int max = 20;
	private int count = -1;
	private String name;
	private String[] subject = new String[max];
	private int[] score = new int[max];
	private char[] grade = new char[max];
	
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
	public void setSelectedGrade(int cnt, char grd)
	{
		grade[cnt] = grd;
	}
	public char getSelectedGrade(int cnt)
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
