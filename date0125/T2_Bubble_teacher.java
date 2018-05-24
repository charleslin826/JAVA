package date0125;

public class T2_Bubble_teacher {
		public static void main(String[] args) {
			// 定義陣列
			int A[] = { 32, 24, 11, 48, 15 };
			// 顯示排序前的狀態
			System.out.println("Before Sort... ");
			for (int i = 0; i < A.length; i++)
				System.out.print(A[i] + "\t");
			System.out.println(); // 跳行
			int n = A.length; // 將陣列長度值存入n變數
			int temp;// 定義暫存變數
			for (int i = n - 2; i >= 0; i--) {
				for (int j = 0; j <= i; j++) {
					if (A[j] > A[j + 1]) { // 比大小
						temp = A[j]; // 交換
						A[j] = A[j + 1];// 覆蓋
						A[j + 1] = temp; // 覆蓋
					}
				}
				System.out.print("第 "+(4-i)+" 次"+"\t");
				for(int item:A)
					System.out.print(item+"\t");
				System.out.println();	
			}
			System.out.println("After Sort... ");
			// 顯示排序之後的狀態
			for(int item:A)
				System.out.print(item+"\t");
		}
	}