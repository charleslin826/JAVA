package date0207;

import java.util.Scanner;

//�P�_�O�_�����y�����T����(�����@�˦��ĤT��=�}�ڸ�(a^2+b^2)�A���~����ܰT���A���|���
public class T1_exception_throw {

	public static void main(String[] args) {
		double a,b;
		
		Scanner scn = new Scanner(System.in);		
		try {	
			System.out.print("�п�J���y�����T���Ϊ��Ĥ@����(�u��):");
			a=scn.nextDouble();
			System.out.print("�п�J���y�����T���Ϊ��ĤG����(�u��):");
			b=scn.nextDouble();
			
			if(a==b&&a>0) {
				System.out.println("���y�����T���Ϊ��ĤT���䬰"+Math.sqrt(a*a+b*b));		
			}else if(a<0||b<0){
				throw new HelloTooNegative(); //�ϥΦۭq���~�Ӧ�Exception���禡
			}else{	
				throw new ArithmeticException(); //�b��ƪ������ߥX�ҥ~��throw 
			}
		}catch(HelloTooNegative e) {
			System.out.println("Error:"+e.getMessage()); //�o��i�ϥΤT�ؤU���ۤv�w�q����ke / e.getM.. / e.showM..
		}catch(ArithmeticException e){
			System.out.print("throwed:�D���y�����T����"); //System.out.print("��N���~:"+e);		
		}catch(RuntimeException e){
			System.out.print("��J���~:"+e);
		}

	}

}


class HelloTooNegative extends Exception {
	public String toString() {
		return "Your input Error!";
	}
	public String getMessage() {
		return "Here is overidding the \"getMessage\".";
	}
	public String showMessage() {
		return "Here is the new Message.";
	}
	
}
