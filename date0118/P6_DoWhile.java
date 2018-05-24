package date0118;

import java.util.Scanner;

public class P6_DoWhile {

	public static void main(String[] args) {
		int n=5,sum=0;
		Scanner sn =new Scanner(System.in);
		while(sum<20) {
			sum+=n;
			System.out.print("n="+n+" , sum ="+sum+"\n");
		}
		int x=0,sum2=0;
		do {
		System.out.print("Do first! and input -1 to leave\n");
		x = sn.nextInt();
		sum2 +=x;
		
		}while(x>0);
		System.out.print("Sum = "+sum2);
		sn.close();
	}
}
