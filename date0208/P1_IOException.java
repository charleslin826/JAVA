package date0208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_IOException {

	public static void main(String[] args) throws IOException{
		BufferedReader buf;
		char str;//�uŪ�X�@�Ӧr���A�]�i�H�אּStringŪ���r��(�h�Ӧr��)
		buf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("input:");
			str = (char)buf.read(); //�i��(char)���� �åB�אּbuf.readLine() �令ŪString
			System.out.println(str);
			
		}catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
