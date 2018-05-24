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
	
//	public CCircle(){ //篶Α更ぃ盿把计よ猭
//		this.radius = 10;  //ㄤ龟承class JAVA碞穦箇砞承ぃ盿把计constructor┮璝ぃ块硂constructor禲琌⊿Τヴま(把)计
//	}
//	
	public CCircle(double radius){ //constructor(篶じ) //璝玡礚砞﹚public 玥琌硂packageτΤ砞﹚杠玥"阁package"!
		this.radius = radius;
	}
	

//	CCircle(double pi, double radius) { //硂琌硓筁"Source>Generate constructor using field..."承(到ノeclipse 弘艶ぶゴ)
//		super();
//		this.pi = pi;
//		this.radius = radius;
//	}
	
	public void show() {
		System.out.println("Area ="+ this.pi*this.radius*this.radius);
	}
	
}
