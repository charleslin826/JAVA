package date0202;

public class P5_Abstract {

	public static void main(String[] args) {
	X x = new X();
	x.show();
	Y y = new Y();
	y.show();

	}

}

abstract class Base{  //建立一個其他類別都要遵守的規則/方向/樣板
	protected String color;
	public void setColor(String str) {
		color = str;
	}
	public abstract void show();  //不用寫{方法}，而是繼承此抽象類別的類別需要實作(implement)此方法(method)(也算是@Override覆寫)
}    							//public abstract 也可省略

class X extends Base{
	
	@Override
	public void show() {
		System.out.println("X Class print.");		
	}

		
}

class Y extends Base{
	
	@Override
	public void show() {
		System.out.println("Y Class print.");		
	}

		
}

interface iShape3D{  //interface也可以做在這裡 //若要分享給其他 package前面需加public
	
}

