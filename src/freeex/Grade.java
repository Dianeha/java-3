package freeex;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		String name;
		int schoolYear;
		double grade;
		Scanner koo = new Scanner(System.in);

		System.out.println(" * * * �л� ���� �Է� * * *");
		System.out.print("�̸� : ");
		name = koo.next();

		System.out.print("�г� : ");
		schoolYear = koo.nextInt();
		System.out.println("������� : ");
		grade = koo.nextDouble();

		System.out.println("\n\n * * * �Էµ� �л� ���� ���� * * * ");
		System.out.println("�̸� = " + name);
		System.out.println("�г� = " + schoolYear);
		System.out.println("���� = " + grade);
		koo.close();
	}
	
}
