package site.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//�����ӿ� ��¥�� �ð��� ����ϴ� ���α׷�
public class DigitalClockApp extends JFrame {
	private static final long serialVersionUID = 1L;

	// ��� ���۳�Ʈ�� �����ϴ� ������ ��������
	private boolean isRun;
	private JLabel clockLabel;// ��� ���۳�Ʈ
	private JButton startBtn, stopBtn;

	public DigitalClockApp(String title) {
		super(title);

		isRun = true;

		clockLabel = new JLabel("", JLabel.CENTER);
		clockLabel.setFont(new Font("����", Font.BOLD, 30));
		clockLabel.setForeground(Color.DARK_GRAY);

		startBtn = new JButton("�ٽý���");
		stopBtn = new JButton("�Ͻ�����");
		JPanel panel = new JPanel();
		panel.add(startBtn);
		panel.add(stopBtn);
		panel.setFont(new Font("����", Font.BOLD, 20));
		startBtn.setEnabled(false);

		getContentPane().setBackground(Color.WHITE);
		getContentPane().add(clockLabel, BorderLayout.CENTER);
		getContentPane().add(panel, BorderLayout.SOUTH);

		// ������ �ν��Ͻ��� ���ο� ������ �����Ͽ� run() �޼ҵ��� ���� ����
		new ClockThread().start();

		//��ư �̺�Ʈ�� ���� �̺�Ʈ �ڵ鷯 ���
		startBtn.addActionListener(new ButtonEventHandler());
		stopBtn.addActionListener(new ButtonEventHandler());
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(350, 100, 600, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DigitalClockApp("DigitalClock");
	}

	// �ý��� ��¥�� �ð������� 1�ʸ��� ��� �����޾� ��� ���۳�Ʈ�� �����ϴ� ������ Ŭ����
	public class ClockThread extends Thread {
		@Override
		public void run() {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
			while (true) {
				if (isRun) {// ��������� ��� ���� ����
//				Date now=new Date();
//				String clock=sdf.format(now);
//				clockLabel.setText(clock);
					clockLabel.setText(sdf.format(new Date())); // ���ٷ�
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public class ButtonEventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object eventButton = e.getSource();

			if (eventButton == startBtn) {
				isRun = true;
				startBtn.setEnabled(false);
				stopBtn.setEnabled(true);
			} else if (eventButton == stopBtn) {
				isRun = false;
				startBtn.setEnabled(true);
				stopBtn.setEnabled(false);
			}

		}

	}
}