package date0202;
/*ƒÜ	¦³¤@Ãþ§OCRec¡A¥Î¨Óªí¥Üªø¤è§Î¡G
class CRec{
	protected int length;
	protected int width;
}
1.	¸Õ±NCRec¥[¤@­Ó¦³¤Þ¼Æªº«Øºc¤¸CRec(int l, int w)¡A¥i±Nlength³]¬°l¡Awidth³]¬°w¡C
2.	¦bmain()«Ø¥ß¤@­ÓCRecª«¥órect¡A§Q¥ÎCRec(2,6)ª«¥ó³]¬°ªì­È¡C
3.	¦bmain()±Nª«¥órect¶Ç¤Jprintln()¡Aprintln()·|¦L¥Xlength=xxx, width=yyy,area=zzz¦r¦ê¡A
	¨ä¤¤xxx,yyy¥Nªíª«¥órect¸ê®Æ¦¨­ûlength,widthªº­È¡Azzz¬°ªø¤è§Îª«¥ó­±¿n¡C
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