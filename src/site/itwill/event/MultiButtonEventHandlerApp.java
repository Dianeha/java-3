package site.itwill.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//��ư�� ���� ��� �ش� ��ư�� �������� ĵ������ ������ �����ϴ� ���α׷�
public class MultiButtonEventHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;

	// �̺�Ʈ �ڵ鷯 �޼ҵ忡�� ���۳�Ʈ�� �����ϱ� ���� �ʵ� ����
	private Canvas canvas;
	private Button red, green, blue, white;

	public MultiButtonEventHandlerApp(String title) {
		super(title);

		red = new Button("������");
		green = new Button("�ʷϻ�");
		blue = new Button("�Ķ���");
		white = new Button("�Ͼ��");

		Panel panel = new Panel();

		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(white);

		canvas = new Canvas();

		add(panel, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);

		panel.setBackground(Color.GRAY);
		panel.setFont(new Font("����", Font.BOLD, 20));

		white.setEnabled(false);

		// ���۳�Ʈ�� �̺�Ʈ �ڵ鷯 ���
		red.addActionListener(new RedButtonHandler());
		green.addActionListener(new GreenButtonHandler());
		blue.addActionListener(new BlueButtonHandler());
		white.addActionListener(new WhiteButtonHandler());

		// �͸�Ŭ���� ����ٿ��ֱ��ϸ� â���� ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setBounds(500, 100, 400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MultiButtonEventHandlerApp("MultiEventHandler");
	}

	//��ư �ʱ�ȭ��Ű�� Ȱ��ȭ �޼ҵ�
	public void initButton() {
		red.setEnabled(true);
		green.setEnabled(true);
		blue.setEnabled(true);
		white.setEnabled(true);
	}
	
	// ��ư�� 4�� > �� �ٸ� ��� > �̺�Ʈ �ڵ鷯 4�� > �̳�Ŭ������ �ۼ�
	public class RedButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initButton();//Ȱ��ȭ �޼ҵ� ȣ��
			canvas.setBackground(Color.red);
			red.setEnabled(false);
		}

	}

	public class GreenButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initButton();
			canvas.setBackground(Color.green);
			green.setEnabled(false);
		}

	}
	
	public class BlueButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initButton();
			canvas.setBackground(Color.blue);
			blue.setEnabled(false);
		}

	}
	
	public class WhiteButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initButton();
			canvas.setBackground(Color.white);
			white.setEnabled(false);
		}

	}
	
	
	
}
