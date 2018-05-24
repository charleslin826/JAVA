package date0130;

public class P1_StaticClassMethod {

	public static void main(String[] args) {
		
		CCircle2.show_count();   //當只有輸入[CCircle2.]的時候精靈只會跑出來show_count()，不用另外建立物件，因為它是類別變數。
		CCircle2 cir2 = new CCircle2(1.0);
		System.out.println("****我們建立(宣告)了物件並給予參數使用它CCircle2 cir2 = new CCircle2(1.0)***");
		CCircle2.show_count();
		cir2.show();  //如此才能呼叫show()實例函數，當然也可以呼叫類別函數，例如cir2.show_count();也是可以用但是盡量不要。		 				
	}
}

class CCircle2{
	private static double pi =3.14;
	private static int count =0;
	private static double radius;
	
	public CCircle2() {
		this(4.0);
	}
	
	public CCircle2(double r) {
		radius = r;
		count ++;
	}
	
	public static int show_count() {  //類別函式(數)(class method)
		System.out.println(count+ " objects created");
		System.out.println("radius ="+radius);//在static裡面不能用this
		return count;
	}
	
	public  void show() {  //實例函式(數)(Instance method)
		System.out.println("Area = "+ pi*radius*radius);
	}
	
	
}