package date0208;
//���榹�ɮ׫e �Х��ǳƤ@�ӷӤ��� �äU��ק���|�P�ɦW
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P6_FileInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\YVTC\\Desktop\\a1.jpeg");//Ū��jpeg�Ӥ��� //�o��Y�����r �q�`�O�S���bmain�[�J throws�ҥ~�B�z
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YVTC\\Desktop\\a2.jpeg");
		System.out.println("file size ="+fis.available());
		byte data[]=new byte[fis.available()];
		
		fis.read(data);
		fos.write(data);
		System.out.println("file a1 copied and renamed to a2!");
		fis.close();
		fos.close();
	}

}
