package date0125;
//1.�g�@�Ӥ�k �����G���}�C �Ǧ^�Ȭ����G���}�C���C�Ӥ�������C ���]A[][]={{2,4,6},{1,3,5},{8,9}}����̫ܳᵲ�G
//2.�NMatrixA[][]={{1,2,3},{4,5,6},{7,8,9}}�ର T[][]={{1,4,7},{2,5,8},{3,6,9}}  *���ܦ��C �C�ܦ���*
//3.�NC[][]={{1,2,3},{4,5,6},{7,8,9}}�ର D[][]={{1,4,7},{2,5,8},{3,6,9}}
public class T1_Array {

	public static void main(String[] args) {
		int A[][]={{2,4,6},{1,3,5},{8,9}};		
		System.out.print("���A[][]= ");
		for(int i=0;i<A.length;i++) {
			System.out.println();
			for(int j=0;j<A[i].length;j++) 
				System.out.print(A[i][j]+" ");
			}
		squar(A);
		System.out.print("\nsquar(A)��A[][]= ");
		for(int i=0;i<A.length;i++) {
			System.out.println();
			for(int j=0;j<A[i].length;j++) 
				System.out.print(A[i][j]+" ");
			}
		/////////////////////////�H�U��2�D Transfer//////////////////////////
		int matrixA[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		                                      
		System.out.print("\nMatrixA[][]= ");
		for(int i=0;i<matrixA.length;i++) {
			System.out.println();
			for(int j=0;j<matrixA[i].length;j++) 
				System.out.print(matrixA[i][j]+" ");
			}
		transfer(matrixA);
		/////////////////////////�H�W��2�DTransfer//////////////////////////
		
		
		/////////////////////////�H�U��3�D//////////////////////////
		int C[][]={{1,2,3},{4,5,6},{7,8,9}};
		int D[][]={{1,4,7},{2,5,8},{3,6,9}};		
		C= D;                                       //C�ܦ�D
		System.out.print("\n\n\nC[][]��m��D[][]��= ");
		for(int i=0;i<C.length;i++) {
			System.out.println();
			for(int j=0;j<C[i].length;j++) 
				System.out.print(C[i][j]+" ");
			}
		
		
		/////////////////////////�H�W��3�D//////////////////////////
	}
		//=====================�H�Usquar��k=======================//
//	static void squar(int arr[][]) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = arr[i][j]*arr[i][j];            ////�o�Ӥ�k�L�^�ǭ�(void)
//			}
//		}
//		
//	}
	
	static int[][] squar(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) { 			  ////�o�Ӥ�k���^�ǭ�(int)+ return arr
				arr[i][j] = arr[i][j]*arr[i][j];
			}
		}
		return arr;
	}
	//=====================�H�Utransfer��k=======================//
	
	static void transfer(int arr[][]) {
		int[][] T = new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) { 			  
				T[i][j] = arr[j][i];
			}
		}
		System.out.print("\nMatrixA[][]��m��T[][]��= ");
		for(int i=0;i<T.length;i++) {
			System.out.println();
			for(int j=0;j<T[i].length;j++) 
				System.out.print(T[i][j]+" ");		
			}
	}
	
}
