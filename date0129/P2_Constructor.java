package date0129;

public class P2_Constructor {

	public static void main(String[] args) {
//		CCircle cir1 = new CCircle();
		CCircle cir2 = new CCircle(4.0);
//		cir1.show();
		cir2.show();
		
		

	}

}

class CCircle{
	private double pi=3.14;
	private double radius;
	
//	public CCircle(){ //�غc�����h���A���a�Ѽƪ���k
//		this.radius = 10;  //���Ы�class�� JAVA�N�|�w�]�Ыؤ@�Ӥ��a�Ѽƪ�constructor�A�ҥH�Y����J�o��constructor�]�i�H�]�A�u�O�S�������(��)��
//	}
//	
	public CCircle(double radius){ //constructor(�غc��) //�Y�e���L�]�wpublic �h�u��O�o��package�s���Ӥw�C���]�w���ܫh�i�H"��package"�s��!
		this.radius = radius;
	}
	

//	CCircle(double pi, double radius) { //�o�ӬO�z�L"Source>Generate constructor using field..."�Ыت�(����eclipse ���F�i�H�֥��r)
//		super();
//		this.pi = pi;
//		this.radius = radius;
//	}
	
	public void show() {
		System.out.println("Area ="+ this.pi*this.radius*this.radius);
	}
	
}
