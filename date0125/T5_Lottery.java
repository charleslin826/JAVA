package date0125;

public class T5_Lottery {

	public static void main(String[] args) {
		
		System.out.print("�q���D��10�դj�ֳz���X:\n");
		int num[] = {0,0,0,0,0,0,0};
		int flag=0;
		for (int i=0;i<10;i++) { //�@�L�X�Q��
//		do {//��...���sRUN
			for (int j=0;j<=6;j++) {      //randon����0~1���Ʀr �ӼƩұo�̤p�ȬO0 �A�̤j�ȬO0.999999999999 �û����|��1
			num[j]=(int)(Math.random()*49+1);  //�ҥH�n�[1   �Ҧp  (int)0.999*49=48+1=49# {�o�ˤ~��L�X�̤j��49}			
		}
//			for (int k=0;k<=6;k++) {
//				for (int l=0;l<=6;l++) {//�β�0~5����0�����5��
//					if (num[k]==num[l]){ //�|���ۤv�|�û�break ��sort ���n-1
//						flag =1;
//						break;
//		}
//		}
//		}
//		}while(flag==1);//�����ƪ��Ʀr�� ���]	
			for (int k=0;k<=6;k++) {
			System.out.print(num[k]+"\t");//�̦��L�X�@��	
			}
			System.out.println();
	}

	}

}
