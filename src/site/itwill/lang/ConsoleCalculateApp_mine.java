package site.itwill.lang;

import java.util.Scanner;

public class ConsoleCalculateApp_mine {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
					
			String formula;
			System.out.print("����ϰ� ���� ���� �Է��ϼ���. \n���� : ����1 ������(+,-,*,/ �� ����) ����2 \nex) 3 + 4  \n>> ");
			formula = scanner.nextLine().trim();
			
			if (formula.indexOf('+') == -1 && formula.indexOf('-') == -1 && formula.indexOf('*') == -1
					&& formula.indexOf('/') == -1) 
				System.out.println("[����] �����ڰ� �������� �ʽ��ϴ�.");
			
					
					
		if (formula.charAt(formula.indexOf('+')) == '+') {
			String num1 = formula.substring(0, formula.indexOf('+'));
			String num2 = formula.substring((formula.indexOf('+') + 1));
			System.out.println("[���]" + (Double.parseDouble(num1) + Double.parseDouble(num2)));
		} else if (formula.charAt(formula.indexOf('-')) == '-') {
			String num1 = formula.substring(0, formula.indexOf('-'));
			String num2 = formula.substring((formula.indexOf('-') + 1));
			System.out.println("[���]" + (Double.parseDouble(num1) - Double.parseDouble(num2)));
		} else if (formula.charAt(formula.indexOf('*')) == '*') {
			String num1 = formula.substring(0, formula.indexOf('*'));
			String num2 = formula.substring((formula.indexOf('*') + 1));
			System.out.println("[���]" + (Double.parseDouble(num1) * Double.parseDouble(num2)));
		} else if (formula.charAt(formula.indexOf('/')) == '/') {
			String num1 = formula.substring(0, formula.indexOf('/'));
			String num2 = formula.substring((formula.indexOf('/') + 1));
			System.out.println("[���]" + (Double.parseDouble(num1) / Double.parseDouble(num2)));
		}
		scanner.close();
					
			
			//������ ã�Ƽ� ������ ��ġindex ã�Ƽ� substring���� �� ��  �и�
		}
	}

//}
