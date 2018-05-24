package date0125;

import java.util.Arrays;

public class T3_SearchForOrder_importUtil {

	public static void main(String[] args) {
		int A[] = { 32, 24, 11, 48, 15 };
		Arrays.sort(A);
		System.out.print("A[] =");
		for(int item:A)
		System.out.print(item+" ");
		
		int n1= Arrays.binarySearch(A, 25);  //若數字不在陣列裡，但介於陣列的數字之間，
		System.out.print("\nfind ="+n1+"\n");     //則會顯示負數的第幾個..第"介於兩個數字的空格"個 EX: 25 = -4
		

		System.out.print("A[] 的相反=");
		for(int i=A.length;i>0;i--) { //從5跑到1
			System.out.print(A[i-1]+" "); //從4跑到0
		}
		

	}
	
}
