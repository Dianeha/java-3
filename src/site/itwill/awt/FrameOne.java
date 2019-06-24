package site.itwill.awt;

import java.awt.Frame;

public class FrameOne {
	public static void main(String[] args) {
		//■ Frame(String title) : 제목에 부여된 프레임을 생성하는 생성자
		Frame f = new Frame(); // 새로운 프레임 생성(컨테이너로 컴퍼넌트Component를 담을 수 있음)
		
		//■ Frame.setTitle(String title) : 프레임의 제목을 변경하는 메소드
		//f.setTitle("프레임");
		
		/*
		 * //■ Component.setSize(int width, int height) : 컴퍼넌트 또는 컨테이너의 폭과 넓이를 크기 변경
		 * 메소드 // => 크기 또는 위치 단위 : pixel(픽셀, 하나의 색이 출력되는 점rgb: red, green, blue 빛의 삼원색)
		 * f.setSize(400, 300);
		 * 
		 * //■ Component.setLocation(int x, int y) : x와 y의 위치에 컴퍼넌트 또는 컨테이너 위치 변경하는 메소드
		 * f.setLocation(500, 100);
		 */
		
		//Component.setBounds(int x,int y, width, height) // 컴퍼넌트(컨테이너)의 크기와 위치를 변경하는 메소드 => 한번에
		f.setBounds(500, 100, 400, 300);
		
		//■ Frame.setResizable(boolean b) : 프레임 크기 변경 유무를 변경하는 메소드
		// false: 크기 변경 불가능 / true : 크기 변경 가능(기본)
		f.setResizable(true);
		
		
		//■ Component.setVisible(boolean b) : 컴퍼넌트(or 컨테이너)에 대한 출력 여부를 결정하는 메소드
		// => false 전달하면 미출력(기본)/ true 출력
		f.setVisible(true);
			
	}
}
