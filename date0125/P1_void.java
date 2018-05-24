package date0125;

public class P1_void {

	public static void main(String[] args) {
		star();  //第一個方法
		System.out.println("Hello!");
		star2(10);		 //第2個方法
	}
	
	public static void star() {    //第一個方法
		for(int i=1;i<=20;i++) {
			System.out.print("*");
	}
		System.out.println("");
	}
	
	public static int star2(int n) {  //第2個方法
		for(int i=1;i<=2*n;i++) {
			System.out.print("*");
	}
		System.out.println("");
		return 2*n;//2*n直接改寫成任何整數也可以
	}
	
	
}