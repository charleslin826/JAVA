package date0222;

public class P1_Thread {

	public static void main(String[] args) {
		Ctest dog= new Ctest("dog");
		Ctest cat= new Ctest("cat");
		dog.start();
		cat.start();

	}

}

class Ctest extends Thread {
	private String id;
	public Ctest(String str) {
		id =str;
	}
	
	public void run() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<100000000;j++) {
				System.out.println(id+" is running..");
			}
		}
	}
}