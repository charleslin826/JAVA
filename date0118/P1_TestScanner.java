package date0118;

import java.util.Scanner; //���JSacnner���O

public class P1_TestScanner {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // �ŧi/�إ�Scanner���O������
		String name;
		int age;
		
		System.out.print("What's your name? ");
		name=scn.nextLine();
		System.out.print("How old are you? ");
		age=scn.nextInt();
		
		System.out.print("Hi, "+name+", you're ");
		System.out.println(age+" years old.");
		System.out.printf("Name = %s , Age = %d \n",name,age);
		System.out.print("Please input any word:");
		String str;
		char ch;
		str=scn.next();
		ch=str.charAt(0);
		System.out.printf("You input: %s & the first char is %c",str,ch);
		scn.close(); //�۷��C�y������fflush�\��h�R���Ҧ��ڪ��O���� �P�@��package�����Pclass�U�Τ@�����ɭԥ�������~���|����ĸ�
	}

}
