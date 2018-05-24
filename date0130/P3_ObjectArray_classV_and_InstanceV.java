package date0130;

public class P3_ObjectArray_classV_and_InstanceV {

	public static void main(String[] args) {
		Circlex2 cir[]= new Circlex2[3]; //�إߤT�Ӫ���
		for(int i=0; i<cir.length;i++) {
			cir[i]=new Circlex2(i+1.0);
		}
		for(int j=0; j<cir.length;j++) {
			cir[j].show();
		}
///////////////////////////////////////////////////////////////////
		System.out.println("Largest radius = "+Circlex2.compare2(cir));
	}

}

class Circlex2{
	
	private static double pi =3.14;	
	private double radius;	 //�Y�N������ܼƧאּstatic �h�L�X���G���|��radius=3 �]���u���O�ܼơv�O�ѩҦ�������@�ɡA
	//�ҥH�@���ק�F�N�|���������� �p�W��I�scir[i]=new Circlex2(i+1.0); ��a�Ji=2+1.0=3���ɭԡA����cir[j].show();����radius�ɴN���|�O3
	//�����u����ܼơv�O�U�O����Ҧ��A������������@��
	public Circlex2(double r) {
		radius = r;
	}
	
//	public Circlex2() {
//	this(4.0);
//}
	
	public  void show() {  //��Ҩ禡(��)(Instance method)
		System.out.println("Radius = "+radius);
		System.out.println("Area = "+ pi*radius*radius);
	}


	public void compare(Circlex2 cir) { //Instance method
		if(this.radius==cir.radius) {
			System.out.println("Same!");
		}else {
			System.out.println("Different!");
		}
	}

///////////////////////////////////////////////////////////////////
	public static double compare2(Circlex2 cir[]) { //Class method
		double max=0.0;
		for(int i=0; i<cir.length;i++) {
			if(cir[i].radius>max) { 
				max=cir[i].radius;
			}						
		}
		return max;
		
		
	}

	
}
