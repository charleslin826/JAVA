package date0202;
/*��	���@CTri���O�A�ΨӪ�ܤT���ΡA��Ʀ����Τ�k�����p�U�G
class Ctri{
	protected int base;
	protected int height;
	protected void show(){
		System.out.println(��base = "+ base +",height="+height);
}
}
�ݡG
1.	�Ыإ�CData���O�A�~��CTri���O
2.	�bCData���O�[�Jarea()��k�A�i�H�Q��show()�L�X�T���Ϊ�base��height�����έ��n
3.	�Щ�main()�[�J
	CData obj = new CData(3,8);
	obj.area();
�ϱo�{���i�H���ͥH�U���G
base = 3, height =8
area = 12.0

*/
public class T1_ {

	public static void main(String[] args) {
		CData obj = new CData(3,8);
		obj.area();

		
	}

}

class Ctri{
	protected int base;
	protected int height;
	protected void show(int a, int b){
		System.out.println("base = "+ base +",height="+height);
}
}

class CData extends Ctri{
	int	area;
	public CData(int a, int b) {
		super.base =a;
		super.height =b;
		super.show(a,b);		
	}

	void area() {	
		System.out.println("area = "+(double)base * height/2);
	}

}







