package date0130;

public class P4_InnerClass {
	
//	public P4_InnerClass {   //外部類別的建構元
//		
//	}
//	
	
	public static void main(String[] args) {
		Caaa ca = new Caaa();
		ca.set_num(5);
//		P4_InnerClass obj = new P4_InnerClass();
	}



	static class Caaa{    //內部類別要加上static才可在上面的main裏頭調用
	int num;	
	
		public Caaa() {
			
		}
		
		void set_num(int n) {
			num = n;
			System.out.println("num = "+num);
		};
	
	}

}