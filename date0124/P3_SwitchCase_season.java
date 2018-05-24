package date0124;

import java.util.Scanner;

public class P3_SwitchCase_season {

	public static void main(String[] args) {
		int season;
		System.out.println("請出入月份:");
		Scanner scn = new Scanner(System.in);		
		season = scn.nextInt();
		if(season>0) {
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("春天");
			break;
		case 6: case 7: case 8:
			System.out.println("夏天");
			break;
		case 9: case 10: case 11:
			System.out.println("秋天");
			break;
		case 12: case 1: case 2:
			System.out.println("冬天");
			break;
		default:
			System.out.println("ERROR!");
			break;
		}			
		scn.close();
	}else {
		System.out.println("ERROR!");		
	}	

	}

}
