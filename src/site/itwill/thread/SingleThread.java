package site.itwill.thread;

public class SingleThread {
	public void display() {
		/* 1��
		 * System.out.println("SingleThread Ŭ������ display() �޼ҵ� ����");
		 * System.out.println("SingleThread Ŭ������ display() �޼ҵ��� ��� ����");
		 * System.out.println("SingleThread Ŭ������ display() �޼ҵ� ����");
		 */

		/* 2��
		 * System.out.println("SingleThreadApp Ŭ������ main() �޼ҵ� >> [" +
		 * Thread.currentThread().getName() + "]�� ���� ��� ����");
		 */

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
			// Thread.sleep(long ms) : �����带 ���ϴ� �ð�(ms)��ŭ ������Ű�� �޼ҵ�
			// => InterruptedException ���� �߻� -
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
