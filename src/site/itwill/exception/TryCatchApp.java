package site.itwill.exception;

public class TryCatchApp {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };

		// �迭 ����� ÷�ڰ� ������ ��� ��� 'ArrayIndexOutOfBoundsException'
		// => ����� ���ܹ߻��Ǹ� JWM�� ���� �ڵ� ����ó��
		// => ���α׷� ����� �Ǵ� �����ڿ��Ը� ���� ����ó���ϴ� ���� ����
		// try ������ �ۼ��� ��ɿ��� ���ܰ� �߻��� ��츦 ����
		// => ���ܰ� �߻��� ��� ���� ���� Ŭ������ �ν��Ͻ� ����
		// ���ܰ� �߻��� ��� ���� �߻� ��� �ϴܿ� �ۼ��� ����� ������� ���� -catch �������� ������thread(���α׷� �帧)�� �̵�
		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.println("array[" + i + "] = " + array[i]);
			}
			
			//��� ��ɿ��� ���ܰ� �߻��� ��� ������� ����
			System.out.println("# �������� ���� ��� #");
		} catch (ArrayIndexOutOfBoundsException e) {
			// try �������� �߻��� ���� �ν��Ͻ��� ���޹޾� ���� �� ����ó��
			// => ���α׷� ����� �Ǵ� �����ڿ��� �޼����� �����ϰų� �����ڿ��� �����α�(�������) ����
			System.out.println("[����]���α׷� ���࿡ ����ġ ���� ������ �߻��Ǿ����ϴ�.");
			
			//Exception.getMessage() : ���� �ν��Ͻ��� ���ܸ޼����� ��ȯ�ϴ� �޼ҵ�
			//System.out.println("[�����α�] �����޼��� = "+e.getMessage());
			
			//Exception.printStackTrace() : ���� �߻� ��θ� �����Ͽ� ���
			//e.printStackTrace();
			
			System.out.println("# ���������� ���� ��� #");
		} finally {
			//���ܿ� ������� ������ ����� ��� �ۼ��ϴ� ���� - �ڿ� ����
			System.out.println("# ������ ����� ��� #");
		}

	}
}
