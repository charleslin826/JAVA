package date0118;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// 輸入某整數判斷是否為質數 (除1與本身能整除其餘均不能只除它) 
		boolean isPrime=true;
		Scanner scn = new Scanner(System.in);
		System.out.print("Please input any integer to see if it is a prime:\n");
		int n = scn.nextInt();
		for(int i=2;i<n;i++){  // 從2開始除以該數，直到該數前一個數
			if(n%i ==0) {  //若整除 [例如91，除到7&13的時候7*13=91 餘數為0 則isPrime從true被改為false了]
			isPrime=false; //不是質數
			break; //有false就停止，速度比較快
		} 
		}if (isPrime == false) {  
			System.out.print("It's not prime.\n");
		} else {
			System.out.print("It's prime.\n");}   // EX:"15872953"
		scn.close();
}
}