package date0118;

import java.util.Scanner;

public class P4_2 {

	public static void main(String[] args) {
		// ��J���@�^��r�A�P�_�Ӧr���bABCD..XYZ�����ĴX�Ӧr EX Aa=1 Bb=2 .. Zz=26
		Scanner scn = new Scanner(System.in);
		String any;
		char alpha;

		System.out.print("Please input any character \n (�п�J���@�^��r�A���{���N�P�_�Ӧr�Ĥ@�r���b�r�������ĴX�Ӧr  EX Aa=1 Bb=2 .. Zz=26):");
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
