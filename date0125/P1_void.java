package date0125;

public class P1_void {

	public static void main(String[] args) {
		star();  //�Ĥ@�Ӥ�k
		System.out.println("Hello!");
		star2(10);		 //��2�Ӥ�k
	}
	
	public static void star() {    //�Ĥ@�Ӥ�k
		for(int i=1;i<=20;i++) {
			System.out.print("*");
	}
		System.out.println("");
	}
	
	public static int star2(int n) {  //��2�Ӥ�k
		for(int i=1;i<=2*n;i++) {
			System.out.print("*");
	}
		System.out.println("");
		return 2*n;//2*n������g�������Ƥ]�i�H
	}
	
	
}