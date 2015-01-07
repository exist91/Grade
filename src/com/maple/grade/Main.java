package com.maple.grade;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{	
		Calculator calc = new Calculator();
		Printer prt = new Printer();
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		sc.close();
		
		prt.printGrade( calc.convertScoreToGrade(input) );

	}
}
