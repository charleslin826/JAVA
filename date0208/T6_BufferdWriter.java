package date0208;
/*��	���ղ���1000��1-99999�������üƾ�ơA�A�Q��BufferedWriter���O�N���g�J��rand.txt�ɮפ��C*/
/*嘗試產生1000個1-99999之間的亂數整數，再利用BufferedWriter類別將它寫
入至rand.txt檔案中。*/
import java.io.*;

public class T6_BufferdWriter {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\YVTC\\Desktop\\rand.txt"));
		for(int i=0;i<1000;i++) {
			String s=Integer.toString((int) Math.ceil(Math.random()*100000));//cast integer to string
			bfw.write(s);		
			bfw.write("\n");	
		}
		System.out.print("rand had been created on desktop!");
		bfw.close();

	}

}
