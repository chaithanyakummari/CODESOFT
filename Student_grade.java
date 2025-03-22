package student_grade;

import java.util.Scanner;

public class Student_grade {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number of subjects");
		int sub=sc.nextInt();
		int totalmarks=0;
	double avg=0;
		for(int i=1;i<=sub;i++) {
			System.out.println("enter the subject marks from 1 to 100 for subject "+i);
			int marks=sc.nextInt();
			if(marks>0&&marks<=100) {
				totalmarks+=marks;
			}
			else {
				System.out.println("invalid marks please enter the marks in between 1 to 100 only");
				
			}
		}
		avg=totalmarks/sub;
		String grade=calculategrade(avg);
		System.out.println("your total marks obtaid for "+sub+" subjects is:"+totalmarks);
		System.out.println("your average percentage obtaid for "+sub+"subject is:"+String.format("%1f", avg)+"%");
		System.out.println("your obtained grade is :"+grade);
		
		
		
	}

	private static String calculategrade(double avg) {
		// TODO Auto-generated method stub
		if(avg>=90) 
		return "A+";
		else if(avg>=80&& avg<=89) return "A";
		else if(avg>=70&& avg<=79) return "B";
		else if(avg>=60&& avg<=69) return "C";
		else if(avg>=50&& avg<=59) return "D";
		else return "fail";
		
		
	}


}
