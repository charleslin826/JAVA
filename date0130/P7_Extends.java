package date0130;

public class P7_Extends {

	public static void main(String[] args) {
		CCircleYY yy = new CCircleYY(); //�L�XCCircleYY called.
		CCircleSon son = new CCircleSon();		//�L�XCCircleYY called.+CCircleSon called.
		CCirclegrandson gg= new CCirclegrandson();//�L�XCCircleYY called.+CCircleSon called.+CCirclegrandson called.
		son.setRadius(5.0);   //���P�l���O����setRadius����k�A�B�ܼƫ��A���@�ˬOdouble�A�ҥH�H�l���O���u���C �Y�l���O�令int ����J5.0�۵M�|�h�I�s�����O���A�]��5.0���A��int�ӬOdouble.
		son.show(); //�]���S���ѼơA�I�s������O�̭��L�Ѽƪ�show() �L�XYY Area =0.0
		son.show(5.0);// �L�XSon Area =78.5
		gg.setson(); //�L�XSon !!!
		yy.show();//�L�XYY Area =0.0
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
			System.out.println("YY Area ="+CCircleYY.pi*radius*radius);//CCircleYY.�i����this. ??
		}
	}
	
	
class CCircleSon extends CCircleYY{  //�l���O
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

class CCirclegrandson extends CCircleSon{ //�]���O �J�i�~�Ӥ����O �S�i�~�Ӥ������O(�]�������O���w�g�]�t�������O)
	public CCirclegrandson() {
		System.out.println("CCirclegrandson called.");
	}
}
	