package date0222;
//throw and pickup 5 time by order
public class T3_Thread_join {

	public static void main(String[] args) {
		Frisbee F = new Frisbee();
		Thread a = new Thread(new TF(F));
		Thread b = new Thread(new AF(F));
		a.start();
		b.start();

	}

}


class Frisbee{ //飛盤
	private boolean isThrow = false;
	public synchronized void throwF(int tno) {
		while(isThrow) {
			try {
				wait();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
		System.out.println("Throw "+tno);
		isThrow = true;
		notify();
	}
	public synchronized void access(int ano) {
		while(!isThrow) { //isThrow = false will do
			try {
				wait();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
		System.out.println("PickUp "+ano);
		isThrow = false;
		notify();
	}	
}

class TF implements Runnable{
	Frisbee f; // put class Frisbee into this class for use, so the forloop can use Frisbee's method(throwF)
	public TF(Frisbee f) {//deliver object to this.f
		this.f = f; 
	}
	//@Override
	public void run() {		
		for(int i=1;i<=5;i++) {
			f.throwF(i);
		}
	}	
}

class AF implements Runnable{
	Frisbee f; // put class Frisbee into this class for use, so the forloop can use Frisbee's method(access)
	public AF(Frisbee f) {
		this.f = f; //deliver object to this.f
	}
	//@Override
	public void run() {		
		for(int i=1;i<=5;i++) {
			f.access(i);
		}
	}
	
}