package date0125;

import java.util.Scanner;

public class T3_SearchForOrder {

	public static void main(String[] args) {
			// �w�q�}�C
			int A[] = { 32, 24, 11, 48, 15 };
			// ��ܱƧǫe�����A
			System.out.println("Before Sort... ");
			for (int i = 0; i < A.length; i++)
				System.out.print(A[i] + "\t");
			System.out.println(); // ����
			int n = A.length; // �N�}�C���׭Ȧs�Jn�ܼ�
			int temp;// �w�q�Ȧs�ܼ�
			for (int i = n - 2; i >= 0; i--) {
				for (int j = 0; j <= i; j++) {
					if (A[j] > A[j + 1]) { // ��j�p
						temp = A[j]; // �洫
						A[j] = A[j + 1];// �л\
						A[j + 1] = temp; // �л\
					}
				}
				System.out.print("�� "+(4-i)+" ��"+"\t");
				for(int item:A)
					System.out.print(item+"\t");
				System.out.println();	
			}
			System.out.println("After Sort... ");
			// ��ܱƧǤ��᪺���A
			for(int item:A)
				System.out.print(item+"\t");
			//�ШϥΪ̿�J�n�j�M�����
			int keyword;
			Scanner scn = new Scanner(System.in);
			System.out.print("\n\n�ШϥΪ̿�J�n�j�M�����:");
			keyword = scn.nextInt();
			search(A,keyword);
			scn.close();
		}
	//�j�M����k
	public static void search(int arr[], int n) {
		int flag=0;//���w�]�i��䤣��
		for (int i = 0; i < arr.length; i++) {
			if(n == arr[i]) {
				System.out.print(n+" �O��"+(i+1)+"��");
				flag=1;//���F
				break;  //�[�Wbreak�~���|���O�귽(�]�����i��ܫe���N���A�Y�S�gbreak�{�����|�����䧹)
			}
		}
		if(flag==0) System.out.print("�S���o�ӼƦr..");//�䤣��]�X�ӳq���ϥΪ�
	}
	
	
	}

	



