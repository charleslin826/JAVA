package date0202;

public class P3_ClassExtends {

	public static void main(String[] args) {
//		double[] big=new double[2]; //�i�ٲ�
		Cshape shp[] = new Cshape[2]; //�w�qshp[]�ݩ�Cshape�����T�ӪŰ}�C
		shp[0]= new Ccircle(5.0);
		shp[1]= new Csquare(5,10);
		for(int i=0;i<shp.length;i++) {	//�L�X������
		System.out.println(shp[i].area()); //�I�s.area()��k
	}	
//		for(int i=0;i<shp.length;i++) {     //�i�ٲ�
//			big[i]=shp[i].area();       	//�i�ٲ�
//			System.out.println(big[i]);		//�i�ٲ�
//		}		

		double max=0;                  //�D�̤j��
		for(int i=0;i<shp.length;i++) {
			if(shp[i].area() > max) {
				max=shp[i].area();
				System.out.println("max ="+shp[i].area());
			}
		}

		


}
}
class Cshape{
	public double area() {  //�n���إߤ@�˪��ܼ� �å��w�]��0.0
		return 0.0;
	}
}

class Ccircle extends Cshape{
	double pi =3.14;
	double radius;

	Ccircle(double r) {
		radius = r;			
	}
	
	public double area() {  // ���ΦA�ǤJ�ѼơA�]���ۭq�غc�l�w�g�ǤJ
		return radius*radius*pi;   //***�B��area()��kreturn�^�ǭ� �~�i��j�p
	}

}

class Csquare extends Cshape{
	double length;
	double height;
	public Csquare(double i, double j) {
		length=i;
		height=j;
	}
	public double area() {		// ���ΦA�ǤJ�ѼơA�]���ۭq�غc�l�w�g�ǤJ
		return length*height;   //***�B�Φ���k�^�ǭ� �~�i�h��j�p
	}

}

