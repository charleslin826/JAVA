package date0118;

import java.util.Scanner;

public class P4_JudgeChar {

	public static void main(String[] args) {
		// ��J���@�^��r�A�P�_�Ӧr���bABCD..XYZ�����ĴX�Ӧr EX Aa=1 Bb=2 .. Zz=26
		Scanner scn = new Scanner(System.in);
		String any;

		System.out.print("Please input any character \n(�п�J���@�^��r�A���{���N�P�_�Ӧr�Ĥ@�r���b�r�������ĴX�Ӧr EX Aa=1 Bb=2 .. Zz=26):");
		any = scn.nextLine();
		any=any.toUpperCase();
		System.out.print((int)any.charAt(0)-64);
		scn.close();
	}

}
