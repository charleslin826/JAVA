package date0222;

public class P3_ThreadSleep {

	public static void main(String[] args) {
		Dtest dog= new Dtest("dog");
		Dtest cat= new Dtest("cat");
		dog.start();
		cat.start();

	}

}

class Dtest extends Thread {
	private String id;
	public Dtest(String str) {
		id =str;
	}
	
	public void run() {
		for(int i=0;i<4;i++) {
			try {
				int sec=(int)(10000*Math.random());
				sleep(sec);
				System.out.print("Sleep second:"+sec+"   ");
			}catch(InterruptedException e) {}
				System.out.println(id+" is running..");
			
		}
	}
}