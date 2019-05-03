package site.itwill.exception;

public class TryCatchApp {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };

		// 배열 요소의 첨자가 범위를 벗어날 경우 'ArrayIndexOutOfBoundsException'
		// => 실행시 예외발생되며 JWM에 의해 자동 예외처리
		// => 프로그램 사용자 또는 개발자에게를 위해 예외처리하는 것을 권장
		// try 영역에 작성된 명령에서 예외가 발생될 경우를 감시
		// => 예외가 발생된 경우 예외 관련 클래스로 인스턴스 생성
		// 예외가 발생된 경우 예외 발생 명령 하단에 작성된 명령은 실행되지 않음 -catch 영역으로 스레드thread(프로그램 흐름)이 이동
		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.println("array[" + i + "] = " + array[i]);
			}
			
			//상단 명령에서 예외가 발생한 경우 실행되지 않음
			System.out.println("# 정상적인 실행 결과 #");
		} catch (ArrayIndexOutOfBoundsException e) {
			// try 영역에서 발생된 예외 인스턴스를 전달받아 저장 후 예외처리
			// => 프로그램 사용자 또는 개발자에게 메세지를 제공하거나 개발자에게 에러로그(에러기록) 제공
			System.out.println("[에러]프로그램 실행에 예기치 못한 오류가 발생되었습니다.");
			
			//Exception.getMessage() : 예외 인스턴스의 예외메세지를 반환하는 메소드
			//System.out.println("[에러로그] 에러메세지 = "+e.getMessage());
			
			//Exception.printStackTrace() : 예외 발생 경로를 추적하여 출력
			//e.printStackTrace();
			
			System.out.println("# 비정상적인 실행 결과 #");
		} finally {
			//예외와 상관없이 무조건 실행될 명령 작성하는 영역 - 자원 제거
			System.out.println("# 무조건 실행될 명령 #");
		}

	}
}
