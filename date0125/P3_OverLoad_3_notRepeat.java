package date0125;

public class P3_OverLoad_3_notRepeat {

	public static void main(String[] args) {
		int seed;
		int lotto[] = new int[49];  //�]����0���S�Ψ�49-1=48 �ҥH�q��1���}�l�ϥ�
		for (int i =1 ; i<=1000000;i++) {
			seed = (int) (Math.random()*48)+1;
			lotto[seed] +=1;//���ͪ��Ʀr�Y�O48�h lotto[48]+1 �C�X�{�@���[�@��
		
		}
		
		for(int i =0 ; i<lotto.length ; i++ ) {
			System.out.println(i+" = " + lotto[i]);  //�C�ӼƦr���X�{���v���t���h�b2�U�W�U
		}
	}

}
