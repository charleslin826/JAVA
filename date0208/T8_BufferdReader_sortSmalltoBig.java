package date0208;

import java.io.*;
import java.util.Arrays;

/*撰寫讀取純文字檔rand.txt的內容，並對這1000個數值由小排到大，並將結果
寫入到rand2.txt。*/
public class T8_BufferdReader_sortSmalltoBig {

	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\YVTC\\Desktop\\rand.txt"));
		int n;
		String str;
		int a[] = new int[1000];//not set size of array
		int i=0;
		while((str=bfr.readLine())!=null)
		{  			
			if(i<=1000) {			
			n = Integer.parseInt(str);						
			a[i]=n;
//			System.out.println( "array["+i+"] = " + a[i] );	 //print value for Debug
			i++;
			}						
		}
		
		Arrays.sort(a);
		BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\YVTC\\Desktop\\rand2.txt"));
		for(int j=0;j<1000;j++) {
			bfw.write(Double.toString(a[j]));
			bfw.newLine();
		}
		System.out.print("rand2 had been created on desktop!");
		bfr.close();
		bfw.close();
		
		}

	}


