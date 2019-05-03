package site.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//Ű����� ������ �Է¹޾� ��й�ȣ�� �� Ȯ���Ͽ� ����� ����ϴ� ���α׷�
public class PasswordMatchApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("��й�ȣ �Է� >> ");
			// scanner.nextInt(); : �Է°��� ������ �ƴ� ��� InputMismatchException �߻�
			int password = scanner.nextInt();

			/*
			 * if (password == 1234) { System.out.println("[���] �Է��� ��й�ȣ�� �½��ϴ�."); } else {
			 * System.out.println("[���] �Է��� ��й�ȣ�� �ٸ��ϴ�."); }
			 */

			if (password != 1234) {
				// ���� �ν��Ͻ��� �����Ͽ� throw Ű����� �������� ���� �߻�
				throw new PasswordMissMatchException("[���] �Է��� ��й�ȣ�� �ٸ��ϴ�.");
			}
			System.out.println("[���] �Է��� ��й�ȣ�� �½��ϴ�.");
		} catch (InputMismatchException e) {
			System.out.println("[����] ������ �Է� �����մϴ�.");
		} catch (PasswordMissMatchException e) {
			// System.out.println("[���] �Է��� ��й�ȣ�� �ٸ��ϴ�.");
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}

	}
}