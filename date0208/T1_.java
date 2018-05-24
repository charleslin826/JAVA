package date0208;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class T1_ {

	public static void main(String[] args) {
		BufferedReader buf;
		String str;
		buf = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			System.out.print("input:");
			str = buf.readLine(); 
			Check888 ck888 =new Check888(str);
			ck888.Show888();			
		}catch(Exception e) {
			System.out.println("You got 888 Error");
		}
		
	}

}

class Exception888 extends Exception{   // 自訂Exception
	public String toString() {
		return "This is Exception888 since you typed 888!";
	}
	
}

class Check888{
	static String str;
	public Check888(String s) {
		str =s;
	}
	public static void Show888() {
		try {
			if (str.equals("888")) {   //字串比對用這個!!!
				throw new Exception888();
			}else {
				System.out.println("String = "+str);
			}
		}catch (Exception e ) {
			e.printStackTrace();
		}
	}
}
