package date0202;

public class P5_Abstract {

	public static void main(String[] args) {
	X x = new X();
	x.show();
	Y y = new Y();
	y.show();

	}

}

abstract class Base{  //�إߤ@�Ө�L���O���n��u���W�h/��V/�˪O
	protected String color;
	public void setColor(String str) {
		color = str;
	}
	public abstract void show();  //���μg{��k}�A�ӬO�~�Ӧ���H���O�����O�ݭn��@(implement)����k(method)(�]��O@Override�мg)
}    							//public abstract �]�i�ٲ�

class X extends Base{
	
	@Override
	public void show() {
		System.out.println("X Class print.");		
	}

		
}

class Y extends Base{
	
	@Override
	public void show() {
		System.out.println("Y Class print.");		
	}

		
}

interface iShape3D{  //interface�]�i�H���b�o�� //�Y�n���ɵ���L package�e���ݥ[public
	
}

