package date0202;

public class P3_ClassExtends {

	public static void main(String[] args) {
//		double[] big=new double[2]; //可省略
		Cshape shp[] = new Cshape[2]; //定義shp[]屬於Cshape中的三個空陣列
		shp[0]= new Ccircle(5.0);
		shp[1]= new Csquare(5,10);
		for(int i=0;i<shp.length;i++) {	//印出全部值
		System.out.println(shp[i].area()); //呼叫.area()方法
	}	
//		for(int i=0;i<shp.length;i++) {     //可省略
//			big[i]=shp[i].area();       	//可省略
//			System.out.println(big[i]);		//可省略
//		}		

		double max=0;                  //求最大值
		for(int i=0;i<shp.length;i++) {
			if(shp[i].area() > max) {
				max=shp[i].area();
				System.out.println("max ="+shp[i].area());
			}
		}

		


}
}
class Cshape{
	public double area() {  //要先建立一樣的變數 並先預設為0.0
		return 0.0;
	}
}

class Ccircle extends Cshape{
	double pi =3.14;
	double radius;

	Ccircle(double r) {
		radius = r;			
	}
	
	public double area() {  // 不用再傳入參數，因為自訂建構子已經傳入
		return radius*radius*pi;   //***運用area()方法return回傳值 才可比大小
	}

}

class Csquare extends Cshape{
	double length;
	double height;
	public Csquare(double i, double j) {
		length=i;
		height=j;
	}
	public double area() {		// 不用再傳入參數，因為自訂建構子已經傳入
		return length*height;   //***運用此方法回傳值 才可去比大小
	}

}

