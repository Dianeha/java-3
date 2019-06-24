package site.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class PanelApp extends Frame {
	
	private static final long serialVersionUID = 1L;

	public PanelApp(String title) {
		super(title);

		// ������ ���ʿ� ������ ���۳�Ʈ(�����̳�) ����
		Button red = new Button("������");
		Button green = new Button("�ʷϻ�");
		Button blue = new Button("�Ķ���");
		
		//���۳�Ʈ�� �����ϱ� ���� �����̳� >> FlowLayout�� �⺻ ��ġ������
		Panel panel=new Panel();
		
		//�гο� ���۳�Ʈ ����
		panel.add(red);
		panel.add(green);
		panel.add(blue);

		// ������ �߾ӿ� ������ ���۳�Ʈ ����
		TextArea area = new TextArea();

		// ������ ���ʿ� ������ ���۳�Ʈ ����
		TextField field = new TextField();
		
		//�����ӿ� ���۳�Ʈ(�����̳�) ��Ź
		add(panel, BorderLayout.NORTH);
		add(area,BorderLayout.CENTER);
		add(field, BorderLayout.SOUTH);

		//Component.setFont(Font f) : Font �ν��Ͻ��� ���޹޾� ���� ���� �Ӽ��� ����
		// => Font Ŭ���� : �۲�, ��Ÿ��, ũ�� ������ ������ ������ Ŭ����
		// => �����̳� �ν��Ͻ����� �޼ҵ带 ȣ���� ��� �����̳ʿ� ������ ��� ���۳�Ʈ�� ���� 
		panel.setFont(new Font("����", Font.PLAIN, 16));
		area.setFont(new Font("�ü�ü", Font.BOLD, 16));
		field.setFont(new Font("����", Font.BOLD+Font.ITALIC, 16));
				
		//Component.setForeground(Color c) : Color �ν��Ͻ��� ���޹޾� ���۳�Ʈ�� �����(��� �� ������ ��)�� �����ϴ� �޼ҵ�
		// => Color Ŭ���� : ��������(Red:0~255, Green:0~255, blue:0~255)�� ������ ������ Ŭ����
		red.setForeground(new Color(255,0,0));
		green.setForeground(new Color(0,225,0));
		blue.setForeground(new Color(0,0,225));
		
		//Component.setBackground(Color c) :Color �ν��Ͻ��� ���޹޾� ���۳�Ʈ�� ������ �����ϴ� �޼ҵ�
		//Color Ŭ�������� ���� ���Ǵ� ������� ����ʵ�� ����Ǿ� ���
		panel.setBackground(Color.gray);
		
		//Component.setEnabled(boolean b): ���۳�Ʈ�� Ȱ�� �Ǵ� ��Ȱ���� ����
		// => false: ��Ȱ��, true: Ȱ��
		red.setEnabled(false);
		
		//TextComponent.setEditable(boolean b) : �ؽ�Ʈ ���۳�Ʈ�� ���ڿ� ���� Ȱ�� �Ǵ� ��Ȱ���� �����ϴ� �޼ҵ�
		// => false: ���� (����)�Ұ���, true: ���� ����
		area.setEditable(false);
		
		//Component.setFocusable(boolean b): ���۳�Ʈ�� ��Ŀ��(����) ��ġ'
		// => false ��Ŀ�� ��ġ �Ұ���, true ��Ŀ�� ��ġ ����(�⺻)
		area.setFocusable(false);
		
		setBounds(500, 100, 300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PanelApp("Panel");
	}

}
