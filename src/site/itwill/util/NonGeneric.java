package site.itwill.util;

//�ʵ忡 ����Ǵ� �ڷ����� ���� ���� ���� Ŭ������ �����Ͽ� ���
//�ذ��� >> �ʵ��� Ÿ���� Object Ŭ������ �����Ͽ� ��� �ν��Ͻ��� ����
//=> Object Ŭ������ ��� Ŭ������ �θ�Ŭ������ Object ���������� �ڽ� �ν��Ͻ� ���� ����
public class NonGeneric {
	private Object field;
	
	public NonGeneric() {
		// TODO Auto-generated constructor stub
	}

	public NonGeneric(Object field) {
		super();
		this.field = field;
	}

	public Object getField() {
		return field;
	}

	public void setField(Object field) {
		this.field = field;
	}
	
	

}