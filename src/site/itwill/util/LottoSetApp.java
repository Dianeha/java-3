package site.itwill.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//1~45 범위의 정수난수를 6개 입력받아 출력하는 프로그램
//=> 6개 정수난수는 중복되어서는 안되며 정렬하여 출력되도록 작성
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
		
		// ■ Set.toArray(Element[] a) : 파라메터에 배열을 전달하여 콜렉션의 요소값을 저장하는 배열로 반환하는 
		Integer[] lotto=lottoSet.toArray(new Integer[0]);
		
		Arrays.sort(lotto);
		
		System.out.println("행운의 숫자 >> " + Arrays.toString(lotto));
	}
}
