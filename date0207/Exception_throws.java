package date0207;

public class Exception_throws {

	public static void aaa(int a, int b) throws ArithmeticException { //指定要由函數拋出例外，則使用「throws」 
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


