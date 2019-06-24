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

//버튼을 누를 경우 해당 버튼의 색상으로 캔버스의 배경색을 변경하는 프로그램
public class MultiButtonEventHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;

	// 이벤트 핸들러 메소드에서 컴퍼넌트를 변경하기 위해 필드 선언
	private Canvas canvas;
	private Button red, green, blue, white;

	public MultiButtonEventHandlerApp(String title) {
		super(title);

		red = new Button("빨간색");
		green = new Button("초록색");
		blue = new Button("파란색");
		white = new Button("하얀색");

		Panel panel = new Panel();

		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(white);

		canvas = new Canvas();

		add(panel, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);

		panel.setBackground(Color.GRAY);
		panel.setFont(new Font("굴림", Font.BOLD, 20));

		white.setEnabled(false);

		// 컴퍼넌트에 이벤트 핸들러 등록
		red.addActionListener(new RedButtonHandler());
		green.addActionListener(new GreenButtonHandler());
		blue.addActionListener(new BlueButtonHandler());
		white.addActionListener(new WhiteButtonHandler());

		// 익명클래스 복사붙여넣기하면 창끄기 가능
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

	//버튼 초기화시키는 활성화 메소드
	public void initButton() {
		red.setEnabled(true);
		green.setEnabled(true);
		blue.setEnabled(true);
		white.setEnabled(true);
	}
	
	// 버튼이 4개 > 다 다른 기능 > 이벤트 핸들러 4개 > 이너클래스로 작성
	public class RedButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initButton();//활성화 메소드 호출
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
