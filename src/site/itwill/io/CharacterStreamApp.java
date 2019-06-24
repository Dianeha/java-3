package site.itwill.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

//Ű����� ����������(2Byte)�� �Է¹޾� ����Ϳ� ����ϴ� ���α׷�
//=> EOF(End Of File - �Է�����) : (Ctrl+Z)�� �Է��ϸ� ���α׷� ����
public class CharacterStreamApp {
public static void main(String[] args) throws IOException {
	System.out.println("[�޼���] Ű����� ���� �Է����ּ���.[���� : Ctrl+Z]"); // �Է°��� ��� ������ �Ͻ����� ����

	//InputStreamReader : InputStream �ν��Ͻ��� ���޹޾� ���������͸�
	//�Է½�Ʈ�����κ��� �б� ���� Ŭ����
	// => InputStreamReader(InputStream in[, String charset]) ������
	//System.in �ν��Ͻ��� ���޹޾� Ű����κ��� ���������͸� �Է¹��� �� �ִ� �Է½�Ʈ�� ���� -���԰��踦 ���� Ȯ��
	InputStreamReader isr=new InputStreamReader(System.in);
	
	//OutputStream �ν��Ͻ��� ���޹޾� ����
	// => InputStreamReader(InputStream in) ������
	//System.in �ν��Ͻ��� ���޹޾� ����Ϳ� ���������͸� ������ �� �ִ� ��½�Ʈ�� ���� -���԰��踦 ���� Ȯ��(����Ʈ ��Ʈ���� ĳ���� ��Ʈ������ Ȯ��)
	OutputStreamWriter osw=new OutputStreamWriter(System.out);
	
	//PrintWriter Ŭ������ OutputStreamWriterŬ������ ��ӹ��� �ڽ�Ŭ����
	PrintWriter pw=new PrintWriter(System.out);
	
	
	// Ű����� �Էµ� ����������(2Byte)�� �����ϱ� ���� ����
	int readChar;
	
	while(true) {
		readChar=isr.read();
		if (readChar==-1) break;
		//��½�Ʈ������ ���������͸� ������ ���
		// => CharacterStream ���� ���Ŭ������ ���������� ��Ƽ� �ѹ��� ��½�Ʈ���� ����
		osw.write(readChar);
		pw.write(readChar);
		//OutputStreamWriter.flush() : ���ۿ� ����� ���������͸� ��½�Ʈ������ �����ϴ� �޼ҵ�
		osw.flush();
		pw.flush();
	}
	
	System.out.println("[�޼���] ���α׷��� �����մϴ�.");
	}

}
