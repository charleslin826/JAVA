package date0208;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T3_plusDefault {

	public static void main(String[] args) {
		String code,name;
		double a;          //Accept decimal number
		Scanner scn = new Scanner(System.in);		
		try {	
		System.out.println("Please input your Code:");
		code=scn.nextLine();
		System.out.println("Please input your Name:");
		name=scn.nextLine();
		System.out.println("Please input your Account Deposit:");
		a = scn.nextDouble();
		scn.close();
		if (a<0) {
			throw new BankException2();
		}
		
		System.out.println("Here is blue_colar_employee_"+name+"'s info:\nCode:"+code+"\nName:"+name+"\nAccount Deposit:"+a);
		Bank Jack = new Bank();
		Jack.setAccount("001","Jack",99000);
		}catch(BankException2 e){
			System.out.println(e.toString());
		}catch(InputMismatchException e){
			System.out.println("Please input number in your Account Deposit!... "+e.toString());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

class BankException2 extends Exception{
	public String toString(){
		return "Negative number!..Liabilities?";
	}
}

class Bank{
	String acct,name;
	long number;
	void setAccount(String a,String b, long c) throws BankException2{
		acct=a;name=b;number=c;
		if(c<0) {
			throw new BankException2();
		}
		System.out.println("*****************************");
		System.out.println("Here is CEO_Jack's info:\nCode:"+acct+"\nName:"+name+"\nAccount Deposit:"+number);
	}
	
}

