/*2.	���]Namecard���O�������w�q�p�U�G
class Namecard
{
private String name;
private String address;
private Phone data;
}
��	Phone�����O���A�A��company, cell��Ӹ�Ʀ���(�Ҭ�String)�A�ձNPhone���O�[�JNamecard���O�A�����������O�C
��	�г]�pPhone���غc��Phone(String s1, String s2)�A�Ψӳ]�wcompany��s1�Acell��s2�C
��	���g�@��show()�禡�A�ΨӦC�LNamecard���O�̪��Ҧ���������ơC
��	�Цbmian()�禡�[�J�p�U���ԭz�G
Namecard first = new Namecard("andy","1234city","2345-6789","0911-123456"));
�ϱo�{�����浲�G���G
�n�ͩm�W�Gandy
�p���a�}�G1234city
���q�q��:2345-6789
������X�G0911-123456
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
private Phone data;  //�إ�Phone���O�������ܼ�data
class Phone{ //Phone�����O���A�A��company, cell��Ӹ�Ʀ���(�Ҭ�String)�A�ձNPhone���O�[�JNamecard���O�A�����������O�C
	private String company; //�ݥ[ static�~�����O�~����γo���������O������Ʀ���
	private String cell;
	public Phone(String s1, String s2) {//�г]�pPhone���غc��Phone(String s1, String s2)�A�Ψӳ]�wcompany��s1�Acell��s2
		company = s1;
		cell = s2;
	}
}
public Namecard(String n,String a,String com,String c) { //�ۭq�غc��
	name = n;
	address =a;
	data=new Phone(com,c);  //��new�إߤ������OPhone�������ܼƨõ����Ѽ� 
	this.show();			
}
void show() {  //���g�@��show()�禡�A�ΨӦC�LNamecard���O�̪��Ҧ���������ơC
	System.out.printf("�n�ͩm�W�G"+name+"\n�p���a�}�G"+address+"\n���q�q��:"+data.company+"\n������X�G"+data.cell);
}



}
