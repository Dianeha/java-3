package site.itwill.util;

import java.util.Random;

public class RandomApp {
	public static void main(String[] args) {
		//Random(int seed) : �Ķ���Ϳ� �õ尪�� �����Ͽ� �ν��Ͻ� �����ϴ� ������
		// => �õ尪 : ���α׷� ����� �ٸ� ������ �߻��ǵ��� �����ϴ� long Ÿ�� ������
		//System.currentTimeMillis() : ���� �ý����� Timestamp ��(1970�� 1�� 1���� �������� �и��ʴ� 1�� �����Ǵ� long Ÿ�� ������)�� ��ȯ�ϴ� �޼ҵ�
		//Random random = new Random(System.currentTimeMillis());

		//Random Ŭ������ �⺻�����ڴ� �õ尪�� �ڵ����� ���� >> System.currentTimeMillis()
		Random random=new Random();
		
		for (int i = 1; i <= 5; i++) {
			//random.nextInt(int bound): 0 ~bound ~1 ������ ���������� �߻��ϴ� �޼ҵ�
			System.out.println(i+"��° ���� >> "+random.nextInt(100));
		}
	}
}
