package site.itwill.io;

import java.io.File;
import java.io.IOException;

//File Ŭ���� : ���������� �����ϱ� ���� Ŭ���� - ���� ���� ��� ����(���丮 ����, ���� ����, ���� ���)
// => ���丮�� ���Ϸ� �νĵǾ� ó��
public class FileApp {
	public static void main(String[] args) throws IOException {
		// File(String filePath) : ���ϰ�θ� ���޹޾� File �ν��Ͻ��� �����ϱ� ���� ������
		// => ���ϰ�� : ������ġ�� ���ϸ��� �����ϴ� ǥ����� - ������ �Ǵ� �����
		// => ������ ǥ����� : �ֻ��� ���丮(C: �Ǵ� /)�κ��� ���ϰ�� ǥ��
		// => ����� ǥ����� : ���� �۾����丮�κ��� ���ϰ�� ǥ�� => ������Ʈ ���丮�� src ��Ű��
		// Windows �ü���� ����̺�(C:)�� ���� ���� - ���ϱ����ڴ� \ ���(Java������ \\�� ���)
		// Linux �ü�� �Ǵ� Mac �ü���� ����Ʈ��ġ(/)�� ���� ���� - ���ϱ����ڴ� / ���
		File fileOne = new File("c:\\data"); // ������ �����η� ǥ��

		// �� File.exists() : File �ν��Ͻ��� ����� ���ϰ���� ������ ������ ��� true�� ��ȯ�ϴ� �޼ҵ�
		if (fileOne.exists()) {
			System.out.println("c:\\data ���丮�� �̹� �����մϴ�.");
		} else {
			// �� File.mkdir() : File �ν��Ͻ��� ����� ���ϰ���� ���丮�� �����ϴ� �޼ҵ�
			fileOne.mkdir();
			System.out.println("c:\\data ���丮�� �����Ͽ����ϴ�.");
		}
		System.out.println("============================================");
		// �� File fileTwo=new File("c:\\data\\abc.txt"); //������
		// ���ϱ����ڷ� \\����ϱ� ���ٴ� /�����ڸ� ����ϴ� ���� ����
		File fileTwo = new File("c:/data/abc.txt"); // ������

		if (fileTwo.exists()) {
			System.out.println("c:\\data\\abc.txt ������ �̹� �����մϴ�.");
		} else {
			// �� File.createNewFile() : File �ν��Ͻ��� ����� ���ϰ�ο� ������ ����
			// IOException ����ó�� �ʿ�
			fileTwo.createNewFile();
			System.out.println("c:\\data\\abc.txt ������ �����Ͽ����ϴ�.");
		}
		System.out.println("============================================");
		// 1�� ��� File fileThree=new File("c:/data/xyz.txt");

		// 2�� ��� File(String parent,String child) : ���ϰ�θ� �θ�(���丮)�� �ڽ�(����)���� �����Ͽ� File
		// �ν��Ͻ� ����
		File fileThree = new File("c:/data", "xyz.txt");

		if (fileThree.exists()) {
			// �ڡڡڡڡڡ� File.delete(): File �ν��Ͻ��� ����� ���ϰ���� ������ ����
			fileThree.delete();
			System.out.println("c:\\data\\xyz.txt ������ �����Ͽ����ϴ�.");
		} else {
			System.out.println("c:\\data\\xyz.txt ������ �������� �ʽ��ϴ�.");
		}
		System.out.println("============================================");

		// ������ ǥ����� : �ֻ��� ���丮(C: �Ǵ� /)�κ��� ���ϰ�� ǥ��
		// File fileFour=new File("c:/java/workspace/java-3/src");

		// ����� ǥ����� : ���� �۾����丮�κ��� ���ϰ�� ǥ��
		// => ��Ŭ������ ���� �۾����丮 : ������Ʈ ���丮
		File fileFour = new File("src");

		if (fileFour.exists()) {
			// �� File.toString() : File �ν��Ͻ��� ����� ���ϰ�θ� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
			// System.out.println("���ϰ�� = "+fileFour.toString());
			// System.out.println("���ϰ�� = " + fileFour);
	
			// �� File.getAbsolutePath() : File �ν��Ͻ��� ����� ���ϰ�θ� �����η� 
			System.out.println("���ϰ�� = "+fileFour.getAbsolutePath());
		
		} else {
			System.out.println("���ϰ���� ����(���丮)�� �������� �ʽ��ϴ�.");
		}

		System.out.println("============================================");
		
		File fileFive =new File("c:/");
		
		// �� File.isDirectory() : File �ν��Ͻ��� ����� ���ϰ���� ������ ���丮�� ��� true ��ȯ(is�� �����ϸ� �Ҹ��� ��ȯ)
		if (fileFive.isDirectory()) {
			// �� File.listFiles() : File �ν��Ͻ��� ����� ���ϰ���� ���� ���� ����� File �迭�� ��ȯ�ϴ� �޼ҵ�
			File[] subFile=fileFive.listFiles();
			
			System.out.println(fileFive+" ���丮�� ������� >> "); //toString ����
			for (File file : subFile) {
				if (file.isFile()) {
					System.out.println("�Ϲ����� = "+file); //toString ����
				} else {
					System.out.println("���丮 = "+file); //toString ����
				} 
			}
		}
		System.out.println("============================================");
	}
}