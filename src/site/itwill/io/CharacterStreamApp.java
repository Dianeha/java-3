package site.itwill.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

//키보드로 변형데이터(2Byte)를 입력받아 모니터에 출력하는 프로그램
//=> EOF(End Of File - 입력종료) : (Ctrl+Z)를 입력하면 프로그램 종료
public class CharacterStreamApp {
public static void main(String[] args) throws IOException {
	System.out.println("[메세지] 키보드로 값을 입력해주세요.[종료 : Ctrl+Z]"); // 입력값이 없어서 스레드 일시중지 상태

	//InputStreamReader : InputStream 인스턴스를 전달받아 변형데이터를
	//입력스트림으로부터 읽기 위한 클래스
	// => InputStreamReader(InputStream in[, String charset]) 생성자
	//System.in 인스턴스를 전달받아 키보드로부터 변형데이터를 입력받을 수 있는 입력스트립 생성 -포함관계를 통한 확장
	InputStreamReader isr=new InputStreamReader(System.in);
	
	//OutputStream 인스턴스를 전달받아 변형
	// => InputStreamReader(InputStream in) 생성자
	//System.in 인스턴스를 전달받아 모니터에 변형데이터를 전달할 수 있는 출력스트림 생성 -포함관계를 통한 확장(바이트 스트림을 캐릭터 스트림으로 확장)
	OutputStreamWriter osw=new OutputStreamWriter(System.out);
	
	//PrintWriter 클래스는 OutputStreamWriter클래스를 상속받은 자식클래스
	PrintWriter pw=new PrintWriter(System.out);
	
	
	// 키보드로 입력된 변형데이터(2Byte)를 저장하기 위한 변수
	int readChar;
	
	while(true) {
		readChar=isr.read();
		if (readChar==-1) break;
		//출력스트림으로 변형데이터를 전달해 출력
		// => CharacterStream 관련 출력클래스는 변형데이터 모아서 한번에 출력스트림에 전달
		osw.write(readChar);
		pw.write(readChar);
		//OutputStreamWriter.flush() : 버퍼에 저장된 변형데이터를 출력스트림으로 전달하는 메소드
		osw.flush();
		pw.flush();
	}
	
	System.out.println("[메세지] 프로그램을 종료합니다.");
	}

}
