package date0125;

import java.util.Scanner;

//1. ��Jn�ȡA�D1,1,2,3,5,8,13,21,34,55,... ��n��n>=3 n={(n-1)���Ʀr+(n-2)���Ʀr} 
//2. ��Jk�ȡA�D1*2+2*3+3*4+4*5+...+(k-1)*k ���M   K(1)=1*2=2 , K(2)=2*3=6 , K(3)=3*4=12 ===> n*n+1
public class T4_F_arrays {					         

	public static void main(String[] args) {
		System.out.print("�п�J����:");
		Scanner scn = new Scanner(System.in);		
		System.out.print("�b�O���ƦC���O"+F(scn.nextInt()));
		System.out.print("\n�п�J����:");
		Scanner scn1 = new Scanner(System.in);		
		System.out.print("�bK�ƦC���O"+K(scn1.nextInt()));
		
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
