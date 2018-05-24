package date0125;

import java.util.Scanner;

//1. 輸入n值，求1,1,2,3,5,8,13,21,34,55,... 第n項n>=3 n={(n-1)的數字+(n-2)的數字} 
//2. 輸入k值，求1*2+2*3+3*4+4*5+...+(k-1)*k 之和   K(1)=1*2=2 , K(2)=2*3=6 , K(3)=3*4=12 ===> n*n+1
public class T4_F_arrays {					         

	public static void main(String[] args) {
		System.out.print("請輸入項次:");
		Scanner scn = new Scanner(System.in);		
		System.out.print("在費式數列中是"+F(scn.nextInt()));
		System.out.print("\n請輸入項次:");
		Scanner scn1 = new Scanner(System.in);		
		System.out.print("在K數列中是"+K(scn1.nextInt()));
		
		scn.close();
		scn1.close();
		
		
		
	}
	
	static int F(int n) {
		if(n==1 || n==2) {   //F(1)=1,F(2)=1
			return 1;		 //F(3)=2 => F(1)+F(2)
		}else return F(n-1)+F(n-2); // F(4)=3 =>F(3)+F(2)
		
	}
	
	static int K(int j) {				
			return j*(j+1);
		
	}
	
}
