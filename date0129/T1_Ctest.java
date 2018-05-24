package date0129;

import java.util.Scanner;

public class T1_Ctest {

	public static void main(String[] args) {
		
		System.out.println("This program will tell what type(odd or even) of the number is.  Please input a number:");
		int n;
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		Ctest.test(n);
		scn.close();
	}

	static class Ctest{
		static void test(int n){
			if(n==0) {
				System.out.println("0");
			}else if (n%2==0) {
				System.out.println("It's even number");
			}else if(n%2 == 1) {
				System.out.println("It's odd number");
			}
		}
		

	}
}
