package site.itwill.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetApp {
	public static void main(String[] args) {
		// ���׸� Ÿ���� ������� ���� ��� - ��� �ν��Ͻ��� Object Ÿ������ ����
		// HashSet set=new HashSet();

		// ���׸� Ÿ���� ����� ��� - ���׸� Ÿ�� ��� ���޵� Ŭ������ �ν��Ͻ��� ����
		// HashSet<String> set=new HashSet<String>();

		// ���������� �θ� �������� �̿��Ͽ� �����ϴ� ���� ���� - ���������� ȿ����
		Set<String> set = new HashSet<String>();

		// ��Set.add(Element e) : �Ķ���Ϳ� ��Ұ�(�ν��Ͻ�)�� ������ �ݷ��ǿ� ����(�߰�)�ϴ� �޼ҵ� �ڡڡڡڡڡڡڡڡ�
		// ����Ǵ� ���� ������ �ߺ��� ������ �ν��Ͻ� ���� �Ұ�
		set.add("������");
		set.add("����");
		set.add("����");
		set.add("����");

		// ��set.toString(): �ݷ����� ��Ұ����� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => ��Ұ��� ���ڿ��� ��ȯ�Ͽ� ����� ��� �޼ҵ� ȣ�� ���� ����
		// System.out.println(set.toString());
		System.out.println("set = " + set);
		System.out.println("===================================");
		// ��set.size() : �ݷ��ǿ� ����� ����� ������ ��ȯ�ϴ� �޼ҵ�
		System.out.println("set.size() = " + set.size());
		System.out.println("===================================");

		set.add("����"); // ���� ������ �ν��Ͻ��� ������ ��� ���� �Ұ�
		System.out.println("set = " + set);
		System.out.println("===================================");

		// ��set.remove(Element e) : �Ķ���� ��Ұ�(�ν��Ͻ�)�� ���޹޾� �ݷ��ǿ��� ����
		set.remove("����");
		System.out.println("set = " + set);
		System.out.println("set.size() = " + set.size());
		System.out.println("===================================");

		// ��set.isEmpty() : �ݷ��ǿ� ����� ��Ұ� ���� ��� true ��ȯ�ϴ� �޼ҵ�
		if (set.isEmpty()) {
			System.out.println("Set �ݷ��ǿ� ����� ��Ұ� �ϳ��� �����ϴ�.");
		} else {
			System.out.println("Set �ݷ��ǿ� ����� ��Ұ� �ֽ��ϴ�.");
		}
		System.out.println("===================================");

		// ��Set.iterator() : �ݷ����� ��ҵ��� �ϰ�ó�� �� �� �ִ� iterator �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//Iterator : �ݷ��ǿ� ����� ��ҿ� ���ʴ�� ������ �� �ִ� �ν��Ͻ� 
		Iterator<String> iterator = set.iterator();

		// ��Iterator.hasNext() : Iterator(Ŀ���� ����) �ν��Ͻ��� �ݷ��� ��ҿ� ������ �� �ִ� ��� true�� ��ȯ
		while (iterator.hasNext()) {
			// ��Iterator.next() : Iterator �ν��Ͻ��� �ݷ��� ��ҿ� �����Ͽ� ��Ұ��� ��ȯ�ϴ� �޼ҵ�
			// => Iterator �ν��Ͻ��� �ڵ����� ���� �ݷ��� ��ҷ� �̵�
			System.out.println("�����ϴ� ���� = " + iterator.next());
		}
		System.out.println("===================================");
		// �ֱٿ��� Iterator �ν��Ͻ��� ���������� ����ϴ� for ����� ����Ͽ� �ϰ�ó�� ���
		for (String temp : set) {
			System.out.println("�����ϴ� ���� = " + temp);
		}
		System.out.println("===================================");
		
		// �� set.clear() : �ݷ��ǿ� ����� ��Ҹ� ��� ����
		set.clear();
		if (set.isEmpty()) {
			System.out.println("Set �ݷ��ǿ� ����� ��Ұ� �ϳ��� �����ϴ�.");
		} else {
			System.out.println("Set �ݷ��ǿ� ����� ��Ұ� �ֽ��ϴ�.");
		}
		System.out.println("===================================");
		
	}
}
