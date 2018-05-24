package date0125;
public class Practice1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = { { 2, 4, 6 }, { 1, 3, 5 }, { 8, 9 } };
		int[][] B;// ﹚竡皚B
		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("===============");
		System.out.println("絤策1  ㊣transfer");
		System.out.println("===============");
		transfer(matrixA);
		System.out.println("===============");
		System.out.println("絤策2 ㊣fff");
		System.out.println("===============");
		B = fff(A);// ㊣fff盢挡狦倒B
		for (int i = 0; i < B.length; i++) { // 盢B皚陪ボㄓ
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j] + "\t");
			}
			System.out.println();
		}
	}
	// ========== Method fff ====絤策1=========
	public static int[][] fff(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = arr[i][j] * arr[i][j];
			}
		}
		return arr;
	}
	// Method Transfer matrix === 絤策2============
	public static void transfer(int array[][]) {
		int[][] T = new int[3][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				T[j][i] = array[i][j];
			}
		}
		
		for (int i = 0; i < T.length; i++) {
			for (int j = 0; j < T[i].length; j++) {
				System.out.print(T[i][j] + "\t");
			}
			System.out.println();
		}
				
		
	}

}