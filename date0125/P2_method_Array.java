package date0125;

public class P2_method_Array {

	public static void main(String[] args) {
		int[][] A = {{1,2,3,4},{10,9,8,7,6,5}};
			sum_print(A);
			int B[]= {1,2,3,4};
			int[] C=B;
			squar_print(B);
			System.out.print("B[]= ");
			for(int item:B) {
			System.out.print(item+" ");
			}
			System.out.print("\nC[]= ");
			for(int item:C) {			
				if(C==B) System.out.print(item+" ");  //JAVA�ǻ��}�C�O���V��m�A�]����m�@��(C=B�N�� C���u�O���VB����m�AC�����S���ۤv����m)
			}										  //JAVA�ǻ��޼Ƥ~�O�Ϋ����� �Ш����q�ĤC����7-8��
	}
//================================================//	
	static void sum_print(int arr[][]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("Sum ="+sum);

	}
//================================================//
	
	static void squar_print(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			arr[i] = arr[i]*10;
		}		
	}
}
