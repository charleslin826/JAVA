package date0207;

import java.util.Scanner;

//判斷是否為等腰直角三角形(兩個邊一樣但第三邊=開根號(a^2+b^2)，錯誤時顯示訊息，不會當機
public class T1_exception_throw {

	public static void main(String[] args) {
		double a,b;
		
		Scanner scn = new Scanner(System.in);		
		try {	
			System.out.print("請輸入等腰直角三角形的第一個邊(短邊):");
			a=scn.nextDouble();
			System.out.print("請輸入等腰直角三角形的第二個邊(短邊):");
			b=scn.nextDouble();
			
			if(a==b&&a>0) {
				System.out.println("等腰直角三角形的第三個邊為"+Math.sqrt(a*a+b*b));		
			}else if(a<0||b<0){
				throw new HelloTooNegative(); //使用自訂的繼承至Exception的函式
			}else{	
				throw new ArithmeticException(); //在函數的內部拋出例外用throw 
			}
		}catch(HelloTooNegative e) {
			System.out.println("Error:"+e.getMessage()); //這邊可使用三種下面自己定義的方法e / e.getM.. / e.showM..
		}catch(ArithmeticException e){
			System.out.print("throwed:非等腰直角三角形"); //System.out.print("算術錯誤:"+e);		
		}catch(RuntimeException e){
			System.out.print("輸入錯誤:"+e);
		}

	}

}


class HelloTooNegative extends Exception {
	public String toString() {
		return "Your input Error!";
	}
	public String getMessage() {
		return "Here is overidding the \"getMessage\".";
	}
	public String showMessage() {
		return "Here is the new Message.";
	}
	
}
