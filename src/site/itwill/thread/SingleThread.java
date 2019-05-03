package site.itwill.thread;

public class SingleThread {
	public void display() {
		/* 1번
		 * System.out.println("SingleThread 클래스의 display() 메소드 시작");
		 * System.out.println("SingleThread 클래스의 display() 메소드의 명령 실행");
		 * System.out.println("SingleThread 클래스의 display() 메소드 종료");
		 */

		/* 2번
		 * System.out.println("SingleThreadApp 클래스의 main() 메소드 >> [" +
		 * Thread.currentThread().getName() + "]에 의해 명령 실행");
		 */

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
			// Thread.sleep(long ms) : 스레드를 원하는 시간(ms)만큼 중지시키는 메소드
			// => InterruptedException 예외 발생 -
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
