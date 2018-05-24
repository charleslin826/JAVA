package date0124;

import java.util.Scanner;

public class T2_AccountVarify {

	public static void main(String[] args) {
		String account= "java"; //在C語言中字串要用這樣 char account[]={"java"};
		String passwd= "1234"; 
		Scanner scn = new Scanner(System.in);	
		int retry=0;
		System.out.println("您有三次機會輸入");
		do {
			System.out.println("請輸入帳號Please enter your account:");				
			if(scn.next().equals(account) ) {
				System.out.println("請輸入密碼Please enter your password:");
				if(scn.next().equals(passwd)) {
					System.out.println("登入成功!Congratulations! You are in!");
					System.exit(0);
				}else {
					retry++;
				}
			}else {
				retry++;
			}						
		}while(retry<3);		
		System.out.println("登入失敗!Unfortunately.. You are out.");
		scn.close();
	}

}
