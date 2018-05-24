package date0222;

public class P4_Thread_in_Main {

	public static void main(String[] args) {
		Thread turtle = new Thread() {
			public void run() {
				for(int i=1;i<20;i++) {
					System.out.println("Turtle run "+i+" steps.");
				}
				System.out.println("Turtle hit target!");
			}		
	};
		Thread rabbit = new Thread() {
			public void run() {
				for(int i=4;i<20;i+=4) {
					System.out.println("Rabbit run "+i+" steps.");
//					int sec=(int)(1000*Math.random());               //If enable this block (rabbit sleep) then Turtle win.
//					try {
//						sleep(sec);
//						System.out.print("Sleep second:"+sec+"   ");
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
					
				}
				System.out.println("Rabbit hit target!");
			}		
	};
	rabbit.start();
	turtle.start();
	
	
}

}