package date0222;

public class P5_join {

	public static void main(String[] args) {
		Etest dog= new Etest("dog");
		Etest cat= new Etest("cat");
		dog.start();
		try {	
		dog.join(); //Must wait dog finished then cat run.
		cat.start();
		cat.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
}
		System.out.println("Main Finished.");
	}
}
	
class Etest extends Thread {
	private String id;
	public Etest(String str) {
		id =str;
	}
	
	public void run() {
		for(int i=0;i<4;i++) {
			try {
				int sec=(int)(1000*Math.random());
				sleep(sec);
				System.out.print("Sleep second:"+sec+"   ");
			}catch(InterruptedException e) {}
				System.out.println(id+" is running..");			
		}
		System.out.println("Hit the target.");
	}
}



