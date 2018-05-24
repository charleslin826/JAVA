package date0130;

public class P3_ObjectArray_classV_and_InstanceV {

	public static void main(String[] args) {
		Circlex2 cir[]= new Circlex2[3]; //建立三個物件
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
	private double radius;	 //若將此實例變數改為static 則印出結果都會變radius=3 因為「類別變數」是由所有的物件共享，
	//所以一但修改了就會全部都改變 如上方呼叫cir[i]=new Circlex2(i+1.0); 當帶入i=2+1.0=3的時候，接著cir[j].show();取用radius時就都會是3
	//不像「實例變數」是各別物件所有，彼此之間不能共享
	public Circlex2(double r) {
		radius = r;
	}
	
//	public Circlex2() {
//	this(4.0);
//}
	
	public  void show() {  //實例函式(數)(Instance method)
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
