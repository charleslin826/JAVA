package date0130;

public class P2_Compare {

	public static void main(String[] args) {
		Circlex cir1 =new Circlex(1.0);
		Circlex cir2 =new Circlex(3.0);
		cir1.compare(cir2);
		
		/////////////////////
		String x="AAA",y="BBB";
		boolean status;
		status = x.equals(y);
		System.out.println(status);
	}

}


class Circlex{
//	private static double pi=3.14;   //Class variable類別變數(有static)
	private double radius;			//Instance variable(無static)
	public Circlex(double r){		//Instance method
		radius=r;
	}
	public void compare(Circlex cir) { //Instance method
		if(this.radius==cir.radius) {
			System.out.println("Same!");
		}else {
			System.out.println("Different!");
		}
	}
	

	
}