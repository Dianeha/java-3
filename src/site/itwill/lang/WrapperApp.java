package site.itwill.lang;

public class WrapperApp {
	public static void main(String[] args) {
		/* 방법1
		 * 절차지향프로그래밍 
		 int num1=10; 
		 int num2=20; 
		 int tot=num1+num2;
		 System.out.println("합계 = "+tot);
		 */

		/* 방법2
		// OOP
		// Integer 클래스 : 정수상수를 저장할 목적의 클래스
		Integer num1 = new Integer(10);
		Integer num2 = new Integer("20");

		// Integer.intValue() : Integer 인스턴스에 저장된 정수상수를 반환하는 메소드
		// Integer.valueOf() : 전달받은 정수상수가 저장된 Integer 인스턴스를 생성해 반환하는 메소드
		Integer tot = Integer.valueOf(num1.intValue() + num2.intValue());
		System.out.println("합계 = "+tot.intValue());
		*/
		
		// 방법3
		//오토박싱: 상수가 자동으로 인스턴스로 변환
		Integer num1 = 10; //Integer num1 = new Integer(10); 와 동일
		Integer num2 = 20;
		
		//오토언박싱 : 인스턴스가 자동으로 상수로 변환
		Integer tot = num1+num2; //Integer tot = Integer.valueOf(num1.intValue() + num2.intValue());와 동일
		System.out.println("합계 = "+tot);
		System.out.println("==================================");
		
		System.out.println("10진수: 50 = 8진수 : "+Integer.toOctalString(50));
		System.out.println("10진수: 50 = 16진수 : "+Integer.toHexString(50));
		System.out.println("10진수: 50 = 2진수 : "+Integer.toBinaryString(50));
		System.out.println("10진수: -50 = 8진수 : "+Integer.toBinaryString(-50));
		System.out.println("==================================");
		
		String su1="100";
		String su2="200";
		//System.out.println("합계 = "+(su1+su2)); // 결과는 300이 아니라 100200 (문자열 +하면 결합됨) 
		//Integer.parseInt(String s) : 전달받은 문자열을 정수로 변환하여 반환하는 메소드 ★
		//Integer.parseInt(String s)사용할 때 NumberFormatException 예외 처리 필요
		System.out.println("합계 = "+(Integer.parseInt(su1)+Integer.parseInt(su2)));
		System.out.println("==================================");
		
		
		
		
		
		
	}
}
