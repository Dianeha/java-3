package site.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//단순 사칙 연산식을 입력받아 연산 결과를 출력하는 프로그램 : 계산기
public class CalculatorFrameApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	// 연산식을 입력하기 위한 필드(컴퍼넌트)
	private JButton b_0, b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9, b_equals, b_plus, b_minus, b_multi, b_div, b_C;

	// 연산 결과를 출력하기 위한 필드(컴퍼넌트)
	private JLabel label;

	// 연산식을 저장하기 위한 필드
	private String operation = "";

	public CalculatorFrameApp(String title) {
		super(title);
		initButtons();
		init();
	}

	private void init() {
		label = new JLabel("0");
		label.setFont(new Font("DIALOG", Font.BOLD, 30));
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);

		JPanel p = new JPanel(new GridLayout(4, 4, 5, 5));
		p.setBackground(Color.BLACK);

		p.add(b_multi);
		p.add(b_div);
		p.add(b_plus);
		p.add(b_minus);
		p.add(b_1);
		p.add(b_2);
		p.add(b_3);
		p.add(b_4);
		p.add(b_5);
		p.add(b_6);
		p.add(b_7);
		p.add(b_8);
		p.add(b_9);
		p.add(b_0);
		p.add(b_equals);
		p.add(b_C);

		Container container = getContentPane();
		container.setLayout(new BorderLayout(10, 10));
		container.setBackground(Color.BLACK);
		container.add(label, BorderLayout.NORTH);
		container.add(p, BorderLayout.CENTER);

		b_0.addActionListener(this);
		b_1.addActionListener(this);
		b_2.addActionListener(this);
		b_3.addActionListener(this);
		b_4.addActionListener(this);
		b_5.addActionListener(this);
		b_6.addActionListener(this);
		b_7.addActionListener(this);
		b_8.addActionListener(this);
		b_9.addActionListener(this);
		b_div.addActionListener(this);
		b_plus.addActionListener(this);
		b_minus.addActionListener(this);
		b_multi.addActionListener(this);
		b_C.addActionListener(this);
		b_equals.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setResizable(false);
		setBounds(500, 100, 400, 400);
		setVisible(true);
	}

	private void initButtons() {
		b_0 = new JButton("0");
		b_1 = new JButton("1");
		b_2 = new JButton("2");
		b_3 = new JButton("3");
		b_4 = new JButton("4");
		b_5 = new JButton("5");
		b_6 = new JButton("6");
		b_7 = new JButton("7");
		b_8 = new JButton("8");
		b_9 = new JButton("9");
		b_equals = new JButton("=");
		b_plus = new JButton("+");
		b_minus = new JButton("-");
		b_multi = new JButton("*");
		b_div = new JButton("/");
		b_C = new JButton("C");

		b_0.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_1.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_2.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_3.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_4.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_5.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_6.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_7.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_8.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_9.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_div.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_plus.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_minus.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_multi.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_C.setFont(new Font("DIALOG", Font.PLAIN, 20));
		b_equals.setFont(new Font("DIALOG", Font.PLAIN, 20));

		b_0.setBackground(Color.WHITE);
		b_1.setBackground(Color.WHITE);
		b_2.setBackground(Color.WHITE);
		b_3.setBackground(Color.WHITE);
		b_4.setBackground(Color.WHITE);
		b_5.setBackground(Color.WHITE);
		b_6.setBackground(Color.WHITE);
		b_7.setBackground(Color.WHITE);
		b_8.setBackground(Color.WHITE);
		b_9.setBackground(Color.WHITE);
		b_div.setBackground(Color.YELLOW);
		b_plus.setBackground(Color.YELLOW);
		b_minus.setBackground(Color.YELLOW);
		b_multi.setBackground(Color.YELLOW);
		b_C.setBackground(Color.GREEN);
		b_equals.setBackground(Color.CYAN);
	}

	public static void main(String[] args) {
		new CalculatorFrameApp("계산기");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object button = e.getSource();

		if (button == b_equals) {// Equals 버튼을 누른 경우
			// 연산식에서 연산자를 컴색하여 연산자의 위치를 저장
			String[] operatorArray = { "*", "/", "+", "-" };
			int index = -1;// 연산자의 위치값을 저장하기 위한 변수
			for (String temp : operatorArray) {
				// 연산식에서 연산자를 검색하여 위치값을 반환받아 저장
				// => 연산자가 연산식에 존재하지 않을 경우 -1를 반환받아 저장
				index = operation.lastIndexOf(temp);
				// 연산자가 검색되어 저장된 경우 반복문 종료
				if (index != -1)
					break;
			}

			if (index == -1) {// 연산자가 존재하지 않는 경우
				return;
			}

			try {
				// 연산자 위치정보를 이용해 피연산자와 연산자 분리 저장
				int num1 = Integer.parseInt(operation.substring(0, index)); // parseInt 숫자로 바꿔주는 메소드
				String operator = operation.substring(index, index + 1);
				int num2 = Integer.parseInt(operation.substring(index + 1));

				int result = 0;
				switch (operator) {
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				}

				// 연산결과를 출력 컴퍼넌트의 문자열로 출력
				// setText는 문자열만받을 수 있어서 result만 쓰면 에러;
				// label.setText(result+"");
				label.setText(String.valueOf(result));
				operation = "";
			} catch (ArithmeticException e2) {
				operation = "";
				label.setText("0으로 나눌 수 없습니다.");
			} catch (NumberFormatException e2) {
				//JOptionPane.showMessageDialog(Component parent, String message, String title, int messageType)
				// => 메세지 다이얼로그를 출력하는 메소드
				
				
				JOptionPane.showMessageDialog(this, "입력 연산식이 잘못 되었습니다.", "에러", JOptionPane.ERROR_MESSAGE);
				operation = "";
				label.setText("0");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "프로그램 실행에 문제가 발생 하였습니다..", "에러", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		} else if (button == b_C) {// Clear 버튼을 누른 경우 >> 연산식 저장 필드에 대한 초기화 및 출력 컴퍼넌트 초기화
			operation = "";
			// Jlabel.setText() : 문자열을 전달받아 라벨 컴퍼넌트의 문자열을 변경하는 메소드
			label.setText("0");
		} else { // 연산식 작성 관련 버튼을 누르는 경우
			// 연산식 저장 필드에 버튼의 문자열을 추가
			// JButton.getText() : 버튼의 라벨명을 반환하는 메소드
			operation += ((JButton) button).getText();

			// 연산식 필드에 저장된 문자열로 출력 컴퍼넌트의 문자열 변경
			label.setText(operation);
		}
	}

}