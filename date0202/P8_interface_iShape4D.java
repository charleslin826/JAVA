package date0202;

public class P8_interface_iShape4D {

	public static void main(String[] args) {
		OK oo = new OK(2.0);  //傳入半徑值到OK的建構元中的radius成員變數
		oo.setColor("Green"); //傳入"Green"到setColor方法中的color成員變數
		oo.area();  //計算(radius * radius *pi)圓面積 並且印出來

	}

}

interface iShape4D{
	final double pi=3.14;
	abstract void setColor(String str);
}

interface iShape5D extends iShape4D{  //5D介面繼承4D介面
	abstract void area();
}



class OK implements iShape5D{  //OK繼承5D(當然包含4D)介面裡的成員與抽象方法

	double radius;
	String color;
	
	public OK(double r) { //建構元被執行時，設定半徑
		radius=r;  //this.radius就是表示取用公用的成員變數，此處也可省略this.
	}
	@Override
	public void setColor(String str) {  //此方法藏在4D interface中，若註解沒寫很難發覺在哪邊
		color=str;
		
	}

	@Override
	public void area() {				//此方法藏在5D interface中，若註解沒寫很難發覺在哪邊
		// TODO Auto-generated method stub
		System.out.println("Color ="+ this.color);
		System.out.println("Area ="+ radius * radius *pi);
	}
	
}