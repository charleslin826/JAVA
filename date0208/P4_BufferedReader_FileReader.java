package date0208;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

;public class P4_BufferedReader_FileReader {

	public static void main(String[] args) throws Exception {  //Ū�g�ɮ׳��n�[�J�o��throws
		String str;
		int count=0;
//		FileReader fr =new FileReader("C:\\Users\\YVTC\\Desktop\\a.txt"); 
		BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\YVTC\\Desktop\\a.txt"));//�����g�b�P�@�� �ٲ��ŧifr(�W�@��)
		
		while((str=bfr.readLine())!=null)
		{  //�C��Ū���@�檽�쵲��
			count++;                     //�p��Ū�����
			System.out.println(str);
			
		}
		System.out.println("\n"+count+" lines read");
		bfr.close();
	}

}
