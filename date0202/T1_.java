package date0202;
/*ƒÜ	¦³¤@CTriÃþ§O¡A¥Î¨Óªí¥Ü¤T¨¤§Î¡A¸ê®Æ¦¨­û¤Î¤èªk¦¨­û¦p¤U¡G
class Ctri{
	protected int base;
	protected int height;
	protected void show(){
		System.out.println(¡§base = "+ base +",height="+height);
}
}
°Ý¡G
1.	½Ð«Ø¥ßCDataÃþ§O¡AÄ~©ÓCTriÃþ§O
2.	¦bCDataÃþ§O¥[¤Jarea()¤èªk¡A¥i¥H§Q¥Îshow()¦L¥X¤T¨¤§Îªºbase¤Îheight¦¨­û¤Î­±¿n
3.	½Ð©ómain()¥[¤J
	CData obj = new CData(3,8);
	obj.area();
¨Ï±oµ{¦¡¥i¥H²£¥Í¥H¤Uµ²ªG
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







