package date0202;

public class P4_Final_extend {

	public static void main(String[] args) {
		Cbbb bbb =new Cbbb();
		bbb.show();
//		bbb.radius =20;//會跑出錯誤，因為radius加了final所以不能改值了，除非把final拿掉
		System.out.println(bbb.radius);
		Caaa a =new Caaa();  
		Class ca=a.getClass();//getClass() 會傳回Class型態的物件，因此ca也要宣告成Class型態
		System.out.println("Caaa of obj ="+ca);
	}

}

class Caaa{
	final int radius =200;
	public void show() {
		System.out.println("Caaa show called.");
	}
}

class Cbbb extends Caaa{
	public void show() {
		System.out.println("Cbbb show called.");
	}
}
