package date0130;

public class P1_StaticClassMethod {

	public static void main(String[] args) {
		
		CCircle2.show_count();   //��u����J[CCircle2.]���ɭԺ��F�u�|�]�X��show_count()�A���Υt�~�إߪ���A�]�����O���O�ܼơC
		CCircle2 cir2 = new CCircle2(1.0);
		System.out.println("****�ڭ̫إ�(�ŧi)�F����õ����ѼƨϥΥ�CCircle2 cir2 = new CCircle2(1.0)***");
		CCircle2.show_count();
		cir2.show();  //�p���~��I�sshow()��Ҩ�ơA��M�]�i�H�I�s���O��ơA�Ҧpcir2.show_count();�]�O�i�H�Φ��O�ɶq���n�C		 				
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
	
	public static int show_count() {  //���O�禡(��)(class method)
		System.out.println(count+ " objects created");
		System.out.println("radius ="+radius);//�bstatic�̭������this
		return count;
	}
	
	public  void show() {  //��Ҩ禡(��)(Instance method)
		System.out.println("Area = "+ pi*radius*radius);
	}
	
	
}