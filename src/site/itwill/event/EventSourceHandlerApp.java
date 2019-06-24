package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//������Ŭ������ �ڵ鷯Ŭ������ ���� Ŭ������ �ۼ�
//=> ������Ŭ������ ���۳�Ʈ ���� ����
//=> �̺�Ʈ�� ���� ���� ��
public class EventSourceHandlerApp extends Frame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EventSourceHandlerApp(String title) {
		super(title);

		Button exit = new Button("���α׷� ����");
		setLayout(new FlowLayout());
		add(exit);
		
		exit.addActionListener(this);

		
		setBounds(500, 100, 300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventSourceHandlerApp("EventHandler");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
