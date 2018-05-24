package date0222;

public class P7_synchronized {

	public static void main(String[] args) {
		CCustomer c1 =new CCustomer();
		CCustomer c2 =new CCustomer();
		c1.start();
		c2.start();
	}

}

class CBank{
	private static int sum =0;
	public synchronized static void add(int n) { //加上synchronized 才不會兩個執行續爭相使用add導致結果有誤
		int tmp=sum; //延續之前累加的sum值繼續加累加
		tmp=tmp+n;
		try {
			Thread.sleep((int)(1000*Math.random()));
		} catch (InterruptedException e) {};
		sum=tmp;
		System.out.println("sum ="+sum);	
	}
}

class CCustomer extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			CBank.add(100);
		}
	}
}