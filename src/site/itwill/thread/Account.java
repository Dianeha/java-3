package site.itwill.thread;

//������� ������ ������ ������ Ŭ����
public class Account {
	private int money;

	public Account() {

	}

	public Account(int money) {
		super();
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

//�Ա� ó�� �޼ҵ� : �Աݾ��� ���޹޾� �ܾ� ����
	//
	public /* synchronized */ void diposit(String name, int amount) {
		money += amount;
		System.out.println("[�޼���] �Ա� ���� = �Ա��� : " + name + ", �Աݾ� : " + amount + "�� >> �ܾ� : " + money + "��");
	}

//��� ó�� �޼ҵ� : ��ݾ��� ���޹޾� �ܾ� ����

	public /* synchronized */ void withDraw(String name, int amount) {
		if (money < amount) {// �ܾ��� ���ڶ� ���
			System.out.println("[����] ��� ���� = ����� : " + name + " �ܾ� : " + money + "������ ������� �ʽ��ϴ�.");
			return;
		}
		money -= amount;
		System.out.println("[�޼���] ��� ���� = ����� : " + name + ", ��ݾ� : " + amount + "�� >> �ܾ� : " + money + "��");
	}
}
