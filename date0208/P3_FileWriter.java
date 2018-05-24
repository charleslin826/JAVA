package date0208;

import java.io.FileWriter;
import java.io.IOException;

public class P3_FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\YVTC\\Desktop\\a.txt",true);
		char data[]= {'H','e','l','l','o','!'};
		String data2=" World~";
		String str="\n=========End of file=========";
		fw.write(data);
		fw.write(data2);
		fw.write(str);
		fw.close();
	}

}
