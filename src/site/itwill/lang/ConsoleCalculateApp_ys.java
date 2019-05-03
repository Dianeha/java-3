package site.itwill.lang;


import java.util.Scanner;

//키보드로 사칙 연산식을 입력받아 연산결과를 출력하는 프로그램
//ex) 연산식 입력 >> 20 + 10
//	  [결과] 30
// => 입력 연산식에 사용될 연산자는 사칙연산자만 가능
// => 입력 연산식을 잘못 입력한 경우 에러메세지 출력 후 프로그램 종료
// => 입력 연산식에 공백이 입력되어도 처리
public class ConsoleCalculateApp_ys {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		String formula;
		
		System.out.print("계산하고 싶은 식을 입력하세요. \n형식 : 숫자1 연산자(+,-,*,/ 중 택일) 숫자2 \nex) 3 + 4  \n>> ");
		formula = scanner.nextLine().trim();
				
		double z=0;
				for(int i=0;i<formula.length();i++) {
					if(formula.charAt(i)=='+')
						z=Double.parseDouble(formula.substring(0,i))+Double.parseDouble(formula.substring(i+1));
					else if(formula.charAt(i)=='-')
						z=Double.parseDouble(formula.substring(0,i))-Double.parseDouble(formula.substring(i+1));
					else if(formula.charAt(i)=='*')
						z=Double.parseDouble(formula.substring(0,i))*Double.parseDouble(formula.substring(i+1));
					else if(formula.charAt(i)=='/')
						z=Double.parseDouble(formula.substring(0,i))/Double.parseDouble(formula.substring(i+1));
					else if(i==formula.length())
						System.out.println("[에러] 연산자가 존재하지 않습니다.");
				}
				System.out.println("\n[결과]"+z);  
					scanner.close();
		
		
		//연산자 찾아서 연산자 위치index 찾아서 substring으로 앞 뒤  분리
	}
}
