package site.itwill.lang;

import java.util.Scanner;

//�ֹι�ȣ�� �Է¹޾� �������, ������ �����Ͽ� ����ϴ� ���α׷� ����
// => �ֹι�ȣ�� 14�ڸ� ���ڿ��� �Է¹����� 7�� ��ġ���� - ���ڰ� ����(��ȿ�� �˻�)
// => ���������� �ֹι�ȣ�� �Է��� ��� �����޼��� ��� �� ���Է�
//ex) �ֹι�ȣ�Է�[ex.000101-323456] >> 901225-1234567
//	  [���]������� = 1990�� 12�� 25��, ���� = ����
public class PersonNumberApp {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String number;
		while (true) {
			System.out.print("�ֹι�ȣ�Է�[ex.000101-323456] >> ");
			number = scanner.nextLine().trim();
			if(number.length()==14 && number.charAt(6)=='-') break; //charAt ��� number.indexOf("-")==6 �� ����ص� �ȴ�.
			System.out.println("[����]���������� �ֹι�ȣ�� �Է��Ͽ����ϴ�.\n\n");
		}
		
		String separation=number.substring(7, 8);
		
		String birthday="";
		if (separation.equals("1") || separation.equals("2")) {
			birthday+="19";
		} else if (separation.equals("3") || separation.equals("4")) {
			birthday+="20";			
		}
		birthday+=number.substring(0,2)+"��"+number.substring(2,4)+"��"; birthday+=number.substring(4,6)+"��";
		/*
		 * birthday+=number.substring(2,4)+"��"; birthday+=number.substring(4,6)+"��";
		 */
		
		String gender="";
		if (separation.equals("1") || separation.equals("3")) {
			gender="����";
		} else if (separation.equals("2") || separation.equals("4")) {
			gender="����";			
		}
		
		System.out.println("\n[���]������� = "+birthday+", ���� = "+gender);
		
		scanner.close();
	}

}
