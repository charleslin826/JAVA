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
	
	void setRadius(double r) { //***此處的radius可當作隱密的年終獎金公式，不想給別人知道，
		radius = r;           //所以指派給他r讓公眾範圍(public)可以取用，但是公式不公開，以輾轉間接方式使用。		
	}						//這就是“函數傳遞引數”
	
	void setCircle(double p,double r) {
		pi=p;
		radius=r;
	}
	
}
