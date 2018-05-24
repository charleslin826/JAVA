package date0124;

import java.util.Scanner;

public class P2_SwitchCase_score {

	public static void main(String[] args) {
		int score=0,original; //A ==100-90 B==89-80 C==79-70 D==69-60 F==59-0 Error<0||>100
		System.out.println("Input Score(0-100):");
		Scanner scn = new Scanner(System.in);
		original = scn.nextInt();
		score = original/10 ;

		if(score>=0 && original>=0) { //original檢查原始資料>=0
		switch(score) {
		case 10:
		case 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:	
			System.out.println("Grade C");
			break;
		case 6:	
			System.out.println("Grade D");
			break;
		case 5:	case 4: case 3: case 2: case 1: case 0:
			System.out.println("Grade F");
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
