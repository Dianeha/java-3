package site.itwill.util;

import java.util.Random;

public class RandomApp {
	public static void main(String[] args) {
		//Random(int seed) : 파라메터에 시드값을 전달하여 인스턴스 생성하는 생성자
		// => 시드값 : 프로그램 실행시 다른 난수가 발생되도록 설정하는 long 타입 정수값
		//System.currentTimeMillis() : 현재 시스템의 Timestamp 값(1970년 1월 1일을 기준으로 밀리초당 1씩 증가되는 long 타입 정수값)을 반환하는 메소드
		//Random random = new Random(System.currentTimeMillis());

		//Random 클래스의 기본생성자는 시드값을 자동으로 설정 >> System.currentTimeMillis()
		Random random=new Random();
		
		for (int i = 1; i <= 5; i++) {
			//random.nextInt(int bound): 0 ~bound ~1 범위의 정수난수를 발생하는 메소드
			System.out.println(i+"번째 난수 >> "+random.nextInt(100));
		}
	}
}
