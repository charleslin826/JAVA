package date0222;

public class P6_Priority {

	public static void main(String[] args) {
		Ftest dog= new Ftest("dog");
		Ftest cat= new Ftest("cat");
		dog.setPriority(Thread.MIN_PRIORITY);
		cat.setPriority(10);
		dog.start();
		cat.start();
	}
}

class Ftest extends Thread {
	private String id;
	public Ftest(String str) {
		id =str;
	}
	
	public void run() {
		for(int i=0;i<4;i++) {
			try {
				int sec=(int)(1000*Math.random());
				sleep(sec);
				System.out.print("Sleep second:"+sec+"   ");
			}catch(InterruptedException e) {}
				System.out.println(id+" is running..Priority = "+this.getPriority());
		}
	}
}