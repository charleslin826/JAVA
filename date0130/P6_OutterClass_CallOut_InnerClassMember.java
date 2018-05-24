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
	private CColor cr;    //建立CColor類別的物件cr
	
	public CBox(int l,int w,int h,String col) {   //從main呼叫這Constructor [CBox box=new CBox(2,3,4,"Blue");]
		length=l;
		width=w;
		height=h;
		cr=new CColor(col);        				//用new建立CColor物件(藉由CColor內部類別)
	}
	class CColor{								//Inner Class
		private String color;
		public CColor(String clr) {				//CColor建構元
			color=clr;
		}
		public void show_color() {
			System.out.println("color = "+color);
		}		
	}
	public void show() {						//OutterClass CBox的函數成員(method member) = Instance method (因為沒有加static,不是class method類別函數)
		System.out.println("length = "+length);
		System.out.println("width = "+width);
		System.out.println("height = "+height);
		cr.show_color();				
	}
	
}


