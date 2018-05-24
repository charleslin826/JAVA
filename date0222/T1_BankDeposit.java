package date0222;

public class T1_BankDeposit {

	public static void main(String[] args) {
		Account c1 = new Account(15000);//original balance
		Account c2 = new Account(30000);//original balance
		ATM a1 = new ATM(2000);
		ATM a2 = new ATM(2000);	
		c1.deposit(2000);	//deposit more
		a1.start();
		c2.deposit(2000);	//deposit more
		a2.start();
//		c1.deposit(2000);	//deposit more
//		c1.deposit(2000);	//deposit more
//		c2.deposit(-2000);	//deposit more
	}

}

class Account{
	long balance;//餘額
	
	public Account(long digits) {
		this.balance = digits;
	}
	
	public synchronized void deposit(long amount) { // 
		balance = balance + amount;
		System.out.println("After Deposit $"+amount+", Bank Balance :"+balance);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ATM extends Thread{
	long money=0;
	public ATM(long money) {
		this.money=money;
	}
		public void run() {
			for(int i=1;i<=(money/100);i++) {
				System.out.println("ATM is working.."+i+"times");
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("ATM has done its job.");
	}	
}