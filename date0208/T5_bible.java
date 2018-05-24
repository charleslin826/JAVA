package date0208;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class T5_bible {

	public static void main(String[] args) throws IOException{
		String str;
		FileInputStream f1 = new FileInputStream("C:\\Users\\YVTC\\Desktop\\bible_UTF8.txt");//calculate the size of file
		char data[]=new char[f1.available()];
		int count = 0;
		char A[] = {'摩','西'};//若讀不到 很有可能是檔案編碼問題，試試看將文件檔bible另存成UTF8格式
		FileReader fr = new FileReader("C:\\Users\\YVTC\\Desktop\\bible_UTF8.txt");
		BufferedReader bfr = new BufferedReader(fr);
		fr.read(data);

		for(int i=0;i<f1.available();i++) {
			if(data[i] == A[0]&&data[i+1] == A[1]) {
				count++;
			}
		}
		System.out.println("有"+count+"個摩西");
		System.out.println("檔案大小為"+f1.available()+"位元組");
		
		bfr.close();
		fr.close();
		f1.close();

	}

}
