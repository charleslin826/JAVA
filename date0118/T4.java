package date0118;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// ��J�Y��ƧP�_�O�_����� (��1�P������㰣��l������u����) 
		boolean isPrime=true;
		Scanner scn = new Scanner(System.in);
		System.out.print("Please input any integer to see if it is a prime:\n");
		int n = scn.nextInt();
		for(int i=2;i<n;i++){  // �q2�}�l���H�ӼơA����Ӽƫe�@�Ӽ�
			if(n%i ==0) {  //�Y�㰣 [�Ҧp91�A����7&13���ɭ�7*13=91 �l�Ƭ�0 �hisPrime�qtrue�Q�אּfalse�F]
			isPrime=false; //���O���
			break; //��false�N����A�t�פ����
		} 
		}if (isPrime == false) {  
			System.out.print("It's not prime.\n");
		} else {
			System.out.print("It's prime.\n");}   // EX:"15872953"
		scn.close();
}
}