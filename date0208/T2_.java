package date0208;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T2_ {

	public static void main(String[] args) {
		int a;
		System.out.println("Please input a number:");
		try {
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		if (a<10) {
			throw new IntegerTooSmall();
		}else if (a>70){
			throw new IntegerTooBig();
		}else {
			System.out.println("Your number(between 10-70) is :" + a);
		}
		
		}catch(IntegerTooSmall e){
			System.out.println(e.toString());
		}catch(IntegerTooBig e){
			System.out.println(e.toString());
		}catch(InputMismatchException e){
			System.out.println(e.toString());
		}
		

	}

}

class IntegerTooSmall extends Exception{
	public String toString() {
		return "IntegerTooSmall!";
	}
}

class IntegerTooBig extends Exception{
	public String toString() {
		return "IntegerTooBig!";
	}
}

