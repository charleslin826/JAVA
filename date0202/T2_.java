package date0202;
/*��	���@���OCRec�A�ΨӪ�ܪ���ΡG
class CRec{
	protected int length;
	protected int width;
}
1.	�ձNCRec�[�@�Ӧ��޼ƪ��غc��CRec(int l, int w)�A�i�Nlength�]��l�Awidth�]��w�C
2.	�bmain()�إߤ@��CRec����rect�A�Q��CRec(2,6)����]����ȡC
3.	�bmain()�N����rect�ǤJprintln()�Aprintln()�|�L�Xlength=xxx, width=yyy,area=zzz�r��A
	�䤤xxx,yyy�N����rect��Ʀ���length,width���ȡAzzz������Ϊ��󭱿n�C
*/
public class T2_ {

	public static void main(String[] args) {
		CRec rect = new CRec(2,6);
		System.out.println("length = "+rect.length+" width = "+rect.width+" area = "+rect.area);
		

	}

}


class CRec{
	protected int length;
	protected int width;
	protected int area;
	CRec(int l, int w){
		length = l;
		width = w;
		area = l*w;
	}
}