package date0207;
//傳入姓名 薪資 若薪資超出25k-55k 自行拋出例外
public class T3_exception {

	public static void main(String[] args) {
		try {			
		showSalary("bill",48415);
		showSalary("alexa",26345);
		showSalary("charlie",152345);
		}catch(IllegalArgumentException e){
			System.out.println("Error Occured! Here is the reason: "+e);//輸入e = e.toString() //輸入e.getMessage()=null(無值)會直接跑到下面輸入的字串
		}
	}
static void showSalary(String name, int money) throws IllegalArgumentException{ //自動丟出非法參數例外
	if(money <= 25000 || money >= 55000) {
		throw new IllegalArgumentException("Error Argument.\nSalary below or above normal standard.(money <= 25000 || money >= 55000)"); //()內可加可不加"Error Argument!!"
	}else {
		System.out.println("Recorded: Name = "+name+" Salary = "+money);
	}
}

}