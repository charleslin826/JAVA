package date0208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T4 {

	public static void main(String[] args) throws IOException {
		BufferedReader a;
		String n;
		a = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please input a number:");				
		try {
		n = a.readLine();
		System.out.println("You type:"+n);
		mySqrt(n);		
		}catch(ArgumentOutOfBound e) {
			System.out.println(e.toString());
		}
	}
			


static void mySqrt(String n) throws ArgumentOutOfBound{	
	Double n2=Double.parseDouble(n);
	if(n2<0) {
		throw new ArgumentOutOfBound();
	}else {
		System.out.println("The square of n ="+(int)Math.sqrt(n2));
	}
}
}

class ArgumentOutOfBound extends Exception {
	public String toString(){
		return "You input a number below 0.";
}
}



