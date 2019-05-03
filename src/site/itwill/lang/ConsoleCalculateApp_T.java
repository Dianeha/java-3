package site.itwill.lang;

import java.util.Scanner;

public class ConsoleCalculateApp_T {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연산식 입력 >> ");
		String operation=scanner.nextLine().replace(" ", "");
		
		scanner.close();
		
		//연산식에서 연산자를 검색하여 연산자의 위치(index) 저장
		//검색연산자들을 저장한 배열
		String[] operatorArray= {"+","-","*","/"};
		int index=-1; //연산자의 위치값을 저장하기 위한 변수
		for(String temp:operatorArray) {
			//연산식에서 연산자를 검색하여 위치값을 반환받아 저장 
			// => 연산자가 연산식에 존재하지 않을 경우 -1을 반환받아 저장
			index=operation.indexOf(temp);
			//연산자가 검색되어 저장된 경우 반복문 종료
			if(index!=-1) break;
		}
		
		//연산식에 연산자가 없거나 피연산자가 두개가 아닌 경우 
		if(index<=0 || index>=operation.length()-1) {
			System.out.println("[에러] 연산식을 잘못 입력하였습니다.");
			System.exit(0); //프로그램 종료
		}
		
		try {
		//연산식에서 피연산자와 연산자를 분리하여 저장
		int num1=Integer.parseInt(operation.substring(0, index));
		String operator=operation.substring(index, index+1); ///////////////////이 부분 감이 안왔음
		int num2=Integer.parseInt(operation.substring(index+1));
		
		int result=0;
		switch(operator) {
		case "+": result=num1+num2; break;
		case "-": result=num1-num2; break;
		case "*": result=num1*num2; break;
		case "/": result=num1/num2; break;
			}
	
			System.out.println("[결과]" + result);
		} catch (NumberFormatException e) {
			System.out.println("[에러]피연산자에 숫자만 입력 가능합니다.");
		} catch (ArithmeticException e) {
			System.out.println("[에러]0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("[에러]프로그램에 예기치 못한 오류가 발생 하였습니다.");
		}
	}
}