package site.itwill.lang;

import java.util.Scanner;

public class ConsoleCalculateApp_T {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����� �Է� >> ");
		String operation=scanner.nextLine().replace(" ", "");
		
		scanner.close();
		
		//����Ŀ��� �����ڸ� �˻��Ͽ� �������� ��ġ(index) ����
		//�˻������ڵ��� ������ �迭
		String[] operatorArray= {"+","-","*","/"};
		int index=-1; //�������� ��ġ���� �����ϱ� ���� ����
		for(String temp:operatorArray) {
			//����Ŀ��� �����ڸ� �˻��Ͽ� ��ġ���� ��ȯ�޾� ���� 
			// => �����ڰ� ����Ŀ� �������� ���� ��� -1�� ��ȯ�޾� ����
			index=operation.indexOf(temp);
			//�����ڰ� �˻��Ǿ� ����� ��� �ݺ��� ����
			if(index!=-1) break;
		}
		
		//����Ŀ� �����ڰ� ���ų� �ǿ����ڰ� �ΰ��� �ƴ� ��� 
		if(index<=0 || index>=operation.length()-1) {
			System.out.println("[����] ������� �߸� �Է��Ͽ����ϴ�.");
			System.exit(0); //���α׷� ����
		}
		
		try {
		//����Ŀ��� �ǿ����ڿ� �����ڸ� �и��Ͽ� ����
		int num1=Integer.parseInt(operation.substring(0, index));
		String operator=operation.substring(index, index+1); ///////////////////�� �κ� ���� �ȿ���
		int num2=Integer.parseInt(operation.substring(index+1));
		
		int result=0;
		switch(operator) {
		case "+": result=num1+num2; break;
		case "-": result=num1-num2; break;
		case "*": result=num1*num2; break;
		case "/": result=num1/num2; break;
			}
	
			System.out.println("[���]" + result);
		} catch (NumberFormatException e) {
			System.out.println("[����]�ǿ����ڿ� ���ڸ� �Է� �����մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("[����]0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("[����]���α׷��� ����ġ ���� ������ �߻� �Ͽ����ϴ�.");
		}
	}
}