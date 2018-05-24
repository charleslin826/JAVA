package date0124;

import java.util.Scanner;

//判斷閏年  能被400整除=閏年 能被4整除且不可被100整除=閏年 ( 閏年%400=0; 閏年%4=0 && 閏年%100!=0)
//1 if ((公元年分是400的倍数)或(公元年分是4的倍数但不是100的倍数)) {
//2     閏年
//3 } else {
//4     平年
//5 }
public class T1_specialYear {

	public static void main(String[] args) {
		int leapYear;
		System.out.println("Please input a year, this machine will tell you whether it is a leap year or not:");
		Scanner scn = new Scanner(System.in);
		leapYear = scn.nextInt();
		if ((leapYear%400==0)||(leapYear%4==0&&leapYear%100!=0)){
			System.out.println(leapYear + " is a leapYear!");
		}else {
			System.out.println(leapYear + " isn't a leapYear!");
		}
		scn.close();//關閉所佔據的記憶體  清除buffer內專門接收鍵盤的輸入值暫存區
	}

}
