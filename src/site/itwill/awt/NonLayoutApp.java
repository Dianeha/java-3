package site.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

public class NonLayoutApp extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NonLayoutApp(String title) {
		super(title);
		
		Button btn1=new Button("��ư-1");
		Button btn2=new Button("��ư-2");
		
		//Container.setLayout(LayoutManager layout) : �����̳��� ��ġ������
		// => �Ķ���Ϳ� null�� ������ �޼ҵ带 ȣ���� ��� ��ġ������ �̻��
		setLayout(null); //�������� ��ġ������ ����
		
		//��ġ�����ڸ� ������� ���� ��� ���۳�Ʈ�� ũ��� ��� ��ġ ���� �� �����̳ʿ� ����
		btn1.setBounds(80, 100, 50, 50);
		btn2.setBounds(160, 100, 50, 50);
		
		add(btn1);
		add(btn2);
		
		setBounds(500, 100, 400, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NonLayoutApp("NonLayout");
	}
}
