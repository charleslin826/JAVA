package date0130;

public class P8_Extends2 {

	public static void main(String[] args) {	
		Son sss= new Son(5.0,"S");
		System.out.println(sss.toString()); //印出(package).(class)@(記憶體位址)
		
	}

}

class Father{
//	private static double pi=3.141;
	private double radius;
	
	public Father() {
		System.out.println("Father called.");
}
	
	public Father(double r) {
			radius =r;
			System.out.println("Radius = "+radius);
			System.out.println("Father(r) called.");
	}
	
	public Father(double r,String y) {
		radius =r;
		System.out.println("Father Radius = "+radius);
		System.out.println("Father String = "+y);
		System.out.println("Father(r,y) called.");

}

	
}

class Son extends Father{

	public Son() {
		
	}
	
	public Son(double r) {		
		super(r);
	}
	
	public Son(double r,String y) {
		super(r,y); //強迫呼叫父類別
		System.out.println("Son(r,y) called.");
	}
	
}
