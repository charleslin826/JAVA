package date0202;

public class P4_Final_extend {

	public static void main(String[] args) {
		Cbbb bbb =new Cbbb();
		bbb.show();
//		bbb.radius =20;//�|�]�X���~�A�]��radius�[�Ffinal�ҥH�����ȤF�A���D��final����
		System.out.println(bbb.radius);
		Caaa a =new Caaa();  
		Class ca=a.getClass();//getClass() �|�Ǧ^Class���A������A�]��ca�]�n�ŧi��Class���A
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
