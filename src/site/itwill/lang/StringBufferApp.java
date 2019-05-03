package site.itwill.lang;

//StringBuffer 클래스 : String 과 달리 문자열 각각의 문자를 제어(조작)하기 위한 메소드를 제공, 암호화 때 사용
//replace, indexOf 등 String 클래스와 같은 메소드들 존재
public class StringBufferApp { 
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		
		//●StringBuffer.append(모든 자료형Object o)
		//StringBuffer 인스턴스에  저장된 문자열 상수에 파라메타로 대상을 전달받아 결합시키는 메소드 : 반환 X 가무슨말이여
		sb.append("ABCDEFG");
		
		//●StringBuffer.toString() 
		//StringBuffer 인스턴스에 저장된 문자열 상수를 String 인스턴스에 저장하여 반환하는 메소드
		String str=sb.toString(); // 저장할 때는 .toString 생략 불가능
		System.out.println("str = "+str);
		
		//StringBuffer 인스턴스에 저장된 문자열 상수를 반환받아 출력할 경우 .toString 생략가능
		System.out.println("sb = "+sb);
		System.out.println("====================================================");

		//●StringBuffer.insert(int offset, object o)
		//StringBuffer 인스턴스에 저장된 문자열 상수에 파라메터로 전달된 대상을 원하는 위치에 삽입
		sb.insert(4,"X");
		System.out.println("sb = "+sb);
		System.out.println("====================================================");
		
		//●StringBuffer.deleteCharAt(int index)
		//StringBuffer 인스턴스에 저장된 문자열 상수에서 파라메터로 전달된 대상을 제거
		sb.deleteCharAt(2);
		System.out.println("sb = "+sb);
		System.out.println("====================================================");
		
		//●StringBuffer.delete(start, end)	
		// 첫번째 파라메터로 전달된 대상부터 두번째 위치 전까지 제거
		sb.delete(4, 6);
		System.out.println("sb = " + sb);
		System.out.println("====================================================");
		
		//●StringBuffer.reverse(); 반대로
		sb.reverse();
		System.out.println("sb = " + sb);
		System.out.println("====================================================");

		
		
		
		
		
	}
}
