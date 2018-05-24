package date0202;

public interface iShape2D { //若要分享給其他 package前面需加public
	final double pi=3.14; //final可省略 //AShape繼承了CCC 所以此行可以省略了
	abstract void area(); //abstract可省略
	
	
}

interface iShape1D{
	int length =10;
	void show();
	
	
}
class AShape /*extends CCC*/ implements iShape2D,iShape1D { //可以用","使用兩個以上的介面  //也可以同時繼承P2_的CCC
	double radius;							//此可算是封裝/繼承/多型(但仍需實作出來=overriding the method)
	
	AShape(double r){ 
		radius = r; //繼承後是rsuper(r)
	}
	@Override
	public void area() {
		System.out.println("Area ="+pi*radius*radius);
		
	}
	@Override
	public void show() {
		System.out.println("Show(radius*radius) ="+radius*radius);
		
	}
	
}

class BShape extends AShape{

	BShape(double r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	
}