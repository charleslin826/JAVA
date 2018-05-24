package date0118;

import java.util.Scanner; //載入Sacnner類別

public class P1_TestScanner {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // 宣告/建立Scanner類別的物件
		String name;
		int age;
		
		System.out.print("What's your name? ");
		name=scn.nextLine();
		System.out.print("How old are you? ");
		age=scn.nextInt();
		
		System.out.print("Hi, "+name+", you're ");
		System.out.println(age+" years old.");
		System.out.printf("Name = %s , Age = %d \n",name,age);
		System.out.print("Please input any word:");
		String str;
		char ch;
		str=scn.next();
		ch=str.charAt(0);
		System.out.printf("You input: %s & the first char is %c",str,ch);
		scn.close(); //相當於C語言中的fflush功能去沖掉所佔據的記憶體 同一個package中不同class各用一次的時候左邊視窗才不會有驚嘆號
	}

}
