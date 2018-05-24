package date0130;

public class P7_Extends {

	public static void main(String[] args) {
		CCircleYY yy = new CCircleYY(); //印出CCircleYY called.
		CCircleSon son = new CCircleSon();		//印出CCircleYY called.+CCircleSon called.
		CCirclegrandson gg= new CCirclegrandson();//印出CCircleYY called.+CCircleSon called.+CCirclegrandson called.
		son.setRadius(5.0);   //父與子類別都有setRadius的方法，且變數型態都一樣是double，所以以子類別的優先。 若子類別改成int 成輸入5.0自然會去呼叫父類別的，因為5.0不適用int而是double.
		son.show(); //因為沒有參數，呼叫到父類別裡面無參數的show() 印出YY Area =0.0
		son.show(5.0);// 印出Son Area =78.5
		gg.setson(); //印出Son !!!
		yy.show();//印出YY Area =0.0
	}

}


class CCircleYY{
		protected static double pi=3.14;
		private double radius;
		public CCircleYY() {
			System.out.println("CCircleYY called.");
		}
		public void setRadius(double r) {
			radius=r;
			System.out.println("Radius = "+ radius);
		}
		public void show() {
			System.out.println("YY Area ="+CCircleYY.pi*radius*radius);//CCircleYY.可換成this. ??
		}
	}
	
	
class CCircleSon extends CCircleYY{  //子類別
//	private double value;
	public CCircleSon() {
		System.out.println("CCircleSon called.");
	}
	public void setRadius(double v) {
		System.out.println("value = "+v);
	}
	public void setson() {
		System.out.println("Son !!!");
	}
	public void show(double value) {
		System.out.println("Son Area ="+pi*value*value);
	}
}	

class CCirclegrandson extends CCircleSon{ //孫類別 既可繼承父類別 又可繼承父父類別(因為父類別當中已經包含父父類別)
	public CCirclegrandson() {
		System.out.println("CCirclegrandson called.");
	}
}
	