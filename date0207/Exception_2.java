package date0207;

import java.io.IOException;

public class Exception_2 {

	public static void main(String[] args) {
		int[] myarray = new int[10];
		
		try {
			myarray[5] =120; //�Y5�令15�N�|�]��1��catch
			int test = 120/5;  //ok �Y��0�h�]��2��catch
			int n =Integer.parseInt("Are you OK?");//�^��r��L�k���Ѧ���� (�Ʀr�r��~��) �]��3��catch
		}catch(ArrayIndexOutOfBoundsException e){ //�}�C���~��
			System.out.println("�ҥ~�����e:" + e.toString());
			System.out.println("�}�C�d��W�X");
		}catch(ArithmeticException e){  //��N���~��
			System.out.println("�ҥ~�����e:" + e.toString());
			System.out.println("�ƾǹB����~");
		}catch(Exception e){   //�B����~��
			System.out.println("�ҥ~�����e:" + e.toString());
			System.out.println("�o�Ϳ��~");
		}		
		
		System.out.println("�{�����槹��");	
		
	}

}
