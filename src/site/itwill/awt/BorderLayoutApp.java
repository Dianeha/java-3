package site.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutApp extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BorderLayoutApp(String title) {
		super(title);

		Button button1 = new Button("버튼-1");
		Button button2 = new Button("버튼-2");
		Button button3 = new Button("버튼-3");
		Button button4 = new Button("버튼-4");
		Button button5 = new Button("버튼-5");

		/*
		 * BorderLayout layout = new BorderLayout();//BorderLayout 클래스로 인스턴스 생성해서 layout이라는 참조변수에 저장 
		 setLayout(layout);//프레임의 배치관리자를 BorderLayout으로 변경 
		 //this 생략중(BorderLayoutApp), 그리고 여기 없으면 Frame 가져다 쓴다.
		 * 
		 */		
		
		//Frame의 기본 배치관리자가 BorderLayout이므로 배치관리자 변경 불필요
		//setLayout(new BorderLayout());
		
		//Container.add(Component c, int index) : 원하는 위치(동서남북 중앙)에 컴퍼넌트를 부착
		// => 배치관리자가 BorderLayout인 경우에만 사용하는 메소드
		// => 위치에 대한 정수는 BorderLayout 클래스의 상수필드를 사용하는 것을 권장 
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.NORTH);
		add(button5, BorderLayout.CENTER);
		
		setBounds(500, 100, 400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutApp("BorderLayout");
	}
}
