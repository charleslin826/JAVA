package date0208;
/*撰寫讀取純文字檔rand.txt的內容，找出上述1000個數值的平均值，最大與最
小值*/
/*撰寫讀取純文字檔rand.txt的內容，並對這1000個數值由小排到大，並將結果
寫入到rand2.txt。*/
import java.io.*;

public class T7_BufferedReader {

	public static void main(String[] args) throws IOException{
		int count =0;
		int n;
		String str;
		BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\YVTC\\Desktop\\rand.txt"));
		int sum=0,min=100000,max=0;
		
		while((str=bfr.readLine())!=null)
		{  			
			n = Integer.parseInt(str);
			sum = sum+n;
			count++;
			
			if(n>max) {
				max=n;
			}
			if(n<min) {
				min=n;
			}
			
		}
		System.out.println("\n"+count+" lines read");
		System.out.println("Average ="+(sum/1000));
		System.out.println("Max ="+max);
		System.out.println("Min ="+min);
		
		bfr.close();
	}

}
