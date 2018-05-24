/*2.	°²³]NamecardÃþ§Oªº³¡¤À©w¸q¦p¤U¡G
class Namecard
{
private String name;
private String address;
private Phone data;
}
ƒÜ	Phone¬°Ãþ§O«¬ºA¡A¦³company, cell¨â­Ó¸ê®Æ¦¨­û(¬Ò¬°String)¡A¸Õ±NPhoneÃþ§O¥[¤JNamecardÃþ§O¡A¦¨¬°¤º³¡Ãþ§O¡C
ƒÜ	½Ð³]­pPhoneªº«Øºc¤¸Phone(String s1, String s2)¡A¥Î¨Ó³]©wcompany¬°s1¡Acell¬°s2¡C
ƒÜ	¼¶¼g¤@­Óshow()¨ç¦¡¡A¥Î¨Ó¦C¦LNamecardÃþ§O¸Ìªº©Ò¦³¦¨­ûªº¸ê®Æ¡C
ƒÜ	½Ð¦bmian()¨ç¦¡¥[¤J¦p¤Uªº±Ô­z¡G
Namecard first = new Namecard("andy","1234city","2345-6789","0911-123456"));
¨Ï±oµ{¦¡°õ¦æµ²ªG¬°¡G
¦n¤Í©m¦W¡Gandy
Ápµ¸¦a§}¡G1234city
¤½¥q¹q¸Ü:2345-6789
¤â¾÷¸¹½X¡G0911-123456
*/

package date0130;

public class T3_OutterClass_CallOut_InnerClassMember {
	public static void main(String[] args) {
		Namecard first = new Namecard("andy","1234city","2345-6789","0911-123456");	
		
	}
}
class Namecard
{
private String name;
private String address;
private Phone data;  //«Ø¥ßPhoneÃþ§Oªºª«¥óÅÜ¼Ædata
class Phone{ //Phone¬°Ãþ§O«¬ºA¡A¦³company, cell¨â­Ó¸ê®Æ¦¨­û(¬Ò¬°String)¡A¸Õ±NPhoneÃþ§O¥[¤JNamecardÃþ§O¡A¦¨¬°¤º³¡Ãþ§O¡C
	private String company; //»Ý¥[ static¥~³¡Ãþ§O¤~¯à¨ú¥Î³o¶µ¤º³¡Ãþ§O¤ºªº¸ê®Æ¦¨­û
	private String cell;
	public Phone(String s1, String s2) {//½Ð³]­pPhoneªº«Øºc¤¸Phone(String s1, String s2)¡A¥Î¨Ó³]©wcompany¬°s1¡Acell¬°s2
		company = s1;
		cell = s2;
	}
}
public Namecard(String n,String a,String com,String c) { //¦Û­q«Øºc¤¸
	name = n;
	address =a;
	data=new Phone(com,c);  //¥Înew«Ø¥ß¤º³¡Ãþ§OPhoneªºª«¥óÅÜ¼Æ¨Ãµ¹¤©°Ñ¼Æ 
	this.show();			
}
void show() {  //¼¶¼g¤@­Óshow()¨ç¦¡¡A¥Î¨Ó¦C¦LNamecardÃþ§O¸Ìªº©Ò¦³¦¨­ûªº¸ê®Æ¡C
	System.out.printf("¦n¤Í©m¦W¡G"+name+"\nÁpµ¸¦a§}¡G"+address+"\n¤½¥q¹q¸Ü:"+data.company+"\n¤â¾÷¸¹½X¡G"+data.cell);
}



}
