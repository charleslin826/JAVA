package date0125;

public class T2_Bubble_teacher {
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
		}
	}