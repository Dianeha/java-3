package site.itwill.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//1~45 ������ ���������� 6�� �Է¹޾� ����ϴ� ���α׷�
//=> 6�� ���������� �ߺ��Ǿ�� �ȵǸ� �����Ͽ� ��µǵ��� �ۼ�
public class LottoSetApp {
	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> lottoSet = new HashSet<Integer>();

		while (true) {
			lottoSet.add(random.nextInt(45) + 1);
			if (lottoSet.size() == 6)
				break;
		}
		//System.out.println(lottoSet);
		
		// �� Set.toArray(Element[] a) : �Ķ���Ϳ� �迭�� �����Ͽ� �ݷ����� ��Ұ��� �����ϴ� �迭�� ��ȯ�ϴ� 
		Integer[] lotto=lottoSet.toArray(new Integer[0]);
		
		Arrays.sort(lotto);
		
		System.out.println("����� ���� >> " + Arrays.toString(lotto));
	}
}
