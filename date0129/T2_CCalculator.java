package date0129;

public class T2_CCalculator {  

	public static void main(String[] args) {
		CCalculator CC = new CCalculator(); 
		CC.set_value(10, 20, 30);//定義Set_value方法來設定資料成員(x,y,z)之值 其實就是
		//(a,b,c)但我們這邊要練習這個定義方法(Set_value)所以繞了一圈 其實一樣
		CC.show();	
		System.out.println("a-b-c ="+CC.sub());
		System.out.println("a+b+c ="+CC.add());
		System.out.println("a*b*c ="+CC.mul());
		System.out.println("(a+b+c)/3 ="+CC.avg());

		

	}

}

