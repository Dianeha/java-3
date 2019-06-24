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

		// 프레임 북쪽에 부착될 컴퍼넌트(컨테이너) 생성
		Button red = new Button("빨간색");
		Button green = new Button("초록색");
		Button blue = new Button("파란색");
		
		//컴퍼넌트를 부착하기 위한 컨테이너 >> FlowLayout이 기본 배치관리자
		Panel panel=new Panel();
		
		//패널에 컴퍼넌트 부착
		panel.add(red);
		panel.add(green);
		panel.add(blue);

		// 프레임 중앙에 부착될 컴퍼넌트 생성
		TextArea area = new TextArea();

		// 프레임 남쪽에 부착될 컴퍼넌트 생성
		TextField field = new TextField();
		
		//프레임에 컴퍼넌트(컨테이너) 부탁
		add(panel, BorderLayout.NORTH);
		add(area,BorderLayout.CENTER);
		add(field, BorderLayout.SOUTH);

		//Component.setFont(Font f) : Font 인스턴스를 전달받아 글자 관련 속성을 변경
		// => Font 클래스 : 글꼴, 스타일, 크기 정보를 저장할 목적의 클래스
		// => 컨테이너 인스턴스에서 메소드를 호출할 경우 컨테이너에 부착된 모든 컴퍼넌트에 적용 
		panel.setFont(new Font("굴림", Font.PLAIN, 16));
		area.setFont(new Font("궁서체", Font.BOLD, 16));
		field.setFont(new Font("굴림", Font.BOLD+Font.ITALIC, 16));
				
		//Component.setForeground(Color c) : Color 인스턴스를 전달받아 컴퍼넌트의 전경색(배경 앞 모든것의 색)을 변경하는 메소드
		// => Color 클래스 : 색상정보(Red:0~255, Green:0~255, blue:0~255)를 저장할 목적의 클래스
		red.setForeground(new Color(255,0,0));
		green.setForeground(new Color(0,225,0));
		blue.setForeground(new Color(0,0,225));
		
		//Component.setBackground(Color c) :Color 인스턴스를 전달받아 컴퍼넌트의 배경색을 변경하는 메소드
		//Color 클래스에는 많이 사용되는 색상들이 상수필드로 선언되어 사용
		panel.setBackground(Color.gray);
		
		//Component.setEnabled(boolean b): 컴퍼넌트의 활성 또는 비활성을 변경
		// => false: 비활성, true: 활성
		red.setEnabled(false);
		
		//TextComponent.setEditable(boolean b) : 텍스트 컴퍼넌트의 문자열 변경 활성 또는 비활성을 변경하는 메소드
		// => false: 수정 (변경)불가능, true: 수정 가능
		area.setEditable(false);
		
		//Component.setFocusable(boolean b): 컴퍼넌트의 포커스(초점) 위치'
		// => false 포커스 위치 불가능, true 포커스 위치 가능(기본)
		area.setFocusable(false);
		
		setBounds(500, 100, 300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PanelApp("Panel");
	}

}
