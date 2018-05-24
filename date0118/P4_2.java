package date0118;

import java.util.Scanner;

public class P4_2 {

	public static void main(String[] args) {
		// 輸入任一英文字，判斷該字元在ABCD..XYZ表中為第幾個字 EX Aa=1 Bb=2 .. Zz=26
		Scanner scn = new Scanner(System.in);
		String any;
		char alpha;

		System.out.print("Please input any character \n (請輸入任一英文字，本程式將判斷該字第一字元在字母表中為第幾個字  EX Aa=1 Bb=2 .. Zz=26):");
		any = scn.nextLine();
	//	any=any.toUpperCase();
		alpha = any.charAt(0);
	//	System.out.print((int)any.charAt(0));
		
		if (alpha >= 65 && alpha <=90) {
			System.out.print((int)alpha-64);
		}else if (alpha >= 97 && alpha <=122){
    		System.out.print((int)alpha-96);	}	
		scn.close();
	}

}
