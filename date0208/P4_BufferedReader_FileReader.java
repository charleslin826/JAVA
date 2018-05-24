package date0208;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

;public class P4_BufferedReader_FileReader {

	public static void main(String[] args) throws Exception {  //讀寫檔案都要加入這個throws
		String str;
		int count=0;
//		FileReader fr =new FileReader("C:\\Users\\YVTC\\Desktop\\a.txt"); 
		BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\YVTC\\Desktop\\a.txt"));//直接寫在同一行 省略宣告fr(上一行)
		
		while((str=bfr.readLine())!=null)
		{  //每次讀取一行直到結束
			count++;                     //計算讀取行數
			System.out.println(str);
			
		}
		System.out.println("\n"+count+" lines read");
		bfr.close();
	}

}
