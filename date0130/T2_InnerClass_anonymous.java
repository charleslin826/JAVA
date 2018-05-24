//1.	請撰寫CCircleY的匿名內部類別，並用它呼叫show()函式，用以顯示圓面積。
package date0130;

public class T2_InnerClass_anonymous {

	public static void main(String[] args) {
		(new CCircleY(1.0) {
			void show() {
				System.out.println("Area = "+pi*radius*radius);
			}
		}
		).show();

	}
	static class CCircleY{
		protected double pi = 3.14;//資料成員　實例變數
		protected double radius;	//資料成員　實例變數
		
		public CCircleY(double r) { //自訂建構子  //原先我是把radius =r放在show方法裡面，但是還是要拿出來比較符合變數的名稱定義
			radius =r;
		}
	}

}