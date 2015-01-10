package com.maple.grade;

public class Printer
{
	public void printStudentInfo(Student stu)
	{
		Calculator calc = new Calculator();
		
		calc.calculateGrade(stu);
		calc.calculateTotalScoreAndAverageGrade(stu);
		
		System.out.println("이름 : " + stu.getName() );
		
		System.out.println("당신은 " + stu.getSubjectCount() + "개의 과목을 수강하였습니다.");
		
		for(int i = 0; i < stu.getSubjectCount(); i++)
		{
			System.out.println((i+1) + ". 과목 : " + stu.getSelectedSubject(i));
			System.out.println("   점수 : " + stu.getSelectedScore(i));
			System.out.println("   학점 : " + stu.getSelectedGrade(i));
		}
		
		System.out.println("당신의 총점은 " + stu.getTotalScore()+ "점 입니다.");
		System.out.println("당신의 평균학점은 " + stu.getAverageGrade() + " 입니다.");	
	}
}