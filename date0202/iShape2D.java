package date0202;

public interface iShape2D { //�Y�n���ɵ���L package�e���ݥ[public
	final double pi=3.14; //final�i�ٲ� //AShape�~�ӤFCCC �ҥH����i�H�ٲ��F
	abstract void area(); //abstract�i�ٲ�
	
	
}

interface iShape1D{
	int length =10;
	void show();
	
	
}
class AShape /*extends CCC*/ implements iShape2D,iShape1D { //�i�H��","�ϥΨ�ӥH�W������  //�]�i�H�P���~��P2_��CCC
	double radius;							//���i��O�ʸ�/�~��/�h��(�����ݹ�@�X��=overriding the method)
	
	AShape(double r){ 
		radius = r; //�~�ӫ�Orsuper(r)
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