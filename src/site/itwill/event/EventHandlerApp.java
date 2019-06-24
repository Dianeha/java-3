package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// �̺�Ʈ ���α׷� �ۼ��ϴ� �溡
// 1. ���۳�Ʈ(�����̳�)�� �̿��� ������ ���� : ������ Ŭ����
// => ���۳�Ʈ(�����̳�)������ �پ��� �̺�Ʈ �߻� -�̺�Ʈ �ҽ�
// 2. �̺�Ʈ �ҽ����� �̺�Ʈ�� �߻��� ��� �̺�Ʈ ó���� �������� �ϴ� Ŭ����- �̺�Ʈ �ڵ鷯
// => �߻��� �̺�Ʈ ó���� �������� �ϴ� ������ �������̽��� ��ӹ޾� �ۼ�
// => XXXEvent Ŭ������ ������ �̺�Ʈ�� ó���ϱ� ���� XXXListener �������̽��� ���� 
//    ex) ActionEvent Ŭ������ �̺�Ʈ �߻� > ActionListener �������̽� ��ӹ޾� �ۼ�
// => ������ �������̽��� �߻�޼ҵ带 �������̵� ������ �̺�Ʈ ó�� ���
// 3. �̺�Ʈ �ҽ����� �̺�Ʈ�� �߻��� ��� �̺�Ʈ �ڵ鷯�� �޼ҵ� ȣ��
// =>  �̺�Ʈ �ڵ鷯�� ó�� �޼ҵ� �ڵ� ȣ��Ǿ� �̺�Ʈ ó��
public class EventHandlerApp extends Frame {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public EventHandlerApp(String title) {
		super(title);
		
		//��ư�� ���� ��� ActionEvent �߻�
		Button exit=new Button("���α׷� ����");
		setLayout(new FlowLayout());
		add(exit);
		
		//Button.addActionListener(ActionListener listener) : 
		//ActionListener �������̽��� ��ӹ��� �ڽ�Ŭ������ �ν��Ͻ��� �����Ͽ� ��ư����
		//�߻��� �̺�Ʈ�� ó���ϵ��� �̺�Ʈ �ڵ鷯 ���
		// => �̺�Ʈ�� �߻��� ��� �ڵ����� ��ϵ� �̺�Ʈ �ڵ鷯�� �޼ҵ鰡 ȣ��
		exit.addActionListener(new ExitButtonEventHandler());
		
		setBounds(500, 100, 300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventHandlerApp("EventHandler");
	}

}

//ActionEvent�� ó���ϱ� ���� �̺�Ʈ �ڵ鷯 Ŭ����
// => ������ Ŭ������ ���۳�Ʈ ���� �Ұ���
class ExitButtonEventHandler implements ActionListener { //�������̽� ��� - �߻�޼ҵ� �������̵�
	
	//Listener �������̽��� �߻�޼ҵ带 �������̵� ���� - �̺�Ʈ ó�� ����
	// => �ش� �̺�Ʈ�� �߻��� ��� �ڵ� ȣ��
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.exit(int status); : ���α׷��� �����ϴ� ��� �����带 ����
		// => ���α׷� ���� �޼ҵ�
		System.exit(0);
	}
}