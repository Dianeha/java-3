package site.itwill.exception;

//��й�ȣ�� ���� ���� ��� �߻��ϴ� ���ܸ� ó���ϱ� ���� Ŭ����
public class PasswordMissMatchException extends Exception {
	private static final long serialVersionUID = 1L;

	public PasswordMissMatchException() {
		// super(); �����ִ�
	}
	
	//���ܸ޼����� ���޹޾� �����ϱ� ���� ������
	//=> Exception Ŭ������ �ʵ忡 ����ǵ��� super Ű����� �����ڸ� ���� ȣ���Ѵ�
	public PasswordMissMatchException(String message) {
		super(message);
	}
	
}
