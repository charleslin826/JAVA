package date0124;

import java.util.Scanner;

public class T2_AccountVarify {

	public static void main(String[] args) {
		String account= "java"; //�bC�y�����r��n�γo�� char account[]={"java"};
		String passwd= "1234"; 
		Scanner scn = new Scanner(System.in);	
		int retry=0;
		System.out.println("�z���T�����|��J");
		do {
			System.out.println("�п�J�b��Please enter your account:");				
			if(scn.next().equals(account) ) {
				System.out.println("�п�J�K�XPlease enter your password:");
				if(scn.next().equals(passwd)) {
					System.out.println("�n�J���\!Congratulations! You are in!");
					System.exit(0);
				}else {
					retry++;
				}
			}else {
				retry++;
			}						
		}while(retry<3);		
		System.out.println("�n�J����!Unfortunately.. You are out.");
		scn.close();
	}

}
