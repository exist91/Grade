package com.maple.grade;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{	
		Student std = new Student();
		
		std.setName("김형종");
		std.addSubject("디지털공학", 98);
		std.addSubject("임베디드시스템", 76);
		std.addSubject("운영체제", 30);
		std.addSubject("유닉스리눅스", 69);
		std.addSubject("컴퓨터그래픽스", 88);
		
		System.out.println("이름 : " + std.getName());
		for(int i = 0; i <= std.getSubjectCount(); i++)
		{
			System.out.println("과목 : " + std.getSelectedSubject(i));
			System.out.println("점수 : " + std.getSelectedScore(i));
		}
		
		
	}
}
