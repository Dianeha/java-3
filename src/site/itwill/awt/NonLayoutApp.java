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
		
		Button btn1=new Button("버튼-1");
		Button btn2=new Button("버튼-2");
		
		//Container.setLayout(LayoutManager layout) : 컨테이너의 배치관리자
		// => 파라메터에 null을 전달해 메소드를 호출할 경우 배치관리자 미사용
		setLayout(null); //프레임의 배치관리자 변경
		
		//배치관리자를 사용하지 않을 경우 컴퍼넌트의 크기와 출력 위치 변경 후 컨테이너에 부착
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
