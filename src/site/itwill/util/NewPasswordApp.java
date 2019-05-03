package site.itwill.util;

import java.util.Random;
import java.util.UUID;

//���ο� ��й�ȣ�� �����Ͽ� ��ȯ�޾� ����ϴ� ���α׷�
public class NewPasswordApp {
	// ���ο� ��й�ȣ�� ������ ��ȯ�ϴ� �޼ҵ�
	public static String newPasswordOne() {
		Random random = new Random();

		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*()_+"
				+ "";

		String newPassword = "";
		for (int i = 1; i <= 10; i++) {
			newPassword += str.charAt(random.nextInt(str.length()));
		}

		return newPassword;
	}

	public static String newPasswordTwo() {
		// UUID Ŭ���� : �������� �������� ���õ� ����� �����ϴ� Ŭ����
		// UUID.randomUUID() : �������� �������� UUID �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => UUID �ν��Ͻ��� ������ : 36���� ���ڿ� ���ĺ� �ҹ���, - ����(4��)�� ����
		// UUID.toString() : �������� �������� String �ν��Ͻ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		return UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase();
	}

	public static void main(String[] args) {
		System.out.println("�ӽú�й�ȣ-1 = " + newPasswordOne());
		System.out.println("�ӽú�й�ȣ-2 = " + newPasswordTwo());

	}

}