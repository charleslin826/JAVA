package date0208;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class P2_FileReader {

	public static void main(String[] args) throws IOException {
		char data[]=new char[128];
		FileReader fr=new FileReader("C:\\Users\\YVTC\\Desktop\\train_ANSI.txt");  //�nŪ��UTF8�ݦ�properties>resource>��s�X�᭫�}eclipse
		
		int num=fr.read(data);  //�N�r���g�Jnum�p�� //�N���eŪ�J�r���}�Cdata
//		String str=new String(data,0,num);//�r����r��/*String.valueOf(char[] data, int offset, int count) :	�N char �}�C data �� �� data[offset] �}�l�� count �Ӥ��� �ഫ���r��*/
		System.out.println("Char[]="+num);//��ܦr���p�Ƶ��G
//		System.out.println(str);
		System.out.println(data); //��ܸ�Ƥ��e
		fr.close();
		//////////////
		int count =0;
		for(int i=0;i<128;i++) {
			if(Integer.toInteger((data[i])) == 9) {
				count++;
			}
		}
		System.out.println("��"+count+"��9");

		
		
		///�B�~---FileInputStreamŪ���ɮפj�p(���G�|�O�줸��bytes)///
		
		FileInputStream fi=new FileInputStream("C:\\Users\\YVTC\\Desktop\\train_ANSI.txt");
		System.out.println("file size ="+fi.available());
	}

}
