package date0110;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lnum = java.lang.Long.MAX_VALUE; //java.lang �i�H�ٲ�
		int inum = Integer.MAX_VALUE;
		short snum = java.lang.Short.MAX_VALUE;
		byte iByte = Byte.MAX_VALUE;
		
		
		System.out.println("Long Max " +lnum);
		System.out.println("Int Max " +inum);
		System.out.println("Short Max " +snum);
		System.out.println("Byte Max " +iByte);
		
		char ch1='\"'; //�θ���r��\�h���"
		char ch2='\074'; //8�i��
		char ch3='\u003e'; //16�i��
		System.out.println(ch1+"\n"+ch2+"\n"+ch3); 
		
		System.out.println("\'Java\' �{��(-), ����   \"1.384\".");
		
	}

}
