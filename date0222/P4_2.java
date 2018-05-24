package date0222;

public class P4_2 {

	public static void main(String[] args) {
		Turtle turtle = new Turtle();
		Rabbit rabbit= new Rabbit();
		Thread r = new Thread(rabbit);//Since the start method belong to Thread (https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html)
		r.start();
		turtle.start();

	}

}

class AnimalcanJump {
	//this is a base class
}

class Turtle extends Thread{
	public Turtle(){}
	public void run() {
		for(int i=1;i<20;i++) {
			System.out.println("Turtle run "+i+" steps.");
		}
		System.out.println("Turtle hit target!");
	}
	
}



class Rabbit extends AnimalcanJump implements Runnable{
	public Rabbit(){}
	public void run() {
		for(int i=4;i<20;i+=4) {
			System.out.println("Rabbit run "+i+" steps.");
			int sec=(int)(1000*Math.random());               //If enable this block (rabbit sleep) then Turtle win.
			try {
				Thread.sleep(sec);  //if this class implements Runnable then this method need use "Thread.sleep" via Thread class
				System.out.print("Sleep second:"+sec+"   ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Rabbit hit target!");
	}		
}

