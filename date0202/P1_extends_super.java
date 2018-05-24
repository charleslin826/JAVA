package date0202;

public class P1_extends_super {

	public static void main(String[] args) {
		B b = new B();   //會自動呼叫父項建構元
		B b2 = new B(1,2); //***用super(1,2)強制呼叫父項的帶參數方法
		C c = new C(2,4);//***用super(1,2)強制呼叫父項的帶參數方法

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
		System.out.println("A+B &　呼叫父項A的成員height ="+height);
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
