package site.itwill.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetApp {
	public static void main(String[] args) {
		// 제네릭 타입을 사용하지 않은 경우 - 모든 인스턴스가 Object 타입으로 저장
		// HashSet set=new HashSet();

		// 제네릭 타입을 사용한 경우 - 제네릭 타입 대신 전달된 클래스의 인스턴스만 저장
		// HashSet<String> set=new HashSet<String>();

		// 참조변수는 부모 참조형을 이용하여 생성하는 것을 권장 - 유지보수의 효율성
		Set<String> set = new HashSet<String>();

		// ■Set.add(Element e) : 파라메터에 요소값(인스턴스)을 전달해 콜렉션에 저장(추가)하는 메소드 ★★★★★★★★★
		// 저장되는 순서 없으며 중복된 정보의 인스턴스 저장 불가
		set.add("복숭아");
		set.add("딸기");
		set.add("포도");
		set.add("참외");

		// ■set.toString(): 콜렉션의 요소값들을 문자열로 변환하여 반환하는 메소드
		// => 요소값을 문자열로 변환하여 출력할 경우 메소드 호출 생략 가능
		// System.out.println(set.toString());
		System.out.println("set = " + set);
		System.out.println("===================================");
		// ■set.size() : 콜렉션에 저장된 요소의 갯수를 반환하는 메소드
		System.out.println("set.size() = " + set.size());
		System.out.println("===================================");

		set.add("딸기"); // 동일 정보의 인스턴스가 존재할 경우 저장 불가
		System.out.println("set = " + set);
		System.out.println("===================================");

		// ■set.remove(Element e) : 파라메터 요소값(인스턴스)을 전달받아 콜렉션에서 제거
		set.remove("참외");
		System.out.println("set = " + set);
		System.out.println("set.size() = " + set.size());
		System.out.println("===================================");

		// ■set.isEmpty() : 콜렉션에 저장된 요소가 없는 경우 true 반환하는 메소드
		if (set.isEmpty()) {
			System.out.println("Set 콜렉션에 저장된 요소가 하나도 없습니다.");
		} else {
			System.out.println("Set 콜렉션에 저장된 요소가 있습니다.");
		}
		System.out.println("===================================");

		// ■Set.iterator() : 콜렉션의 요소들을 일괄처리 할 수 있는 iterator 인스턴스를 반환하는 메소드
		//Iterator : 콜렉션에 저장된 요소에 차례대로 접근할 수 있는 인스턴스 
		Iterator<String> iterator = set.iterator();

		// ■Iterator.hasNext() : Iterator(커서의 개념) 인스턴스로 콜렉션 요소에 접근할 수 있는 경우 true를 반환
		while (iterator.hasNext()) {
			// ■Iterator.next() : Iterator 인스턴스로 콜렉션 요소에 접근하여 요소값을 반환하는 메소드
			// => Iterator 인스턴스는 자동으로 다음 콜렉션 요소로 이동
			System.out.println("좋아하는 과일 = " + iterator.next());
		}
		System.out.println("===================================");
		// 최근에는 Iterator 인스턴스를 내부적으로 사용하는 for 명령을 사용하여 일괄처리 사용
		for (String temp : set) {
			System.out.println("좋아하는 과일 = " + temp);
		}
		System.out.println("===================================");
		
		// ■ set.clear() : 콜렉션에 저장된 요소를 모두 삭제
		set.clear();
		if (set.isEmpty()) {
			System.out.println("Set 콜렉션에 저장된 요소가 하나도 없습니다.");
		} else {
			System.out.println("Set 콜렉션에 저장된 요소가 있습니다.");
		}
		System.out.println("===================================");
		
	}
}
