package date0130;

public class P4_InnerClass {
	
//	public P4_InnerClass {   //�~�����O���غc��
//		
//	}
//	
	
	public static void main(String[] args) {
		Caaa ca = new Caaa();
		ca.set_num(5);
//		P4_InnerClass obj = new P4_InnerClass();
	}



	static class Caaa{    //�������O�n�[�Wstatic�~�i�b�W����main���Y�ե�
	int num;	
	
		public Caaa() {
			
		}
		
		void set_num(int n) {
			num = n;
			System.out.println("num = "+num);
		};
	
	}

}