package date0208;

import java.io.*;

public class P5_BufferedWriter_FileWriter {

	public static void main(String[] args) throws Exception{		
		FileWriter fw = new FileWriter("C:\\Users\\YVTC\\Desktop\\a.txt");
		BufferedWriter bfw = new BufferedWriter(fw);
//		BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\YVTC\\Desktop\\123.txt")); //上面兩行也可改寫成一行: 
		for(int i=1;i<=6;i++) {
			bfw.write(Double.toString(Math.random()));			
		}		
//		fw.close();// 將會顯示"Exception in thread "main" java.io.IOException: Stream closed"
		bfw.close(); 
		fw.close();//fw.close()要放bfw.close()下面才不會出錯
		/////////以下為讀取印出內容//////
		String str;
		int count = 0;
		BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\YVTC\\Desktop\\a.txt"));
		while((str=bfr.readLine())!=null)
		{  //每次讀取一行直到結束
			count++;                     //計算讀取行數
			System.out.println(str);		
		}
		System.out.println("\n"+count+" lines read");
		bfr.close();
	}
	
}

/*https://stackoverflow.com/questions/9272585/difference-between-flush-and-close-function-in-case-of-filewriter-in-java
 * 
 * flush vs close ???
 * 
 * flush() just makes sure that any buffered data is written to disk (in this case - more generally, flushed through whatever IO channel you're using). You can still write to the stream (or writer) afterwards.

close() flushes the data and indicates that there isn't any more data. It closes any file handles, sockets or whatever. You then can't write to the stream (or writer) any more.

Note that without calls to flush() data can still be written to the IO channel in question - it's just that some data might be buffered.

close() generally calls flush() as well, but it's recently been pointed out to me that in some JDK implementations, any exceptions thrown by flushing as part of closing are swallowed :(*/
