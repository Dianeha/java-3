package site.itwill.lang;

import java.util.Scanner;

public class ConsoleCalculateApp_mine {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
					
			String formula;
			System.out.print("계산하고 싶은 식을 입력하세요. \n형식 : 숫자1 연산자(+,-,*,/ 중 택일) 숫자2 \nex) 3 + 4  \n>> ");
			formula = scanner.nextLine().trim();
			
			if (formula.indexOf('+') == -1 && formula.indexOf('-') == -1 && formula.indexOf('*') == -1
					&& formula.indexOf('/') == -1) 
				System.out.println("[에러] 연산자가 존재하지 않습니다.");
			
					
					
		if (formula.charAt(formula.indexOf('+')) == '+') {
			String num1 = formula.substring(0, formula.indexOf('+'));
			String num2 = formula.substring((formula.indexOf('+') + 1));
			System.out.println("[결과]" + (Double.parseDouble(num1) + Double.parseDouble(num2)));
		} else if (formula.charAt(formula.indexOf('-')) == '-') {
			String num1 = formula.substring(0, formula.indexOf('-'));
			String num2 = formula.substring((formula.indexOf('-') + 1));
			System.out.println("[결과]" + (Double.parseDouble(num1) - Double.parseDouble(num2)));
		} else if (formula.charAt(formula.indexOf('*')) == '*') {
			String num1 = formula.substring(0, formula.indexOf('*'));
			String num2 = formula.substring((formula.indexOf('*') + 1));
			System.out.println("[결과]" + (Double.parseDouble(num1) * Double.parseDouble(num2)));
		} else if (formula.charAt(formula.indexOf('/')) == '/') {
			String num1 = formula.substring(0, formula.indexOf('/'));
			String num2 = formula.substring((formula.indexOf('/') + 1));
			System.out.println("[결과]" + (Double.parseDouble(num1) / Double.parseDouble(num2)));
		}
		scanner.close();
					
			
			//연산자 찾아서 연산자 위치index 찾아서 substring으로 앞 뒤  분리
		}
	}

//}
