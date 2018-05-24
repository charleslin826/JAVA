package date0222;

//import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

//Lottery numbers by user. (no repeat, only Integer, range 1-49)
public class T2_LotteryBuying {

	public static void main(String[] args) {
		TreeSet<Integer> hst = new TreeSet<Integer>(); //replace Hashset by TreeSet, the results can be showed by order.
		int order=1,num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please input 6 lucky numbers:"); 
		while(order<=6) {
			System.out.print("It's NO."+order+" numbers.");
			try {
				num = Integer.parseInt(scn.nextLine()); // converting String to Integer
			}catch (Exception e){
				System.out.println("Please input Integer only.");
				continue;
			}
			
			if(num >=1 && num<=49) {
				if(hst.add(num)) 
					order++;				
			}else {
				System.out.println("The range is from 1 to 49.");
			}
		}
		scn.close();
		
		System.out.println("Lucky Numbers:"+hst);
	}
	
}
