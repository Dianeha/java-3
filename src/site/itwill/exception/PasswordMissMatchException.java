package site.itwill.exception;

//비밀번호가 맞지 않을 경우 발생하는 예외를 처리하기 위한 클래스
public class PasswordMissMatchException extends Exception {
	private static final long serialVersionUID = 1L;

	public PasswordMissMatchException() {
		// super(); 숨어있다
	}
	
	//예외메세지를 전달받아 제공하기 위한 생성자
	//=> Exception 클래스의 필드에 저장되도록 super 키워드로 생성자를 직접 호출한다
	public PasswordMissMatchException(String message) {
		super(message);
	}
	
}
