package date0129;

public class T4_Constructor {
	public static void main(String[] args) {	
		CCount C = new CCount();	//�����OCCount �إߪ���C (instance method)
		System.out.println(C.power(2,4));   // �q���H�U��C.xxx�Y��
		//��Ҩ�� (instance method)�C�w�q�G�������إߪ���A�A�Q�Ϊ���өI�s����ơC
		C.count();
		C.setZero();
		C.count();
		C.setValue(10);
		C.count();	}
}
class CCount{
	int cnt=0;
	public CCount(){//�Q�Φۭq�غc��(�l)�I�s����
		cnt++; //�C���Q�I�s�����A���|�Q��J�Q�I�s������
	};
	public void count() {  //�إ�count�禡�ӭp��Q�I�s������
		System.out.println(cnt+" object(s) created.");
	}
	void setZero() {
		cnt=0;
	}
	void setValue(int n) {
		cnt=n;
	}
	int power(int x, int n) { //�p��X��N����  �Ҧpx=2 n=3
		int sum=1;
		for(int i=0;i<n;i++) { //sum = 2*2*2*2=16
			sum *= x;
		}
		return sum;
	}	
}