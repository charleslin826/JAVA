package date0207;

public class Exception_throws {

	public static void aaa(int a, int b) throws ArithmeticException { //���w�n�Ѩ�ƩߥX�ҥ~�A�h�ϥΡuthrows�v 
		int sum =0;
		sum = a/b;
		System.out.println("sum = "+sum);
	}
		
	public static void main(String[] args) {		
		try {
			aaa(10,0);
		}catch(ArithmeticException e) {
			System.out.println("Error!");
		}				
	}
}


