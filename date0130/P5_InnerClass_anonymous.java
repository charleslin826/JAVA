package date0130;

public class P5_InnerClass_anonymous {

	public static void main(String[] args) {
		(new Caaa() {  //ミ拔ず场摸Caaaン
					void set_num(int n) {                //7-10︽干ìず场摸Caaa柑⊿Τ﹚竡ㄧ计
						num =n;
						System.out.print("num = "+num);
					}
				}
				).set_num(10);		
	}
	
	static class Caaa{ //ず场摸Caaa
		int num;
	}

}
