package date0207;

import java.io.IOException;

public class Exception_2 {

	public static void main(String[] args) {
		int[] myarray = new int[10];
		
		try {
			myarray[5] =120; //若5改成15就會跑第1個catch
			int test = 120/5;  //ok 若除0則跑第2個catch
			int n =Integer.parseInt("Are you OK?");//英文字串無法分解成整數 (數字字串才行) 跑第3個catch
		}catch(ArrayIndexOutOfBoundsException e){ //陣列錯誤時
			System.out.println("例外的內容:" + e.toString());
			System.out.println("陣列範圍超出");
		}catch(ArithmeticException e){  //算術錯誤時
			System.out.println("例外的內容:" + e.toString());
			System.out.println("數學運算錯誤");
		}catch(Exception e){   //運行錯誤時
			System.out.println("例外的內容:" + e.toString());
			System.out.println("發生錯誤");
		}		
		
		System.out.println("程式執行完畢");	
		
	}

}
