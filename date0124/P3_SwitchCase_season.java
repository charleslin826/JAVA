package date0124;

import java.util.Scanner;

public class P3_SwitchCase_season {

	public static void main(String[] args) {
		int season;
		System.out.println("�ХX�J���:");
		Scanner scn = new Scanner(System.in);		
		season = scn.nextInt();
		if(season>0) {
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("�K��");
			break;
		case 6: case 7: case 8:
			System.out.println("�L��");
			break;
		case 9: case 10: case 11:
			System.out.println("���");
			break;
		case 12: case 1: case 2:
			System.out.println("�V��");
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
