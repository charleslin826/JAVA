package date0129;

public class T2_CCalculator {  

	public static void main(String[] args) {
		CCalculator CC = new CCalculator(); 
		CC.set_value(10, 20, 30);//�w�qSet_value��k�ӳ]�w��Ʀ���(x,y,z)���� ���N�O
		//(a,b,c)���ڭ̳o��n�m�߳o�өw�q��k(Set_value)�ҥH¶�F�@�� ���@��
		CC.show();	
		System.out.println("a-b-c ="+CC.sub());
		System.out.println("a+b+c ="+CC.add());
		System.out.println("a*b*c ="+CC.mul());
		System.out.println("(a+b+c)/3 ="+CC.avg());

		

	}

}

