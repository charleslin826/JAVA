package date0129;

public class P1_newClass { //CalculateCircle//
	double pi=3.14;
	double radius;
	void show_area() {
		System.out.println("CIRCLE AREA = pi*radius*radius ="+pi*radius*radius);
	}
	
	void area_all() {
		System.out.println("radius ="+radius);
		show_area();
	}
	
	void setRadius(double r) { //***���B��radius�i��@���K���~�׼��������A���Q���O�H���D�A
		radius = r;           //�ҥH�������Lr�������d��(public)�i�H���ΡA���O���������}�A�H���ඡ���覡�ϥΡC		
	}						//�o�N�O����ƶǻ��޼ơ�
	
	void setCircle(double p,double r) {
		pi=p;
		radius=r;
	}
	
}
