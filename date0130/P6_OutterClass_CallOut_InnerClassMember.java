package date0130;

public class P6_OutterClass_CallOut_InnerClassMember {
	
	public static void main(String[] args) {
		CBox box=new CBox(2,3,4,"Blue");
		box.show();

	}
}

class CBox{									//OutterClass
	private int length;
	private int width;
	private int height;
	private CColor cr;    //�إ�CColor���O������cr
	
	public CBox(int l,int w,int h,String col) {   //�qmain�I�s�oConstructor [CBox box=new CBox(2,3,4,"Blue");]
		length=l;
		width=w;
		height=h;
		cr=new CColor(col);        				//��new�إ�CColor����(�ǥ�CColor�������O)
	}
	class CColor{								//Inner Class
		private String color;
		public CColor(String clr) {				//CColor�غc��
			color=clr;
		}
		public void show_color() {
			System.out.println("color = "+color);
		}		
	}
	public void show() {						//OutterClass CBox����Ʀ���(method member) = Instance method (�]���S���[static,���Oclass method���O���)
		System.out.println("length = "+length);
		System.out.println("width = "+width);
		System.out.println("height = "+height);
		cr.show_color();				
	}
	
}


