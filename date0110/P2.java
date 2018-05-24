package date0110;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lnum = java.lang.Long.MAX_VALUE; //java.lang 可以省略
		int inum = Integer.MAX_VALUE;
		short snum = java.lang.Short.MAX_VALUE;
		byte iByte = Byte.MAX_VALUE;
		
		
		System.out.println("Long Max " +lnum);
		System.out.println("Int Max " +inum);
		System.out.println("Short Max " +snum);
		System.out.println("Byte Max " +iByte);
		
		char ch1='\"'; //用跳脫字元\去顯示"
		char ch2='\074'; //8進位
		char ch3='\u003e'; //16進位
		System.out.println(ch1+"\n"+ch2+"\n"+ch3); 
		
		System.out.println("\'Java\' 程式(-), 版本   \"1.384\".");
		
	}

}
