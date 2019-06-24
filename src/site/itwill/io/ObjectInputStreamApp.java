package site.itwill.io;

import java.util.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputStreamApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ObjectInputStream Ŭ���� : �Է½�Ʈ���� ���޹޾� ��ü ������
		// �Է� ������ ����� �����ϱ� ���� Ŭ���� - Ȯ��
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/data/object.txt"));

		// ObjectInputStream.readObject() : �Է½�Ʈ������ ��ü�� �о� ��ȯ�ϴ� �޼ҵ�
		// => ��ȯ�Ǵ� �ν��Ͻ� Ÿ���� Object�̹Ƿ� �ݵ�� ����� ��ü ����ȯ �� ���
		// => ClassNotFoundException �߻� - ����ó��
		String string = (String) ois.readObject();
		Date date = (Date) ois.readObject();
		@SuppressWarnings("unchecked")
		List<String> list = (List<String>) ois.readObject();

		System.out.println(string);
		System.out.println(date);
		System.out.println(list);

		ois.close();
	}
}
