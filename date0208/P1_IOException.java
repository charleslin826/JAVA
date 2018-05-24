package date0208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_IOException {

	public static void main(String[] args) throws IOException{
		BufferedReader buf;
		char str;//只讀出一個字元，也可以改為String讀取字串(多個字元)
		buf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("input:");
			str = (char)buf.read(); //可把(char)拿掉 並且改為buf.readLine() 改成讀String
			System.out.println(str);
			
		}catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
