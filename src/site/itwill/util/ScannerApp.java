package site.itwill.util;

import java.util.InputMismatchException;
import java.util.Scanner;

//Scanner 클래스 : 입력장치(키보드, 파일)로부터 값을 입력받아 반환하는 기능을 제공하는 클래스
//=> 입력 메소드에 대한 오류발생 가능 => 추후 입력클래스로 대체
public class ScannerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("이름 입력 >> ");
		String name = scanner.nextLine();

		int age;
		while (true) {
			try {
				System.out.print("나이 입력 >> ");
				//nextInt() 메소드는 입력값이 정수가 아닌 경우 InputMismatchException 예외 발생
				//=> 예외처리를 할 경우 비정상적인 입력값이 키보드 버퍼에 계속 남아 무한루프 발생
				age = scanner.nextInt();//nextInt() 메소드는 엔터를 제외한 숫자만 읽어 반환 >> 키보드 버퍼에 Enter 존재
				if (age >= 1 && age <= 100)	break;
				System.out.println("[에러] 나이는 0부터 100까지만 입력가능합니다.");
			} catch (InputMismatchException e) {
				scanner.nextLine(); //키보드 버퍼에 남아있는 비정상적 입력값 제거
				System.out.println("[에러] 나이에 숫자가 아닌 문자가 입력되었습니다.");
			}
		}
		
		System.out.print("이메일 입력 >> ");
		//nextLine() 메소드는 키보드 버퍼에 남아있는 Enter를 읽어 반환 >> 입력 오류
		// => nextLine() 메소드를 미리 한 번 호출하여 Enter 읽어 제거 
		scanner.nextLine();
		String email = scanner.nextLine();
		
		System.out.println("=============================");
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("이메일 = "+email
				);
		System.out.println("=============================");
		scanner.close();
	}
}
