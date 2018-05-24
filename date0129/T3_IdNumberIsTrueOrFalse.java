package date0129;

import java.util.Scanner;  //身分證公式請參考WIKI:
//https://zh.wikipedia.org/wiki/%E4%B8%AD%E8%8F%AF%E6%B0%91%E5%9C%8B%E5%9C%8B%E6%B0%91%E8%BA%AB%E5%88%86%E8%AD%89

public class T3_IdNumberIsTrueOrFalse {

	public static void main(String[] args) {
		String Id;
		do {//將Line14-16的if..else替換成do..while讓錯誤的輸入可以重來
		System.out.println("請輸入身分證字號判斷是否正確:");
		Scanner scn = new Scanner(System.in);	
		Id = scn.next(); //.next()是接收字串 .nextInt()是接收整數

		}while(Id.length()!=10);  
//		if(Id.length()!=10) {
//			System.out.println("輸入錯誤!");  //在這裡就把輸入錯誤的踢掉
//		}else {				
		AlphaId A = new AlphaId(); ///***因為AlphaId為類別 要先new一個物件才能使用它的裡面的方法 
		//EX:直接輸入AlphaId.transfer(Id)是無效的
		//錯誤 eclipse會顯示Cannot make a static reference to 
		//the non-static method transfer(String) from the type AlphaId
		//更詳細點來說 利用它才能建立屬於該類別的物件（object） 由類別所建立的物件稱為該類別的 instance。
		A.transfer(Id); //將第一個字母轉換成數字 規則請看wiki
		A.check(Id);	//檢查後面九碼是否符合規定，並告知使用者結果 規則請看wiki	
	}	
}
class AlphaId {
	int x1,x2;
	//檢查後面九碼是否符合規定，並告知使用者結果 規則請看wiki//
	void check(String Id) {  //如何把字串轉成陣列整數????可善用ASCII表直接將有在ASCII表中的字串對應的整數拿來用 
		 //判斷正確性//若依照老師上課的方法是多此一舉先轉陣列 例如宣告int IdArray[i] = AlphaId.charAt(i); IdDigit[i]=(int)(IdArray[i]-48);
	    int total = 0;
	    total += x1*1;//英文字母的轉換字元第一位要*1
	    total += x2*9;//英文字母的轉換字元第二位要*9
	    for(int i = 1,j = 8; i < Id.length(); i++,j--) {
	    	
	    	total += (Id.charAt(i)-48) * j;    //利用.charAt()取出字串位置的ASCII表中的十進位數字 然後減掉48 (因為在表中1=49,2=50..以此類推)
	    	if(j==0) {
	        total += (Id.charAt(i)-48) * 1;    //身分證最後一個字一樣要*1，規則請見wiki
	        }
	       // System.out.println(Id.charAt(i)+"\t"+"*"+j);//可印出此行檢查數字有沒有跑掉
	        }      
	   // System.out.println(total);//可印出此行檢查數字有沒有跑掉
	    
	    if(total%10 ==0){ //若total可以整除10代表正確 ，規則請見wiki
	        System.out.println("合格的身分證字號");
	    }else if(total%10 != 0){
	        System.out.println("無效的身分證字號");
	    }
	}
	//將第一個字母轉換成數字 規則請看wiki//
	void transfer(String alphaId) {
		System.out.println(alphaId.charAt(0)+"在官方規定之下可以解析為x1,x2兩個數字:(詳細規則請見wiki百科)");
		switch (alphaId.toUpperCase().charAt(0)) {
		case'A':
			x1=1;x2=0;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'B':
			x1=1;x2=1;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'C':
			x1=1;x2=2;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break; 
		case'D':
			x1=1;x2=3;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break; 
		case'E':
			x1=1;x2=4;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break; 
		case'F':
			x1=1;x2=5;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'G':
			x1=1;x2=6;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'H':
			x1=1;x2=7;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'I':
			x1=3;x2=4;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'J':
			x1=1;x2=8;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'K':
			x1=1;x2=9;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'L':
			x1=2;x2=0;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'M':
			x1=2;x2=1;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'N':
			x1=2;x2=2;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'O':
			x1=3;x2=5;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'P':
			x1=2;x2=3;
			System.out.println("x1 = "+x1+"\tx2 = "+x2);
			break;
		case'Q':
			x1=2;x2=4;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'R':
			x1=2;x2=5;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'S':
			x1=2;x2=6;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'T':
			x1=2;x2=7;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'U':
			x1=3;x2=8;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'V':
			x1=2;x2=9;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'W':
			x1=3;x2=2;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'Y':
			x1=3;x2=1;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		case'Z':
			x1=3;x2=3;
			System.out.println("x1 = "+x1+"\tx2 = "+x2); 
			break;
		default:
			System.out.println("輸入錯誤!");
			break;
		}
	}
}