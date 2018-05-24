package date0129;

public class P1_Main {

	public static void main(String[] args) {
		Crectangle rect1 = new Crectangle();  //呼叫父類別並定義子類別 [宣告與建立物件]
		rect1.height =25;
		rect1.width = 35;
		rect1.area();
//		System.out.println("PERI ="+rect1.peri()); 因為呈現方法(println)加入peri()中，所以改成直接呼叫peri()如下
		rect1.peri();
		System.out.println("長方形高 ="+rect1.height);
		System.out.println("長方形寬 ="+rect1.width);	
		
		P1_newClass cir1 = new P1_newClass();  //CalculateCircle//
		cir1.radius=20; //呼叫P1_newClass的radius(資料成員)
		//cir1.area();	//呼叫P1_newClass的area(函數成員/方法) 其計算方法(圓形)和下面的Crectangle(長方形)不一樣
		cir1.area_all(); //後來加上的這個方法裡面已經包含上面的方法'area()'，精簡程式碼!
		cir1.setCircle(3.1416, 2.0);	//重設circle的pi & 半徑
		cir1.area_all();
	}	
}

class Crectangle {  //沒有加"()"因為不是方法 只是類別(名稱)!!  //類別是由'資料成員'與'函數成員'封裝而成
	int width;//'資料成員'
	int height;//'資料成員'
	/*下面method的type原本是int有回傳(return)值，但現在把印出功能println直接放在Crectangle方法裡面 所以改成void*/
	//請和peri()方法的取用方式做對照，即可看出端倪。
	
	void area() {      //'函數成員' 
		int area=width * height;
		System.out.println("Rectangle AREA(長方形面積) ="+area);
	};
	
	/*int*/ void peri() {      //'函數成員'
		System.out.println("PERIMETER(周長) ="+(width+height)*2);
		//return (width+height)*2;
	};
	
}
