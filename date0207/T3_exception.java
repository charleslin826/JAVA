package date0207;
//�ǤJ�m�W �~�� �Y�~��W�X25k-55k �ۦ�ߥX�ҥ~
public class T3_exception {

	public static void main(String[] args) {
		try {			
		showSalary("bill",48415);
		showSalary("alexa",26345);
		showSalary("charlie",152345);
		}catch(IllegalArgumentException e){
			System.out.println("Error Occured! Here is the reason: "+e);//��Je = e.toString() //��Je.getMessage()=null(�L��)�|�����]��U����J���r��
		}
	}
static void showSalary(String name, int money) throws IllegalArgumentException{ //�۰ʥ�X�D�k�Ѽƨҥ~
	if(money <= 25000 || money >= 55000) {
		throw new IllegalArgumentException("Error Argument.\nSalary below or above normal standard.(money <= 25000 || money >= 55000)"); //()���i�[�i���["Error Argument!!"
	}else {
		System.out.println("Recorded: Name = "+name+" Salary = "+money);
	}
}

}