package date0207.sales;

import date0207.sales.department1.S_D_1;//也可以直接引入

public class SameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date0207.sales.department1.SameTest Print = new date0207.sales.department1.SameTest(); //或是直接宣告物件
		S_D_1 ttt = new S_D_1();//引入後直接以class名稱宣告物件
		System.out.println(Print);
		System.out.println(ttt);
		
	}

}

