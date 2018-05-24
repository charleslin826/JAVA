package date0124;

public class P6_Array2 {

	public static void main(String[] args) {
		int sum=0,sale[][]= {{10,20,30,40,50},{15,25}};
		for(int i=0;i<sale.length;i++) {
			for(int j=0;j<sale[i].length;j++) {
				sum += sale[i][j];
			}
		}
		System.out.println("Sum ="+sum);
	}

}
