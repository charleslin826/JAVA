package date0125;
//1.寫一個方法 接受二維陣列 傳回值為此二維陣列的每個元素平方。 假設A[][]={{2,4,6},{1,3,5},{8,9}}請顯示最後結果
//2.將MatrixA[][]={{1,2,3},{4,5,6},{7,8,9}}轉為 T[][]={{1,4,7},{2,5,8},{3,6,9}}  *行變成列 列變成行*
//3.將C[][]={{1,2,3},{4,5,6},{7,8,9}}轉為 D[][]={{1,4,7},{2,5,8},{3,6,9}}
public class T1_Array {

	public static void main(String[] args) {
		int A[][]={{2,4,6},{1,3,5},{8,9}};		
		System.out.print("原先A[][]= ");
		for(int i=0;i<A.length;i++) {
			System.out.println();
			for(int j=0;j<A[i].length;j++) 
				System.out.print(A[i][j]+" ");
			}
		squar(A);
		System.out.print("\nsquar(A)後A[][]= ");
		for(int i=0;i<A.length;i++) {
			System.out.println();
			for(int j=0;j<A[i].length;j++) 
				System.out.print(A[i][j]+" ");
			}
		/////////////////////////以下第2題 Transfer//////////////////////////
		int matrixA[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		                                      
		System.out.print("\nMatrixA[][]= ");
		for(int i=0;i<matrixA.length;i++) {
			System.out.println();
			for(int j=0;j<matrixA[i].length;j++) 
				System.out.print(matrixA[i][j]+" ");
			}
		transfer(matrixA);
		/////////////////////////以上第2題Transfer//////////////////////////
		
		
		/////////////////////////以下第3題//////////////////////////
		int C[][]={{1,2,3},{4,5,6},{7,8,9}};
		int D[][]={{1,4,7},{2,5,8},{3,6,9}};		
		C= D;                                       //C變成D
		System.out.print("\n\n\nC[][]轉置成D[][]後= ");
		for(int i=0;i<C.length;i++) {
			System.out.println();
			for(int j=0;j<C[i].length;j++) 
				System.out.print(C[i][j]+" ");
			}
		
		
		/////////////////////////以上第3題//////////////////////////
	}
		//=====================以下squar方法=======================//
//	static void squar(int arr[][]) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = arr[i][j]*arr[i][j];            ////這個方法無回傳值(void)
//			}
//		}
//		
//	}
	
	static int[][] squar(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) { 			  ////這個方法有回傳值(int)+ return arr
				arr[i][j] = arr[i][j]*arr[i][j];
			}
		}
		return arr;
	}
	//=====================以下transfer方法=======================//
	
	static void transfer(int arr[][]) {
		int[][] T = new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) { 			  
				T[i][j] = arr[j][i];
			}
		}
		System.out.print("\nMatrixA[][]轉置成T[][]後= ");
		for(int i=0;i<T.length;i++) {
			System.out.println();
			for(int j=0;j<T[i].length;j++) 
				System.out.print(T[i][j]+" ");		
			}
	}
	
}
