package date0118;

import java.util.Scanner;

public class P2_Scanner_Celsius_to_Fahrenheit {

	public static void main(String[] args) {
			float C; 
			Scanner scn = new Scanner(System.in);
			System.out.println("Please input Celsius to Fahrenheit(攝氏轉華氏):"); 
			C = scn.nextFloat(); //取得浮點數 也可用.nextDouble();
			System.out.printf("= %.1f°C \n",C);
			System.out.printf("= %.1f°F in integer type\n",(9/5)*C+32); //數字無小數點也無f 直接以整數(int)運算後 則1.8 會直接取第一位1 
			System.out.printf("= %.1f°F in float type 缺點是每個數字後面都要加f \n",(9f/5f)*C+32); //數字後+f 強制為浮點數(float)
			System.out.printf("= %.1f°F in double type\n",(9.0/5.0)*C+32); //數字有小數點自動改為預設double
			scn.close(); //相當於C語言中的fflush功能去沖掉所佔據的記憶體			
		}
	
	}


