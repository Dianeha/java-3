package site.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//Ŭ���̾�Ʈ�� ���� �� ������ �޼����� ����ϴ� ���� ���α׷�
public class EchoServerApp {
public static void main(String[] args) throws IOException {
	@SuppressWarnings("resource")
	ServerSocket echoServer=new ServerSocket(4000);
	System.out.println("[�޼���]Echo Server Running...");
	
	while(true) {
		Socket socket=echoServer.accept();
		
		//getInputStream : Ŭ���̾�Ʈ�� ������ ���õ����͸� ���޹��� >> ���ڿ��� �������� reader�� �̿�
		//���Ͽ��� �Է� ��Ʈ���� �����޾� Ȯ���Ͽ� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//Ŭ���̾�Ʈ���� ������ ���ڿ��� ��ȯ�޾� ���
		System.out.println("["+socket.getInetAddress().getHostAddress()+"]���� ������ �޼��� >> "+in.readLine());
		
		socket.close();
	}
}
}
