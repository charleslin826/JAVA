package date0208;
//執行此檔案前 請先準備一個照片檔 並下方修改路徑與檔名
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P6_FileInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\YVTC\\Desktop\\a1.jpeg");//讀取jpeg照片檔 //這邊若有紅字 通常是沒有在main加入 throws例外處理
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
