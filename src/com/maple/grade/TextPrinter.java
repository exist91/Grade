package com.maple.grade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TextPrinter 
{
	public void printStudentInfoToFile(Student stu) throws FileNotFoundException
	{
		Printer print = new Printer();
		
		File outfile = new File("output.txt");
		
		PrintStream ps = new PrintStream(new FileOutputStream(outfile));
		
		PrintStream sysout = System.out;
		
		System.setOut(ps);
		//System.setErr(ps);
		
		print.printStudentInfo(stu);
		
		System.setOut(sysout);
		
		ps.close();
	}	
}
