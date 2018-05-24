package date0208;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class P2_FileReader {

	public static void main(String[] args) throws IOException {
		char data[]=new char[128];
		FileReader fr=new FileReader("C:\\Users\\YVTC\\Desktop\\train_ANSI.txt");  //要讀取UTF8需至properties>resource>改編碼後重開eclipse
		
		int num=fr.read(data);  //將字元寫入num計數 //將內容讀入字元陣列data
//		String str=new String(data,0,num);//字元轉字串/*String.valueOf(char[] data, int offset, int count) :	將 char 陣列 data 中 由 data[offset] 開始取 count 個元素 轉換成字串*/
		System.out.println("Char[]="+num);//顯示字元計數結果
//		System.out.println(str);
		System.out.println(data); //顯示資料內容
		fr.close();
		//////////////
		int count =0;
		for(int i=0;i<128;i++) {
			if(Integer.toInteger((data[i])) == 9) {
				count++;
			}
		}
		System.out.println("有"+count+"個9");

		
		
		///額外---FileInputStream讀取檔案大小(結果會是位元組bytes)///
		
		FileInputStream fi=new FileInputStream("C:\\Users\\YVTC\\Desktop\\train_ANSI.txt");
		System.out.println("file size ="+fi.available());
	}

}
