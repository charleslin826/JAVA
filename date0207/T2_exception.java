package date0207;

import java.util.Scanner;

//��Jn1 n2 �۰� �D�㰣�ΰ��Ƭ�0 ��ܿ��~
public class T2_exception {

	public static void main(String[] args) {
		int n1,n2;
			math_div(1,0);
		
		try {
			Scanner scn = new Scanner(System.in);
			System.out.print("�п�J�n�۰����Ʀr:");
			n1=scn.nextInt(); //�N�ҿ�J�����ন��� �Y��J�p���I�|�]�Xjava.lang.NumberFormatException:
			System.out.print("�п�J�n�۰����Ʀr:");
			n2=scn.nextInt();
			if(n1==0||n2==0) {
				throw new ArithmeticException();
			}else {
				System.out.println(n1+" / "+n2+" = "+n1/(double)n2);
			}			
		}catch(ArithmeticException e) {  
			System.out.print("�ƭȺ�N���~�A��]:"+e);  //��5/0�|�]�X��??
		}catch(RuntimeException e) {  
			System.out.print("��J���~�A��]:"+e.getMessage()); //  ��5/2.5(�D���)�|�]�X��			
		}finally {
			System.out.print("\n�{������");			
		}			
	}	


	static void math_div(int n1, int n2) throws ArithmeticException {
		int div =0;
		try {
			div = n1/n2;
			System.out.println("Result ="+div);
		}catch(ArithmeticException e) {
			System.out.println("e = "+e);
		}
	}

}