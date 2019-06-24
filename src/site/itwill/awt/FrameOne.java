package site.itwill.awt;

import java.awt.Frame;

public class FrameOne {
	public static void main(String[] args) {
		//�� Frame(String title) : ���� �ο��� �������� �����ϴ� ������
		Frame f = new Frame(); // ���ο� ������ ����(�����̳ʷ� ���۳�ƮComponent�� ���� �� ����)
		
		//�� Frame.setTitle(String title) : �������� ������ �����ϴ� �޼ҵ�
		//f.setTitle("������");
		
		/*
		 * //�� Component.setSize(int width, int height) : ���۳�Ʈ �Ǵ� �����̳��� ���� ���̸� ũ�� ����
		 * �޼ҵ� // => ũ�� �Ǵ� ��ġ ���� : pixel(�ȼ�, �ϳ��� ���� ��µǴ� ��rgb: red, green, blue ���� �����)
		 * f.setSize(400, 300);
		 * 
		 * //�� Component.setLocation(int x, int y) : x�� y�� ��ġ�� ���۳�Ʈ �Ǵ� �����̳� ��ġ �����ϴ� �޼ҵ�
		 * f.setLocation(500, 100);
		 */
		
		//Component.setBounds(int x,int y, width, height) // ���۳�Ʈ(�����̳�)�� ũ��� ��ġ�� �����ϴ� �޼ҵ� => �ѹ���
		f.setBounds(500, 100, 400, 300);
		
		//�� Frame.setResizable(boolean b) : ������ ũ�� ���� ������ �����ϴ� �޼ҵ�
		// false: ũ�� ���� �Ұ��� / true : ũ�� ���� ����(�⺻)
		f.setResizable(true);
		
		
		//�� Component.setVisible(boolean b) : ���۳�Ʈ(or �����̳�)�� ���� ��� ���θ� �����ϴ� �޼ҵ�
		// => false �����ϸ� �����(�⺻)/ true ���
		f.setVisible(true);
			
	}
}
