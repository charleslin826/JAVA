/*2.	假設Namecard類別的部分定義如下：
class Namecard
{
private String name;
private String address;
private Phone data;
}
��	Phone為類別型態，有company, cell兩個資料成員(皆為String)，試將Phone類別加入Namecard類別，成為內部類別。
��	請設計Phone的建構元Phone(String s1, String s2)，用來設定company為s1，cell為s2。
��	撰寫一個show()函式，用來列印Namecard類別裡的所有成員的資料。
��	請在mian()函式加入如下的敘述：
Namecard first = new Namecard("andy","1234city","2345-6789","0911-123456"));
使得程式執行結果為：
好友姓名：andy
聯絡地址：1234city
公司電話:2345-6789
手機號碼：0911-123456
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
private Phone data;  //建立Phone類別的物件變數data
class Phone{ //Phone為類別型態，有company, cell兩個資料成員(皆為String)，試將Phone類別加入Namecard類別，成為內部類別。
	private String company; //需加 static外部類別才能取用這項內部類別內的資料成員
	private String cell;
	public Phone(String s1, String s2) {//請設計Phone的建構元Phone(String s1, String s2)，用來設定company為s1，cell為s2
		company = s1;
		cell = s2;
	}
}
public Namecard(String n,String a,String com,String c) { //自訂建構元
	name = n;
	address =a;
	data=new Phone(com,c);  //用new建立內部類別Phone的物件變數並給予參數 
	this.show();			
}
void show() {  //撰寫一個show()函式，用來列印Namecard類別裡的所有成員的資料。
	System.out.printf("好友姓名："+name+"\n聯絡地址："+address+"\n公司電話:"+data.company+"\n手機號碼："+data.cell);
}



}
