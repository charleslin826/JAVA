package date0125;

import java.util.Arrays;

public class T3_SearchForOrder_importUtil {

	public static void main(String[] args) {
		int A[] = { 32, 24, 11, 48, 15 };
		Arrays.sort(A);
		System.out.print("A[] =");
		for(int item:A)
		System.out.print(item+" ");
		
		int n1= Arrays.binarySearch(A, 25);  //�Y�Ʀr���b�}�C�̡A������}�C���Ʀr�����A
		System.out.print("\nfind ="+n1+"\n");     //�h�|��ܭt�ƪ��ĴX��..��"�����ӼƦr���Ů�"�� EX: 25 = -4
		

		System.out.print("A[] ���ۤ�=");
		for(int i=A.length;i>0;i--) { //�q5�]��1
			System.out.print(A[i-1]+" "); //�q4�]��0
		}
		

	}
	
}
