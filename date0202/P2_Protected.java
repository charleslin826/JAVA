package date0202;

public class P2_Protected {

	public static void main(String[] args) {
		DDD d = new DDD(1,2);
		d.show();
	}

}

class CCC{
	protected static double pi=3.14;
	protected double radius;
	private int gogo;
	CCC(double r){
		radius = r;
	}
	public void show() {
		System.out.println("Area = "+pi*radius*radius);
	}
}

class DDD extends CCC{
	int value;
	DDD(double r,int v) {
		super(r);//強制呼叫父項CCC(double r){radius = r;}  //若super()內無參數，則父項必須要建立一個空白的建構元EX:CCC(){};
		value =v;
//		gogo =2//因為在父項是private則無法取用 protect,public才可
	}
	public void show() { //覆寫overriding
		System.out.println("Radius = "+radius+"Value ="+value);
	}
		
}
	
	
	