package date0202;

public class P1_extends_super {

	public static void main(String[] args) {
		B b = new B();   //�|�۰ʩI�s�����غc��
		B b2 = new B(1,2); //***��super(1,2)�j��I�s�������a�ѼƤ�k
		C c = new C(2,4);//***��super(1,2)�j��I�s�������a�ѼƤ�k

	}

}

class A{
	public int height, weight;
	A(){System.out.println("A");}
	A(int x, int y){
		System.out.println("X,Y ="+x+","+y);
	}
	A(int z){
		System.out.println("Z");
	}
}

class B extends A{
	B(){System.out.println("B");}
	B(int a, int b){
		super(a,b);
		super.height = 20;
		System.out.println("A+B &�@�I�s����A������height ="+height);
	}
	B(int n){
		System.out.println("N");
	}
}

class C extends B{
	C(){System.out.println("C()");}
	C(int a, int b){
		super(a,b);
		System.out.println("C(int a, int b)");
	}
	C(int n){
		System.out.println("int C");
	}
}
