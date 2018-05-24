package date0129;

public class T4_Constructor {
	public static void main(String[] args) {	
		CCount C = new CCount();	//由類別CCount 建立物件C (instance method)
		System.out.println(C.power(2,4));   // 從此以下的C.xxx即為
		//實例函數 (instance method)。定義：必須先建立物件，再利用物件來呼叫的函數。
		C.count();
		C.setZero();
		C.count();
		C.setValue(10);
		C.count();	}
}
class CCount{
	int cnt=0;
	public CCount(){//利用自訂建構元(子)呼叫本身
		cnt++; //每次被呼叫本身，都會被算入被呼叫的次數
	};
	public void count() {  //建立count函式來計算被呼叫的次數
		System.out.println(cnt+" object(s) created.");
	}
	void setZero() {
		cnt=0;
	}
	void setValue(int n) {
		cnt=n;
	}
	int power(int x, int n) { //計算X的N次方  例如x=2 n=3
		int sum=1;
		for(int i=0;i<n;i++) { //sum = 2*2*2*2=16
			sum *= x;
		}
		return sum;
	}	
}