package site.itwill.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsApp {
	// �޼ҵ忡�� �߻��� �� �ִ� ��� ���ܵ��� throws Ű����� ����

	public ThrowsApp() throws IOException, NumberFormatException, ArithmeticException {
		// Ű����� ���ڿ��� �Է¹ޱ� ���� �Է½�Ʈ�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Ű����� ���ڸ� �Է¹޾� ������ ����
		System.out.print("ù��° ���� �Է� >> ");
		// BufferedReader.readLine() : �Է½�Ʈ�����κ��� ���ڿ��� �����޾� ��ȯ�ϴ� �޼ҵ�
		// => IOException ���� �߻��� �޼ҵ� ȣ��� ���� - ����ó��
		// => IOException ���ܴ� �ۼ� ���� �����̹Ƿ� �ݵ�� ���� ó�� >> ���� ������ ����ó��
		// Integer.parseInt(String str) : �Ķ���ͷ� ���޵� ���ڿ��� ������ �ٲ� ��ȯ�ϴ� �޼ҵ�
		// => �Ķ��Ÿ�� ���޵� ���ڿ��� ���� ���°� �ƴ� ��� : c �߻�
		// => NumberFormatException ���ܴ� ���� ���� ���ܷ� ���� ó������ ������ JVM�� �ڵ�ó��
		int num1 = Integer.parseInt(br.readLine());

		System.out.print("�ι�° ���� �Է� >> ");
		int num2 = Integer.parseInt(br.readLine());

		// 0���� ���� ��� ArithmeticException ���� �߻�
		// => ArithmeticException ���ܴ� ���� ���� ���ܷ� ����ó���� ���� ������
		System.out.println("[���] �� ������ ������ ��� = " + (num1 / num2));
	}

	// main �޼ҵ忡 ���޵Ǵ� ���ܴ� JVM�� ���� �ڵ� ���� ó��
	public static void main(String[] args) /* throws IOException */ {
		// ���ܰ� �߻��Ǵ� �޼ҵ带 ȣ���� ��� try ������� ����ó��
		/*
		try {
			new ThrowsApp(); // �����ڸ� ȣ���� �ν��Ͻ� ����
		} catch (NumberFormatException e) {
			System.out.println("[����] ������ �Է� �����մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("[����] �ι�° �������� 0�� �Է��� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("[����] ����� ��Ʈ���� ������ �߻��߽��ϴ�.");
		} catch (Exception e) { // ��� ���ܸ� ���޹޾� ó��
			System.out.println("[����] ���α׷� ���࿡ ������ �߻��߽��ϴ�.");
		}
		*/
		
		try {
			new ThrowsApp(); // �����ڸ� ȣ���� �ν��Ͻ� ����
		} catch (NumberFormatException | ArithmeticException e) {
			// �������� ���ܴ� | �����ڸ� �̿��� ó�� ���� - JDK1.7���� ����
			System.out.println("[����] �߸��� ���� �Է��Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("[����] ����� ��Ʈ���� ������ �߻��߽��ϴ�.");
		} catch (Exception e) { // ��� ���ܸ� ���޹޾� ó��
			System.out.println("[����] ���α׷� ���࿡ ������ �߻��߽��ϴ�.");
		}
	}

}
