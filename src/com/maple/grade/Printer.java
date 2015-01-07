package com.maple.grade;

public class Printer
{
	public void printGrade(String grade)
	{
		if(grade == "error") System.out.println("잘못 입력하셨습니다.");
		else System.out.println("당신의 학점은 " + grade + " 입니다.");
	}
}