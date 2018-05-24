package date0118;

public class T3 {

	public static void main(String[] args) {
		// 求1~100所有整數平方值的總和
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum = sum + i*i;

		}
		System.out.print("sum="+sum);
	}

}
