package site.itwill.thread;

//은행계좌를 사용할 수 있는 사용자 정보를 저장할 목적의 클래스
// => 생성된 Thread에서 입금 및 출금처리 명령 실행
public class AccountUser extends Thread {
	private String userName;
	private Account account;

	public AccountUser() {
		// TODO Auto-generated constructor stub
	}

	public AccountUser(String userName, Account account) {
		super();
		this.userName = userName;
		this.account = account;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		//(int)(Math.random()*100+1)*100 >> 100~10000 범위의 100단위 정수난수 발생
		synchronized (account) {
			account.withDraw(userName, (int)(Math.random()*100+1)*100); //출금		
		}
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (account) {
			account.diposit(userName, (int)(Math.random()*100+1)*100); //입금
		}
		
	}
}
