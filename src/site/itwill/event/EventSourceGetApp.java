package site.itwill.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//ActionEvent�� �߻��ϴ� ���
//1.Button ���۳�Ʈ�� ���� ���
//2.MenuItem ���۳�Ʈ�� ������ ���
//3.TextField ���۳�Ʈ���� ���͸� �Է��� ���
public class EventSourceGetApp extends Frame implements ActionListener { // implements ActionListener �������
	private static final long serialVersionUID = 1L;

	private Button red, green, blue, black;
	private TextArea area;
	private TextField field;
	private MenuItem init, exit;

	public EventSourceGetApp(String title) {
		super(title);

		MenuBar bar = new MenuBar();
		Menu file = new Menu("����");
		init = new MenuItem("ȭ�� �ʱ�ȭ", new MenuShortcut(KeyEvent.VK_I));
		exit = new MenuItem("���α׷� ����", new MenuShortcut(KeyEvent.VK_E));
		file.add(init);
		file.addSeparator();
		file.add(exit);
		bar.add(file);
		setMenuBar(bar);

		red = new Button("������");
		green = new Button("�ʷϻ�");
		blue = new Button("�Ķ���");
		black = new Button("������");

		Panel panel = new Panel();
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(black);

		area = new TextArea();
		field = new TextField();

		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		add(field, BorderLayout.SOUTH);

		black.setEnabled(false);
		//area.setFocusable(false);
		panel.setBackground(Color.gray);
		red.setForeground(Color.red);
		green.setForeground(Color.green);
		blue.setForeground(Color.blue);
		black.setForeground(Color.black);
		panel.setFont(new Font("����", Font.BOLD, 14));
		area.setFont(new Font("����", Font.BOLD, 16));
		field.setFont(new Font("����", Font.BOLD, 16));

		// ���⼭ �߻��Ǵ� �̺�Ʈ�� �� �����̺�Ʈ�� ó���� ���̰� �װ��� �ڱ��ڽ�
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		black.addActionListener(this);
		init.addActionListener(this);
		exit.addActionListener(this);
		field.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setBounds(500, 100, 300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventSourceGetApp("EventSourceGet");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ActionEvent.getSource(); �̺�Ʈ ���۳�Ʈ�� ��ȯ�ϴ� �޼ҵ�
		// => �̺�Ʈ ���۳�Ʈ�� Object Ŭ������ Ÿ������ ��ȯ
		Object eventSource = e.getSource();

		// �̺�Ʈ ���۳�Ʈ�� ���۳�Ʈ�� �����Ͽ� ó��
		if (eventSource instanceof MenuItem) {
			if (eventSource == init) {
				// TextComponent.setText(String text) : ���ڿ��� ���޹޾� �ؽ�Ʈ ���۳�Ʈ�� ���ڿ��� �����ϴ� �޼ҵ�
				area.setText(" ");
			} else if (eventSource == exit) {
				System.exit(0);
			}
		} else if (eventSource instanceof Button) {
			red.setEnabled(true);
			green.setEnabled(true);
			blue.setEnabled(true);
			black.setEnabled(true);

			((Button) eventSource).setEnabled(false);// ����ȯ
			if (eventSource == red) {
				area.setForeground(Color.red);
			} else if (eventSource == green) {
				area.setForeground(Color.green);
			} else if (eventSource == blue) {
				area.setForeground(Color.blue);
			} else if (eventSource == black) {
				area.setForeground(Color.black);
			}

		} else if (eventSource instanceof TextField) {
			//TextComponent.getText() : �ؽ�Ʈ ���۳�Ʈ�� ���ڿ��� ���� ��ȯ�ϴ� �޼ҵ�
			String text=field.getText();
			
			if (!text.equals("")) {//�Էµ� ���ڿ��� ���� ���
				//TextComponent.append(String text): ���ڿ��� ���޹޾� �ؽ�Ʈ ���۳�Ʈ�� ���ڿ��� �߰��ϴ� �޼ҵ�
				area.append(text+"\n");
				field.setText("");
			}
		}
	}
}
