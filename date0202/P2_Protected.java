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
		super(r);//�j��I�s����CCC(double r){radius = r;}  //�Ysuper()���L�ѼơA�h���������n�إߤ@�Ӫťժ��غc��EX:CCC(){};
		value =v;
//		gogo =2//�]���b�����Oprivate�h�L�k���� protect,public�~�i
	}
	public void show() { //�мgoverriding
		System.out.println("Radius = "+radius+"Value ="+value);
	}
		
}
	
	
	