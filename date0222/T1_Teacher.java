package date0222;

public class T1_Teacher {

	public static void main(String[] args) {
				Account0 account = new Account0(5000);
				ATM0 a1 = new ATM0(account, -1000);
				ATM0 a2 = new ATM0(account, 2000);
				ATM0 a3 = new ATM0(account, -9000);				
				a1.start();	
				a2.start();
				a3.start();				
		}
}
		class Account0 {
			long balance;

			public Account0(long balance) {
				this.balance = balance;
			}

			public synchronized void deposit(long amount) {

				long d_balance;
				d_balance = this.balance;
				System.out.println("餘額 = " + d_balance);
				if (amount >= 0) {
					System.out.println("存款增加 = " + amount);
				} else {
					System.out.println("存款減少 = " + amount);
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e){
				e.printStackTrace();}
				
				d_balance += amount;
				this.balance = d_balance;
				if (d_balance >= 0) {
					System.out.println("帳戶餘額= " + this.balance);					
				} else {
					System.out.println("餘額不足 " + this.balance);					
				}
				
			}

		}

		class ATM0 extends Thread {
			long money;
			Account0 a0;

			public ATM0(Account0 ac, long n) {
				this.a0 = ac;
				this.money = n;
			}

			public void run() {
				a0.deposit(money);
			}

		}