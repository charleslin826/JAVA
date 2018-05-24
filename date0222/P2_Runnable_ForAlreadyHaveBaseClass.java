package date0222;
//This trick is for the situation of class already have a base class and can't extends Thread. 
public class P2_Runnable_ForAlreadyHaveBaseClass {

	public static void main(String[] args) {
		BTest dog= new BTest("dog");
		BTest cat= new BTest("cat");
		Thread t1 = new Thread(dog);
		Thread t2 = new Thread(cat);
//		dog.run;//if execute this right away then there will not have multiple threads
		t1.start();
		t2.start();

	}

}

class CABC{
	//This is base class.
}

class BTest extends CABC implements Runnable{
	private String id;
	public BTest (String str) {
		id=str;
	}
	public void run() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<100000000;j++) {
				System.out.println(id+" is running..");
			}
		}
	}
}
