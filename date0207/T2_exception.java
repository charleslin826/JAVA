package date0207;

import java.util.Scanner;

//輸入n1 n2 相除 非整除或除數為0 顯示錯誤
public class T2_exception {

	public static void main(String[] args) {
		int n1,n2;
			math_div(1,0);
		
		try {
			Scanner scn = new Scanner(System.in);
			System.out.print("請輸入要相除的數字:");
			n1=scn.nextInt(); //將所輸入的值轉成整數 若輸入小數點會跑出java.lang.NumberFormatException:
			System.out.print("請輸入要相除的數字:");
			n2=scn.nextInt();
			if(n1==0||n2==0) {
				throw new ArithmeticException();
			}else {
				System.out.println(n1+" / "+n2+" = "+n1/(double)n2);
			}			
		}catch(ArithmeticException e) {  
			System.out.print("數值算術錯誤，原因:"+e);  //當5/0會跑出來??
		}catch(RuntimeException e) {  
			System.out.print("輸入錯誤，原因:"+e.getMessage()); //  當5/2.5(非整數)會跑出來			
		}finally {
			System.out.print("\n程式結尾");			
		}			
	}	


	static void math_div(int n1, int n2) throws ArithmeticException {
		int div =0;
		try {
			div = n1/n2;
			System.out.println("Result ="+div);
		}catch(ArithmeticException e) {
			System.out.println("e = "+e);
		}
	}

}