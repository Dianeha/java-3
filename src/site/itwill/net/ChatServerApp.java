package site.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

//ä�� ���� ���α׷�
// => Ŭ���̾�Ʈ���� ������ �޼����� ���޹޾� ���ӵ� ��� Ŭ���̾�Ʈ���� �����ϴ� ��� ����
// => Ŭ���̾�Ʈ�� ����� ������ �������� ������ ���� ���ο� ������� ��ɽ��� : ���߽�����(Ŭ���̾�Ʈ ������ŭ +1���� ���ν�����)
public class ChatServerApp {
	// ���ӵ� ��� Ŭ���̾�Ʈ�� ��������(������)�� �����ϱ� ���� �ʵ�
	private List<SocketThread> clientList;

	public ChatServerApp() {
		ServerSocket chatServer = null;
		try {
			chatServer = new ServerSocket(5000);
			System.out.println("[�޼���] ä�ü��� ���� ��...... ");
			
			clientList=new Vector<SocketThread>();

			while (true) {
				try {
					Socket client = chatServer.accept();// ������ ������ Ŭ���̾�Ʈ�� ����� ���� ������ ��ȯ�Ͽ� Ŭ���̾�Ʈ��� �ʵ忡 ����

					System.out.println("[���ӷα�]" + client.getInetAddress().getHostAddress() + "�� ��ǻ�Ϳ��� �����Ͽ����ϴ�.");

					// ���������� ������ ����� ������ �ν��Ͻ� ����-������ �������� ������ ����
					SocketThread st = new SocketThread(client);

					// ���������� ������ ������ �ν��Ͻ� �ݷ��ǿ� ����
					clientList.add(st);

					// ���������� ������ ������ �ν��Ͻ��� �̿��Ͽ� ������
					st.start();

				} catch (IOException e) {
					System.out.println("[�����α�]Ŭ���̾�Ʈ ���� ���� ������ �߻��Ͽ����ϴ�.");
				}
			}

		} catch (IOException e) {
			System.out.println("[�����α�] ������ ���������� ������� �ʽ��ϴ�.");

		}
	}

	public static void main(String[] args) {
		new ChatServerApp();
	}

	// ���� ���ӵ� ��� Ŭ���̾�Ʈ���� �޼����� �����ϱ� ���� ����� �����ϴ� Ŭ����,,,?
	public void sendMessage(String message) {
		for (SocketThread st : clientList) {
			// ���Ͻ������� ��½�Ʈ���� �̿��Ͽ� Ŭ���̾�Ʈ���� �޼����� ����
			st.out.println(message);
		}
	}

	// Ŭ���̾�Ʈ�� ����� ������ �̿��Ͽ� �Է� �� ��� ����� �����ϱ� ���� Ŭ����
	// => �������� �Է� �� ��� ����� �����ϱ� ���� ������ Ŭ������ �ۼ�
	public class SocketThread extends Thread {
		// Ŭ���̾�Ʈ�� ����� ���������� �����ϱ� ���� �ʵ�
		private Socket socket;

		// Ŭ���̾�Ʈ�� ������ �޼����� �ޱ� ���� �Է½�Ʈ���� �����ϱ� ���� �ʵ�
		private BufferedReader in;

		// Ŭ���̾�Ʈ���� �޼����� ������ ���� ��½�Ʈ���� �����ϱ� ���� �ʵ�
		private PrintWriter out;

		public SocketThread(Socket socket) {// ������ -�ʵ忡 �ʱⰪ �ִ� ��
			this.socket = socket;
		}

		@Override
		public void run() {
			String aliasName="";
			try {
				// ������ �Է½�Ʈ���� �����޾� Ȯ���Ͽ� �ʵ忡 ����
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				//������ ��½�Ʈ���� �����޾� Ȯ���Ͽ� �ʵ忡 ����
				//PrintWriter(OutputStream stream, boolean autoFlush) 
				// => autoFlush �Ķ���Ϳ� true�� ������ ��� ������ ����
				out=new PrintWriter(socket.getOutputStream(),true);

				//Ŭ���̾�Ʈ���� ���޵� ��ȭ���� ���� ����
				// => Ŭ���̾�Ʈ���� ��ȭ���� �Է��Ͽ� �����ϱ� ������ ������ �Ͻ� ����
				aliasName=in.readLine();

				// ���� ���ӵ� ��� Ŭ���̾�Ʈ���� ȯ���޼����� ����
				sendMessage("[" + aliasName + "]���� �����ϼ̽��ϴ�.");

				// ��� Ŭ���̾�Ʈ���� ������ �޼����� ���� ���� ���ӵ� ��� Ŭ���̾�Ʈ���� ���� - �ݺ�ó��(Ŭ���̾�Ʈ ����������)
				// => Ŭ���̾�Ʈ���� ������ �޼����� ���� ��� ������ �Ͻ� ����
				// => Ŭ���̾�Ʈ�� ������ ������ ��� IOException �߻�
				while (true) {
					sendMessage("[" + aliasName + "]" + in.readLine());

				}

			} catch (IOException e) {
				// Ŭ���̾�Ʈ�� ������ ������ ��쿡 ���� ó��
				// => �ݷ��ǿ��� ���� �����带 ����
				// => ���� ���ӵ� ��� Ŭ���̾�Ʈ���� ����޼����� ����
				clientList.remove(this);
				sendMessage("[" + aliasName + "]���� �����ϼ̽��ϴ�.");
				
				System.out.println("[�����α�]" + socket.getInetAddress().getHostAddress() + "�� ��ǻ�Ϳ��� ������ �����Ͽ����ϴ�.");
			}
		}
	}

}
