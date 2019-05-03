package site.itwill.util;

import java.util.Random;
import java.util.Scanner;

//숫자야구게임 : 정수난수(0~9)를 3개 발생하고 키보드로 입력하여 맞추는 게임
//게임의 규칙
// => 난수와 입력값은 3개의 정수가 서로 달라야 하고 0으로 시작되어서는 안된다.
// => 숫자와 자릿수가 같으면 스트라이크, 숫자는 같지만 자릿수가 틀리면 볼로 계산
// => 스트라이트가 3이면 성공 메세지 출력 후 프로그램 종료
// => 입력 기회는 15번을 제공하며 맞추지 못했을 경우 정답(난수) 출력
// => 키보드로 입력규칙에 맞지 않게 값을 입력할 경우 재입력(입력횟수 미증가)
public class BaseballApp {
	public static void main(String[] args) {
		// 정수난수를 저장하기 위한 배열 선언
		int[] dap = new int[3];

		Random random = new Random();
		while (true) {
			// 정수난수 3개를 발생하여 배열 요소에 저장
			for (int i = 0; i < dap.length; i++) {
				dap[i] = random.nextInt(10);
			}

			// 입력규칙에 맞게 난수 3개가 발생되어 저장된 경우 반복문 종료
			if (dap[0] != 0 && dap[0] != dap[1] && dap[1] != dap[2] && dap[2] != dap[0]) break;
		}
		//정답 유무에 대한 상태정보를 저장하기 위한 변수
		boolean result = false;

		Scanner scanner = new Scanner(System.in);

		// 문제에 대한 기회 제공 & 입력에 대한 결과 출력
		for (int cnt = 1; cnt <= 15; cnt++) {
			// 스트라이크와 볼의 갯수를 저장하기 위한 변수 선언
			int strike = 0, ball = 0;

			// 입력정수 3개를 저장하기 위한 배열 선언
			int[] num = new int[3];

			// 키보드로 정수 3개를 입력받아 배열 요소에 저장
			// => 입력규칙을 위반할 경우 재입력을 위해 반복 처리
			loop: 
				while (true) {
				System.out.println(cnt + "번째 정수 입력 >> ");
				String input = scanner.nextLine();
				if (input.length() != 3) {
					System.out.println("[에러]3자리 정수만 입력 가능합니다.");
					continue;
				}

				// 입력 문자열의 문자를 정수로 변환하여 배열 요소에 저장
				for (int i = 0; i < num.length; i++) {
					// 문자열의 문자를 반환받아 정수로 변환하여 배열요소에 저장
					// Java Character : Unicode - '0': 48 ~ '9' :57
					// => '4' - '0' =52-48=4
					num[i] = input.charAt(i) - '0';
					if (num[i] < 0 || num[i] > 9) {
						System.out.println("[에러] 숫자만 입력 가능합니다.");
						continue loop;
					}
				}

				if(num[0]!=0 && num[0]!=num[1] && num[1]!=num[2] && num[2]!=num[0]) break;
				System.out.println("[에러]0으로 시작되거나 중복된 숫자가 존재합니다.");
			}

				// 난수값과 입력값을 비교하여 스트라이크와 볼 계산
				for (int i = 0; i < dap.length; i++) {
					for (int j = 0; j < num.length; j++) {
						if (dap[i] == num[j]) {

							if (i == j)
								strike++;
							else
								ball++;

						}
					}
				}

				if (strike == 3) {
					System.out.println("[메세지] 축하합니다." + cnt + "번에 맞췄습니다.");
					result=true;
					break;
				}

				System.out.println("[결과]" + strike + "스트라이크 " + ball + "볼");
			}
		

		scanner.close();

		// 정답을 맞추지 못한 경우
		if (!result) {
			System.out.println("정답을 못 맞췄군요. 바보!!! 정답은 [");
			for (int temp : dap) {
				System.out.print(temp);
			}
			System.out.println("]입니다.");
		}

	}
}
