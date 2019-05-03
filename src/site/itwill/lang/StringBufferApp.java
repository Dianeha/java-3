package site.itwill.lang;

//StringBuffer Ŭ���� : String �� �޸� ���ڿ� ������ ���ڸ� ����(����)�ϱ� ���� �޼ҵ带 ����, ��ȣȭ �� ���
//replace, indexOf �� String Ŭ������ ���� �޼ҵ�� ����
public class StringBufferApp { 
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		
		//��StringBuffer.append(��� �ڷ���Object o)
		//StringBuffer �ν��Ͻ���  ����� ���ڿ� ����� �Ķ��Ÿ�� ����� ���޹޾� ���ս�Ű�� �޼ҵ� : ��ȯ X ���������̿�
		sb.append("ABCDEFG");
		
		//��StringBuffer.toString() 
		//StringBuffer �ν��Ͻ��� ����� ���ڿ� ����� String �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		String str=sb.toString(); // ������ ���� .toString ���� �Ұ���
		System.out.println("str = "+str);
		
		//StringBuffer �ν��Ͻ��� ����� ���ڿ� ����� ��ȯ�޾� ����� ��� .toString ��������
		System.out.println("sb = "+sb);
		System.out.println("====================================================");

		//��StringBuffer.insert(int offset, object o)
		//StringBuffer �ν��Ͻ��� ����� ���ڿ� ����� �Ķ���ͷ� ���޵� ����� ���ϴ� ��ġ�� ����
		sb.insert(4,"X");
		System.out.println("sb = "+sb);
		System.out.println("====================================================");
		
		//��StringBuffer.deleteCharAt(int index)
		//StringBuffer �ν��Ͻ��� ����� ���ڿ� ������� �Ķ���ͷ� ���޵� ����� ����
		sb.deleteCharAt(2);
		System.out.println("sb = "+sb);
		System.out.println("====================================================");
		
		//��StringBuffer.delete(start, end)	
		// ù��° �Ķ���ͷ� ���޵� ������ �ι�° ��ġ ������ ����
		sb.delete(4, 6);
		System.out.println("sb = " + sb);
		System.out.println("====================================================");
		
		//��StringBuffer.reverse(); �ݴ��
		sb.reverse();
		System.out.println("sb = " + sb);
		System.out.println("====================================================");

		
		
		
		
		
	}
}
