package site.itwill.lang;

public class StringApp {
	public static void main(String[] args) {

		// "" ��ȣ�� �̿��Ͽ� ���ڿ� ����� ����� String �ν��Ͻ� ���� ����
		String str1 = "ABC";

		// String.toString() : String �ν��Ͻ��� ����� ���ڿ� ����� ��ȯ�ϴ� �޼ҵ�
		// System.out.println("str1.toString() = "+str1.toString());

		// String �ν��Ͻ��� ����� ���ڿ� ����� ����� ��� toString() �޼ҵ� ȣ�� ����
		System.out.println("str1 = " + str1);
		System.out.println("========================================================================1");

		/*
		 * "" ��ȣ�� String �ν��Ͻ��� ������ ��� ������ ���ڿ� ����� ����� String �ν��Ͻ��� ���� �������� �ʰ� ���� String
		 * �ν��Ͻ��� �����޾� ���
		 */
		String str2 = "ABC";
		// ���������� ���迬���ڷ� ���� ��� ���������� ����� �ν��Ͻ� ������ ���Ѵ�
		// => String �ν��Ͻ��� ����� ���ڿ� ����� ���ϴ� ���� �ƴ϶� �ν��Ͻ��� �������� ��
		if (str1 == str2) {
			System.out.println("str1 ���������� str2 ���������� ����� �ν��Ͻ� ������ �����ϴ�.");
		} else {
			System.out.println("str1 ���������� str2 ���������� ����� �ν��Ͻ� ������ �ٸ��ϴ�.");
		}
		System.out.println("========================================================================2");

		// �����ڸ� �̿��Ͽ� String �ν��Ͻ� ����
		String str3 = new String("ABC");
		if (str1 == str3) {
			System.out.println("str1 ���������� str2 ���������� ����� �ν��Ͻ� ������ �����ϴ�.");
		} else {
			System.out.println("str1 ���������� str2 ���������� ����� �ν��Ͻ� ������ �ٸ��ϴ�.");
		}
		System.out.println("========================================================================3");

		// �ڡڡڡ�String.equals(String s) : �� �ν��Ͻ��� ����� ���ڿ� ����� ���Ͽ�
		// �ٸ� ��� false, ���� ��� true�� ��ȯ�ϴ� �޼ҵ�
		if (str1.equals(str3)) {
			System.out.println("�ν��Ͻ��� ����� ���ڿ� ����� �����ϴ�.");
		} else {
			System.out.println("�ν��Ͻ��� ����� ���ڿ� ����� �ٸ��ϴ�.");
		}
		System.out.println("========================================================================4");
		
		// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� equals() �޼ҵ�� ��ҹ��ڸ� �����Ͽ� �� ��� �ݿ�
		String str4 = "abc";
		if (str1.equals(str4)) {
			System.out.println("�ν��Ͻ��� ����� ���ڿ� ����� �����ϴ�.");
		} else {
			System.out.println("�ν��Ͻ��� ����� ���ڿ� ����� �ٸ��ϴ�.");
		}
		System.out.println("========================================================================5");
		
		// String.equalsIgnoreCase(String s) : ��ҹ��ڸ� �������� �ʰ� ��
		if (str1.equalsIgnoreCase(str4)) {
			System.out.println("�ν��Ͻ��� ����� ���ڿ� ����� �����ϴ�.");
		} else {
			System.out.println("�ν��Ͻ��� ����� ���ڿ� ����� �ٸ��ϴ�.");
		}
		System.out.println("========================================================================6");
		
		//String.compareTo(String s): ���ڿ��� ���Ͽ� ȣ�� �ν��Ͻ��� ���ڿ��� 
		//ū ��� ���, �Ķ��Ÿ�� ���޵� �ν��Ͻ��� ���ڿ��� ū ��� ���� 
		// ���� ��� 0�� ��ȯ�ϴ� �޼ҵ�
		if (str1.compareTo(str4) >= 0) {
			System.out.println("str1 �ν��Ͻ��� ���ڿ� ����� �� ũ�ų� �����ϴ�.");
		} else {
			System.out.println("str4 �ν��Ͻ��� ���ڿ� ����� �� Ů�ϴ�.");
			//�빮�ں��� �ҹ��ڰ� ũ��
		}
		System.out.println("========================================================================7");
		//���ڿ� ����� ���������� ���ڹ迭�� ó�� - ÷��(Index)�� �̿��� 
		String str5="ABCDEFG";
		
		//String.length() : String �ν��Ͻ��� ����� ���ڿ� ����� ���� ������ ��ȯ
		System.out.println("str5.length() = "+str5.length());
		
		System.out.println("========================================================================8");
		
		//String.indexOf(int c) �Ǵ� String.indexOf(String s) :
		//String �ν��Ͻ��� ����� ���ڿ� ������� �Ķ���ͷ� ���޵� ����(���ڿ�)�� �˻���
		//������ġ(int beganIndex)�� ��ȯ�ϴ� �޼ҵ�(index �� 0���� 1�� ������)
		System.out.println("str5.indexOf('A') = "+str5.indexOf('A'));
		System.out.println("str5.indexOf('E') = "+str5.indexOf('E'));
		System.out.println("str5.indexOf(\"CD\") = "+str5.indexOf("CD"));
		//�˻� ����(���ڿ�)�� �������� ���� ��� -1 ��ȯ
		System.out.println("str5.indexOf('X') = "+str5.indexOf('X'));
		System.out.println("========================================================================9");
		
		//String.charAt(int index) : String �ν��Ͻ��� ����� ���ڿ� �������
		//�Ķ���Ϳ� ���޵� index ��ġ�� ���ڸ� ��ȯ�ϴ� �޼ҵ�
		// => StringIndexOutOfBoundsException ���� �߻�
		System.out.println("str5.charAt(4) = "+str5.charAt(4));
		//System.out.println("str5.charAt(10) = "+str5.charAt(10));
		System.out.println("========================================================================10");
		
		String str6="Java";
		//String.concat(String s) : String �ν��Ͻ��� ����� ���ڿ� ����� 
		//�Ķ���ͷ� ���޵� ���ڿ� ����� �߰�(����)�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// java������ �ַ� +�� ����Ѵ�
		str6=str6.concat(" Programming");
		System.out.println("str6 = "+str6);
		System.out.println("========================================================================11");
		
		// String.toUpperCase() : String �ν��Ͻ��� ����� ���ڿ� ����� ��� �����ڸ� �빮�ڷ� ��ȯ�� ��ȯ�ϴ� �޼ҵ�
		System.out.println("str6.toUpperCase = " + str6.toUpperCase());
		System.out.println("str6.toLowerCase = " + str6.toLowerCase()); // �������� �ʰ� �Ͻ������� ��ȯ�� ��
		System.out.println("str6 = " + str6);
		str6 = str6.toUpperCase();// �빮�ڷ� ��ȯ�� ���� str6�� �����
		System.out.println("str6 = " + str6);
		System.out.println("========================================================================12");

		// String.trim() : String �ν��Ͻ��� ����� ���ڿ� ����� �յڿ� �����ϴ� ��� ������ ���� �� �ν��Ͻ� ��ȯ
		String str7 = "    ȫ�浿           ";
		System.out.println("�Էµ� �̸��� [" + str7 + "]�Դϴ�.");
		System.out.println("�Էµ� �̸��� [" + str7.trim() + "]�Դϴ�.");
		System.out.println("========================================================================13");
		
		/* String.replace(String regEx, String replacement) : String �ν��Ͻ��� ����� ���ڿ� �������
		 * ù��° �Ķ���Ϳ� ���޵� String �ν��Ͻ��� ���ڿ�(����ǥ����regular expression)�� �˻��� �ι�° String �ν��Ͻ��� ���ڿ��� ������ �ν��Ͻ�
		 * ��ȯ�ϴ� �޼ҵ�
		 */
		String str8 = "    ȫ   ��       ��           ";
		System.out.println("�Էµ� �̸��� [" + str8 + "]�Դϴ�.");
		System.out.println("�Էµ� �̸��� [" + str8.trim() + "]�Դϴ�.");
		System.out.println("�Էµ� �̸��� [" + str8.replace(" ", "").replace("ȫ", "��") + "]�Դϴ�.");
		System.out.println("========================================================================14");
		
		String str9="010-1234-5678";
		//String str9="010*1234*5678";
		
		System.out.println("str9 = " + str9);
		
		
		//String.split(String regEx)  
		/* String �ν��Ͻ��� ����� ���ڿ� ������� �Ķ���Ϳ� ���޵� String �ν��Ͻ��� ���ڿ�(����ǥ����)�� �̿��Ͽ� ���ڿ� �и� ��
		 * String �ν��Ͻ� �迭�� ��ȯ�ϴ� �޼ҵ�
		 */
		String[] array = str9.split("-");
		//String[] array = str9.split("\\*");
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		
		System.out.println("========================================================================15");
		
		//String.substring(int beginIndex, int endIndex)
		/*
		 * String �ν��Ͻ��� ����� ���ڿ� ������� ������ġ(beginIndex - ��������)���� ��������ġ(endIndex - ����
		 * ������)������ ���ڿ��� �и� �� String �ν��Ͻ� ��ȯ
		 */
		System.out.println("str9.substring(0,3) = "+str9.substring(0,3));
		System.out.println("str9.substring(4,8) = "+str9.substring(4,8));
		System.out.println("str9.substring(9,12) = "+str9.substring(9,13));
		//���� ��ġ���� ������ ��� �ڵ����� ���ڿ��� ���������� ǥ���Ǿ� �и� 
		System.out.println("str9.substring(9) = "+str9.substring(8+1));
		
		
		System.out.println("========================================================================16");
		
				
		
		
		
		
		
		
	}
}
