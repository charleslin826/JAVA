package date0129;

import java.util.Scanner;  //�����Ҥ����аѦ�WIKI:
//https://zh.wikipedia.org/wiki/%E4%B8%AD%E8%8F%AF%E6%B0%91%E5%9C%8B%E5%9C%8B%E6%B0%91%E8%BA%AB%E5%88%86%E8%AD%89

public class T3_IdNumberIsTrueOrFalse {

	public static void main(String[] args) {
		String Id;
		do {//�NLine14-16��if..else������do..while�����~����J�i�H����
		System.out.println("�п�J�����Ҧr���P�_�O�_���T:");
		Scanner scn = new Scanner(System.in);	
		Id = scn.next(); //.next()�O�����r�� .nextInt()�O�������

		}while(Id.length()!=10);  
//		if(Id.length()!=10) {
//			System.out.println("��J���~!");  //�b�o�̴N���J���~����
//		}else {				
		AlphaId A = new AlphaId(); ///***�]��AlphaId�����O �n��new�@�Ӫ���~��ϥΥ����̭�����k 
		//EX:������JAlphaId.transfer(Id)�O�L�Ī�
		//���~ eclipse�|���Cannot make a static reference to 
		//the non-static method transfer(String) from the type AlphaId
		//��Բ��I�ӻ� �Q�Υ��~��إ��ݩ�����O������]object�^ �����O�ҫإߪ�����٬������O�� instance�C
		A.transfer(Id); //�N�Ĥ@�Ӧr���ഫ���Ʀr �W�h�Ь�wiki
		A.check(Id);	//�ˬd�᭱�E�X�O�_�ŦX�W�w�A�çi���ϥΪ̵��G �W�h�Ь�wiki	
	}	
}
class AlphaId {
	int x1,x2;
	//�ˬd�᭱�E�X�O�_�ŦX�W�w�A�çi���ϥΪ̵��G �W�h�Ь�wiki//
	void check(String Id) {  //�p���r���ন�}�C���????�i����ASCII�����N���bASCII�����r���������Ʈ��ӥ� 
		 //�P�_���T��//�Y�̷ӦѮv�W�Ҫ���k�O�h���@�|����}�C �Ҧp�ŧiint IdArray[i] = AlphaId.charAt(i); IdDigit[i]=(int)(IdArray[i]-48);
	    int total = 0;
	    total += x1*1;//�^��r�����ഫ�r���Ĥ@��n*1
	    total += x2*9;//�^��r�����ഫ�r���ĤG��n*9
	    for(int i = 1,j = 8; i < Id.length(); i++,j--) {
	    	
	    	total += (Id.charAt(i)-48) * j;    //�Q��.charAt()���X�r���m��ASCII�����Q�i��Ʀr �M��48 (�]���b��1=49,2=50..�H������)
	    	if(j==0) {
	        total += (Id.charAt(i)-48) * 1;    //�����ҳ̫�@�Ӧr�@�˭n*1�A�W�h�Ш�wiki
	        }
	       // System.out.println(Id.charAt(i)+"\t"+"*"+j);//�i�L�X�����ˬd�Ʀr���S���]��
	        }      
	   // System.out.println(total);//�i�L�X�����ˬd�Ʀr���S���]��
	    
	    if(total%10 ==0){ //�Ytotal�i�H�㰣10�N���T �A�W�h�Ш�wiki
	        System.out.println("�X�檺�����Ҧr��");
	    }else if(total%10 != 0){
	        System.out.println("�L�Ī������Ҧr��");
	    }
	}
	//�N�Ĥ@�Ӧr���ഫ���Ʀr �W�h�Ь�wiki//
	void transfer(String alphaId) {
		System.out.println(alphaId.charAt(0)+"�b�x��W�w���U�i�H�ѪR��x1,x2��ӼƦr:(�ԲӳW�h�Ш�wiki�ʬ�)");
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
			System.out.println("��J���~!");
			break;
		}
	}
}