package com.maple.grade;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{	
		Student stu = new Student();
		Printer printer = new Printer();
		
		stu.setName("김형종");
		stu.addSubject("디지털공학", 98);
		stu.addSubject("임베디드시스템", 76);
		stu.addSubject("운영체제", 30);
		stu.addSubject("유닉스리눅스", 69);
		stu.addSubject("컴퓨터그래픽스", 88);
	
		printer.printStudentInfo(stu);
	}
}
