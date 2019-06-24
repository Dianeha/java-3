package site.itwill.io;

import java.io.IOException;

//Ű����� ���õ�����(1Byte)�� �Է¹޾� ����ͳ� ����ϴ� ���α׷�
//=> EOF(End Of File - �Է�����) : (Ctrl+Z)�� �Է��ϸ� ���α׷� ����
public class ByteStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���] Ű����� ���� �Է����ּ���.[���� : Ctrl+Z]"); // �Է°��� ������� �Ͻ����� ����

		// Ű����� �Էµ� ���õ�����(1Byte)�� �����ϱ� ���� ����
		int readByte;

		while (true) {
			// System.in : Java ���α׷� ���߽� �⺻������ �����޴� �Է½�Ʈ��
			// =>Ű����κ��� ���õ�����(1Byte)�� �Է¹��� �� �ִ� ��Ʈ��
			// - InputStream �ν��Ͻ��� ���� InputStream �޼ҵ� ȣ�� ����

			// InputStream.read() : �Է½�Ʈ������ ���õ����͸� �ϳ��� �о� ��ȯ�ϴ� �޼ҵ�
			// => �Է½�Ʈ���� �Է°��� �������� ���� ��� ������ �Ͻ� ����
			// => Ű���带 ���� �Է½�Ʈ���� �Է°��� ���� �� ���͸� �Է��ϸ� �����尡 ������
			// => IOException �߻� : ����� �޼ҵ忡�� �߻��ϴ� ���� - ��Ʈ���� ������ ���� ��� �߻�
			readByte = System.in.read();

			// �Է����� ����Ű Ctrl+Z�� ������ EOF(-1)�� ��ȯ - �ݺ����� ����
			if (readByte == -1)
				break;

			// System.out : Java ���α׷� ���߽� �⺻������ �����޴� ��½�Ʈ��
			// => �����(�ܼ�Console)�� ���õ����͸� ����(���)�� �� �ִ� ��Ʈ�� - PrintStream �ν��Ͻ�
			// PrintStream Ŭ���� : OutputStream Ŭ������ ��ӹ��� �ڽ�Ŭ����
			// ���ڽ�Ŭ������ �ν��Ͻ� �����ؾ� �ڽ�&�θ� ��� �� �� ����
			// OutputStream.write(int b) : ���õ����͸� ��½�Ʈ������ �����ϴ� �޼ҵ�
			System.out.write(readByte);
		}
		System.out.println("[�޼���] ���α׷��� �����մϴ�.");
	}
}
