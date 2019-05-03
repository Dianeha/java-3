package site.itwill.lang;

import java.util.Scanner;

//주민번호를 입력받아 생년월일, 성별을 구분하여 출력하는 프로그램 구성
// => 주민번호는 14자리 문자열로 입력받으며 7번 위치에는 - 문자가 존재(유효성 검사)
// => 비정상적인 주민번호를 입력한 경우 에러메세지 출력 후 재입력
//ex) 주민번호입력[ex.000101-323456] >> 901225-1234567
//	  [결과]생년월일 = 1990년 12월 25일, 성별 = 남자
public class PersonNumberApp {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String number;
		while (true) {
			System.out.print("주민번호입력[ex.000101-323456] >> ");
			number = scanner.nextLine().trim();
			if(number.length()==14 && number.charAt(6)=='-') break; //charAt 대신 number.indexOf("-")==6 을 사용해도 된다.
			System.out.println("[에러]비정상적인 주민번호를 입력하였습니다.\n\n");
		}
		
		String separation=number.substring(7, 8);
		
		String birthday="";
		if (separation.equals("1") || separation.equals("2")) {
			birthday+="19";
		} else if (separation.equals("3") || separation.equals("4")) {
			birthday+="20";			
		}
		birthday+=number.substring(0,2)+"년"+number.substring(2,4)+"월"; birthday+=number.substring(4,6)+"일";
		/*
		 * birthday+=number.substring(2,4)+"월"; birthday+=number.substring(4,6)+"일";
		 */
		
		String gender="";
		if (separation.equals("1") || separation.equals("3")) {
			gender="남자";
		} else if (separation.equals("2") || separation.equals("4")) {
			gender="여자";			
		}
		
		System.out.println("\n[결과]생년월일 = "+birthday+", 성별 = "+gender);
		
		scanner.close();
	}

}
