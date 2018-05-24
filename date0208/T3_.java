package date0208;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T3_ {

	public static void main(String[] args) {
		String code,name;
		int a;
		Scanner scn = new Scanner(System.in);		
		try {	
		System.out.println("Please input your Code:");
		code=scn.nextLine();
		System.out.println("Please input your Name:");
		name=scn.nextLine();
		System.out.println("Please input your Account Deposit:");
		a = scn.nextInt();
		scn.close();
		if (a<0) {
			throw new BankException();
		}
		
		System.out.println("Here is your info:\nCode:"+code+"\nName:"+name+"\nAccount Deposit:"+a);
		
		}catch(BankException e){
			System.out.println(e.toString());
		}catch(InputMismatchException e){
			System.out.println("Please input number in your Account Deposit!..."+e.toString());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

class BankException extends Exception{
	public String toString(){
		return "You input a negative number!";
	}
}
