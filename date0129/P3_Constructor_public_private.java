package date0129;

public class P3_Constructor_public_private {

	public static void main(String[] args) {
//		Aaa a= new Aaa();  //�L�k����private���غc��(constructor)
		Aaa a= new Aaa(5);  //���n�z�|eclipse��ĸ� �ڭ̨�꦳�Ψ즹local variable
	}

}

class Aaa{			
	private void Aaa() { //�u���������O�i�H�ϥ� // ��Ҩ�ƭY�ٲ�public�Pprivate�A�h�����u��b�P�@��package�̳Q�s�� 
		System.out.println("aaa() called.");//����ƭY�bprivate�᭱�ٲ�void�h�|�ܦ��ۭq�غc�l�A�N���O��Ҩ�ƤF 
	}
	
	public Aaa(int r) {
		this.Aaa();               //���O�p�Guncomment�����A�h�i����ϥ�Aaa(�L�Ѽ�)�AArr(r)�i�H�I�sArr()�A�]�����̳��٦b�P�@��class��
		System.out.println("aaa(r) called.");
	}
}