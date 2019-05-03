package site.itwill.thread;

//은행계좌 정보를 저장할 목적의 클래스
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

//입금 처리 메소드 : 입금액을 전달받아 잔액 증가
	//
	public /* synchronized */ void diposit(String name, int amount) {
		money += amount;
		System.out.println("[메세지] 입금 성공 = 입금자 : " + name + ", 입금액 : " + amount + "원 >> 잔액 : " + money + "원");
	}

//출금 처리 메소드 : 출금액을 전달받아 잔액 증가

	public /* synchronized */ void withDraw(String name, int amount) {
		if (money < amount) {// 잔액이 모자란 경우
			System.out.println("[에러] 출금 실패 = 출금자 : " + name + " 잔액 : " + money + "원으로 충분하지 않습니다.");
			return;
		}
		money -= amount;
		System.out.println("[메세지] 출금 성공 = 출금자 : " + name + ", 출금액 : " + amount + "원 >> 잔액 : " + money + "원");
	}
}
