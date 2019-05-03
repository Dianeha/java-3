package freeex;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		String name;
		int schoolYear;
		double grade;
		Scanner koo = new Scanner(System.in);

		System.out.println(" * * * 학생 정보 입력 * * *");
		System.out.print("이름 : ");
		name = koo.next();

		System.out.print("학년 : ");
		schoolYear = koo.nextInt();
		System.out.println("평균학점 : ");
		grade = koo.nextDouble();

		System.out.println("\n\n * * * 입력된 학생 학점 정보 * * * ");
		System.out.println("이름 = " + name);
		System.out.println("학년 = " + schoolYear);
		System.out.println("학점 = " + grade);
		koo.close();
	}
	
}
