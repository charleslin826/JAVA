package date0125;

import java.util.Scanner;

public class T3_SearchForOrder {

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
			//請使用者輸入要搜尋的整數
			int keyword;
			Scanner scn = new Scanner(System.in);
			System.out.print("\n\n請使用者輸入要搜尋的整數:");
			keyword = scn.nextInt();
			search(A,keyword);
			scn.close();
		}
	//搜尋的方法
	public static void search(int arr[], int n) {
		int flag=0;//先預設可能找不到
		for (int i = 0; i < arr.length; i++) {
			if(n == arr[i]) {
				System.out.print(n+" 是第"+(i+1)+"個");
				flag=1;//找到了
				break;  //加上break才不會浪費資源(因為有可能很前面就找到，若沒寫break程式仍會全部找完)
			}
		}
		if(flag==0) System.out.print("沒有這個數字..");//找不到跑出來通知使用者
	}
	
	
	}

	



